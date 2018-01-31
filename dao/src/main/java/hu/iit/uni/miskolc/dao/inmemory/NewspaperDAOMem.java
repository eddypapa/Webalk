package hu.iit.uni.miskolc.dao.inmemory;

import hu.iit.uni.miskolc.dao.NewspaperDAO;
import hu.iit.uni.miskolc.exception.InvalidIdException;
import hu.iit.uni.miskolc.exception.InvalidIssueException;
import hu.iit.uni.miskolc.exception.NewspaperNotFoundException;
import hu.iit.uni.miskolc.model.Newspaper;

import java.util.ArrayList;
import java.util.Collection;

public class NewspaperDAOMem implements NewspaperDAO {
    Collection<Newspaper> newspapers;

    public NewspaperDAOMem() throws InvalidIssueException {
        newspapers = new ArrayList<Newspaper>();
        newspapers.add(new Newspaper(1, "IPM", "DigitalIsland", 2018, 1));
        newspapers.add(new Newspaper(2, "GameStar", "ING", 2017, 11));
        newspapers.add(new Newspaper(3, "Pc World", "ING", 2016, 7));
    }

    public void addNewspaper(Newspaper newspaper) throws InvalidIssueException, InvalidIdException {
        for (Newspaper newspaper2: newspapers) {
            if (newspaper2.getId() == newspaper.getId()) {
                throw new InvalidIdException();
            }
        }
        newspapers.add(newspaper);
    }

    public void removeNewspaper(int id) {
        for (Newspaper newspaper: newspapers) {
            if (newspaper.getId() == id) {
                newspapers.remove(newspaper);
            }
        }
    }

    public Newspaper getNewspaperByName(String name) throws NewspaperNotFoundException {
        for (Newspaper newspaper: newspapers) {
            if (newspaper.getName().equals(name)) {
                return newspaper;
            }
        }
        throw new NewspaperNotFoundException();
    }

    public Collection<Newspaper> getAllNewspapers() {
        return newspapers;
    }
}
