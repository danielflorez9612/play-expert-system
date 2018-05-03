package models;

import play.data.validation.Constraints;

import java.util.Objects;

public class Characteristic {
    @Constraints.Required
    private String description;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Characteristic)) return false;
        Characteristic that = (Characteristic) o;
        return description.trim().equalsIgnoreCase(that.description.trim());
    }


    @Override
    public int hashCode() {

        return Objects.hash(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
