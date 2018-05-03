package models;

import play.Logger;
import play.data.validation.Constraints;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TObject {
    @Constraints.Required
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Valid
    private List<Characteristic> characteristics = new ArrayList<>();

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }


    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TObject)) return false;
        TObject tObject = (TObject) o;
        return name.trim().equalsIgnoreCase(tObject.name.trim());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, characteristics);
    }

    boolean hasCharacteristic(Characteristic currentCharacteristic) {
        return this.characteristics.stream().anyMatch(characteristic -> characteristic.equals(currentCharacteristic));
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean hasAllCharacteristics(List<Characteristic> alreadyAskedCharacteristics) {
        Logger.debug("characteristics "+characteristics);
        Logger.debug("already asked "+alreadyAskedCharacteristics);
        return this.characteristics.stream().anyMatch(alreadyAskedCharacteristics::contains);
    }
}
