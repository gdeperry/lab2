package ru.mirea.lab2.ex1;

import ru.mirea.lab2.ex1.Author;

public class Authortest {
    public static void main(String[] args) {
        Author author1 = new Author("Max", "MaxVerstappen@rbr.com", 'm');
        Author author2 = new Author("luis", "LH44@gmail.com", 'm');
        Author author3 = new Author("Daniil", "daniil_dk@mail.ru",'m');
        System.out.println(author3);
        author1.out();
        author2.out();
        author3.out();
        System.out.println();
    }

}
