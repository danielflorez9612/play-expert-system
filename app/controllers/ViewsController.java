package controllers;

import models.TObject;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class ViewsController extends Controller {
    @Inject private WSClient client;
    @Inject private FormFactory formFactory;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public CompletionStage<Result> index() {
        return client.url("http://localhost:9000/api/ask").post(Json.toJson("")).thenApply(WSResponse::getBody).thenApply(s->ok(views.html.index.render(s)));
    }
    public Result create() {
        final Form<TObject> form = formFactory.form(TObject.class);
        return ok(views.html.create.render(form));
    }
}
