package hu.iit.uni.miskolc.model;

import hu.iit.uni.miskolc.exception.InvalidIssueException;

public class Newspaper {
    private int id;
    private String name;
    private String publisher;
    private int year;
    private int issue;

    public Newspaper(int id, String name, String publisher, int year, int issue) throws InvalidIssueException {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.year = year;
        setIssue(issue);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) throws InvalidIssueException {
        if (issue < 1)
            throw new InvalidIssueException();
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", issue=" + issue +
                '}';
    }
}
