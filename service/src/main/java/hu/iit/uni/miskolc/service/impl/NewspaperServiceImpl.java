package hu.iit.uni.miskolc.service.impl;

import hu.iit.uni.miskolc.dao.NewspaperDAO;
import hu.iit.uni.miskolc.exception.InvalidIdException;
import hu.iit.uni.miskolc.exception.InvalidIssueException;
import hu.iit.uni.miskolc.exception.NewspaperNotFoundException;
import hu.iit.uni.miskolc.model.Newspaper;
import hu.iit.uni.miskolc.service.NewspaperService;

import java.util.Collection;

public class NewspaperServiceImpl implements NewspaperService {
    NewspaperDAO dao;

    public NewspaperServiceImpl(NewspaperDAO dao) {
        this.dao = dao;
    }

    public void addNewspaper(Newspaper newspaper) throws InvalidIssueException, InvalidIdException {
        dao.addNewspaper(newspaper);

    }

    public void removeNewspaper(int id) throws InvalidIdException {
        if (id < 1) throw new InvalidIdException();
        dao.removeNewspaper(id);
    }

    public Newspaper getNewspaperByName(String name) throws NewspaperNotFoundException {
        return dao.getNewspaperByName(name);

    }

    public Collection<Newspaper> getAllNewspapers() {
        return dao.getAllNewspapers();
    }
}
