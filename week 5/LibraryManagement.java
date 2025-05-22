package com.bridgelabz.inheritance;

class Book{
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author=new Author("Java", 2017, "Debasis samantha", "Java is a programming language");
        author.displayDetails();
    }
}
