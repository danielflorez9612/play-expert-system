package models;

import play.Logger;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Guess {
    private List<TObject> guessingPool;
    private List<Characteristic> alreadyAskedCharacteristics;
    private Characteristic currentCharacteristic;

    public Characteristic getCurrentCharacteristic() {
        return currentCharacteristic;
    }

    public Guess(@NotNull List<TObject> objects) {
        guessingPool = objects;
        Logger.debug("The guessing pool starts in "+guessingPool);

        alreadyAskedCharacteristics = new ArrayList<>();
    }
    public int guessingPoolSize() {
        return guessingPool.size();
    }

    public TObject firstObject() {
        return guessingPool.get(0);
    }

    public void answer(boolean answer) {
        Logger.debug("The answer was "+answer);
        Logger.debug("The guessing pool when asking is "+guessingPool);
        Predicate<TObject> objectPredicate = tObject -> {
            Logger.debug("The predicate is the characteristic");
            return tObject.hasCharacteristic(currentCharacteristic);
        };
        if(!answer) objectPredicate=tObject -> {
            Logger.debug("The predicate is without the characteristic");
            return !tObject.hasCharacteristic(currentCharacteristic);
        };
        guessingPool = guessingPool.stream().filter(objectPredicate).collect(Collectors.toList());
        Logger.debug("The guessing pool is now "+guessingPool);
        alreadyAskedCharacteristics.add(currentCharacteristic);
    }
    private Characteristic nextCharacteristicOf(int index) {
        if(index>=guessingPool.size())return null;
        return guessingPool.get(index).getCharacteristics().stream().
                filter(characteristic -> !alreadyAskedCharacteristics.contains(characteristic))
                .findAny()
                .orElse(null);
    }
    public Optional<String> nextQuestion() {
        Characteristic characteristic=null;
        if(!guessingPool.isEmpty()) {
            for(int i = 0; i< guessingPool.size() && characteristic==null; i++) {
                characteristic = nextCharacteristicOf(i);
                currentCharacteristic = characteristic;
            }
        }
        return characteristic!=null?Optional.of(characteristic.getDescription() + "?") :Optional.empty();
    }

    public List<TObject> getGuessingPool() {
        return guessingPool;
    }


    public List<Characteristic> getAlreadyAskedCharacteristics() {
        return alreadyAskedCharacteristics;
    }
}
