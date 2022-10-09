package business;

import dataAccess.educatorAccess.EducatorDao;
import entities.Educator;
import logging.Logger;

public class EducatorManager {
    private EducatorDao educatorDao;
    private Logger[] loggers;

    public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }

    public void add(Educator educator) {
        educatorDao.add(educator);

        for (Logger logger: loggers) {
            logger.log(educator.getName());
        }
    }
}
