package dataAccess.categoryAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Added category with Hibernate: " + category.getName());
    }
}
