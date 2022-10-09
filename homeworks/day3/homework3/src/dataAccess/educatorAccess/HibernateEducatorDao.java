package dataAccess.educatorAccess;

import entities.Educator;

public class HibernateEducatorDao implements EducatorDao {
    @Override
    public void add(Educator educator) {
        System.out.println("Added educator with Hibernate: " + educator.getName());
    }
}
