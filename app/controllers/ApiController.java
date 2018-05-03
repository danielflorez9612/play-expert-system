package controllers;

import models.Characteristic;
import models.Guess;
import models.TObject;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ApiController extends Controller {
    private Guess guess;
    private List<Characteristic> characteristics;
    private List<TObject> objects;

    @Inject
    private
    FormFactory formFactory;

    public ApiController() {
        characteristics = new ArrayList<>();
        objects = new LinkedList<>();
    }

    public Result questionOrGuess() {
        if(guess==null) {
            guess = new Guess(objects);
        }
        DynamicForm form = formFactory.form().bindFromRequest();
        String answer = form.get("answer");
        Logger.debug(answer+" El objeto "+guess.getCurrentCharacteristic());
        if(answer!=null && guess.getCurrentCharacteristic()!=null) {
            guess.answer(Boolean.valueOf(answer));
            if(guess.guessingPoolSize()==0) {
                // No match at all
                Logger.debug("no found ");
                guess = new Guess(objects);
                return notFound(Json.toJson("No object matches"));
            }
            if(guess.guessingPoolSize()==1) {
                // Found something
                TObject found = guess.firstObject();
                Logger.debug("found "+found);
                if(found.hasAllCharacteristics(guess.getAlreadyAskedCharacteristics())){
                    guess = new Guess(objects);
                    return ok(Json.toJson(found));
                }else {
                    guess = new Guess(objects);
                    return notFound(Json.toJson("Run out of objects"));
                }
            }
        }
        return status(ACCEPTED, Json.toJson(guess.nextQuestion().orElse("No objects found")));
    }
    public Result allCharacteristics() {
        return ok(Json.toJson(characteristics));
    }
    public Result allObjects() {
        return ok(Json.toJson(objects));
    }
    public Result addObject() {
        Form<TObject> objectForm = formFactory.form(TObject.class).bindFromRequest();
        if(objectForm.hasErrors()){
            return badRequest(objectForm.errorsAsJson());
        }
        TObject nObject = objectForm.get();
        if(objects.contains(nObject)){
           return status(CONFLICT, Json.toJson("Already Existing object"));
        }
        nObject.getCharacteristics().forEach(characteristic -> {
            if(!characteristics.contains(characteristic)) {
                characteristics.add(characteristic);
            }
        });
        Logger.debug("adding");
        objects.add(nObject);
        guess = new Guess(objects);
        return created(Json.toJson(nObject));
    }
}
