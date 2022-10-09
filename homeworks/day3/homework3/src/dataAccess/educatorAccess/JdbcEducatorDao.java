package dataAccess.educatorAccess;

import entities.Educator;

public class JdbcEducatorDao implements EducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Added educator with Jdbc: " + educator.getName());
    }
}
