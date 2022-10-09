package validators;

import entities.Entity;

public class Validator {
    public static boolean isValidId(Entity entity) {
        if (entity.getId() > 0) {return true;}
        return false;
    }
}
