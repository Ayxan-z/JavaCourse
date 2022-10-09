package business;

import dataAccess.categoryAccess.CategoryDao;
import entities.Category;
import logging.Logger;
import validators.CategoryValidator;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if (!CategoryValidator.isValidId(category)) {
            throw new Exception("category id isn't valid");
        }
        if (!CategoryValidator.isValidCategory(category)) {
            throw new Exception("category isn't valid");
        }
        categoryDao.add(category);

        for (Logger logger: loggers) {
            logger.log(category.getName());
        }
    }
}
