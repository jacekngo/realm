package io.github.wzieba.basementdiary;


import io.realm.RealmObject;

public class Book extends RealmObject {

    private int id;
    private String title;
    private String author;
    private String isbn;

    public Book() {
        //Required empty constructor
    }

    public Book(int id, String title, String author, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}
