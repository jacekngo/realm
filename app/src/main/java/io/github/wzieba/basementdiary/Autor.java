package io.github.wzieba.basementdiary;

import io.realm.RealmObject;

/**
 * Created by RENT on 2017-08-01.
 */

public class Autor extends RealmObject {
    int id;
    String name;
    String surname;

    public Autor() {
    }

    public Autor(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Autor name='" + name + " " + surname + '\'';
    }
}
