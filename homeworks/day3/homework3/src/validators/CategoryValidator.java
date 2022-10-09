package validators;

import java.util.Arrays;
import java.util.List;

import entities.Category;

public class CategoryValidator extends Validator {
    public static boolean isValidCategory(Category category) {
        List<String> exampleCategoryNames = Arrays.asList("category1", "category2", "category3");
        if (exampleCategoryNames.contains(category.getName())) {return false;}
        return true;
    }
}
