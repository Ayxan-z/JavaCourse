package dataAccess.categoryAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Added course with Jdbc: " + category.getName());
    }
}
