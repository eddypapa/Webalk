package hu.iit.uni.miskolc.conroller;

import hu.iit.uni.miskolc.conroller.dto.NewspaperRequest;
import hu.iit.uni.miskolc.exception.InvalidIdException;
import hu.iit.uni.miskolc.exception.InvalidIssueException;
import hu.iit.uni.miskolc.exception.NewspaperNotFoundException;
import hu.iit.uni.miskolc.model.Newspaper;
import hu.iit.uni.miskolc.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;
import java.util.Collection;

@Controller
public class NewspaperController {

    NewspaperService service;

    public NewspaperController(NewspaperService service) {
        this.service = service;
    }

    @RequestMapping(value = "addnewspaper", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addNewspaper(@RequestBody NewspaperRequest newspaperRequest) throws InvalidIssueException, InvalidIdException {
        service.addNewspaper(new Newspaper(newspaperRequest.getId(), newspaperRequest.getName(), newspaperRequest.getPublosher(), newspaperRequest.getYear(), newspaperRequest.getIssue()));
    }

    @RequestMapping("getallnewspaper")
    @ResponseBody
    public Collection<Newspaper> getNewspapers() {
        return service.getAllNewspapers();
    }

    @RequestMapping("getnewspaperbyname/{name}")
    @ResponseBody
    public Newspaper getNewspaperByName(@PathVariable ("name") String name) throws NewspaperNotFoundException {
        return service.getNewspaperByName(name);
    }

    @RequestMapping("deletenewspaperbyid/{id}")
    @ResponseBody
    public void getNewspapers(@PathVariable ("id") int id) throws InvalidIdException {
        service.removeNewspaper(id);
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Buta Vagy! Nincs negativ ID.")
    @ExceptionHandler(value = InvalidIdException.class)
    public void invlaidIdExceptionHeandler() {
        System.out.printf("Szivas");
    }


}
