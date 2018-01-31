package hu.iit.uni.miskolc.dao;

import hu.iit.uni.miskolc.exception.InvalidIdException;
import hu.iit.uni.miskolc.exception.InvalidIssueException;
import hu.iit.uni.miskolc.exception.NewspaperNotFoundException;
import hu.iit.uni.miskolc.model.Newspaper;

import java.util.Collection;

public interface NewspaperDAO {

    void addNewspaper(Newspaper newspaper) throws InvalidIssueException, InvalidIdException;
    void removeNewspaper(int id);
    Newspaper getNewspaperByName (String name) throws NewspaperNotFoundException;

    Collection<Newspaper> getAllNewspapers();
}
