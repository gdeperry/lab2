package ru.mirea.lab2.ex1;

public class Author {

    private String Name, Email;
    private char Sex;

    public Author(String name, String email, char gender) {
        Name = name;
        Email = email;
        Sex = gender;
    }

    public String GetName(String name) {
        return name;
    }

    public String GetEmail(String email) {
        return email;
    }

    public void SetEmail(String email) {
        this.Email = email;
    }

    public char GetGender() {
        return Sex;
    }

    public String toString() {
        return this.Name + this.Email + this.Sex;
    }

    public void out() {
        System.out.println("Имя - "+Name + "; Почта - " + Email + "; Гендер - " + Sex+";");
    }
}