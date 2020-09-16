package ru.mirea.lab2.ex2;

public class Balltest {

    public static void main(String[] args) {
        Ball balla = new Ball(1,1);
        Ball ballb = new Ball(15,9);
        Ball ballc = new Ball(185,196);
        System.out.println(balla);
        System.out.println(ballb);
        System.out.println(ballc);
        balla.move(13,35);
        ballb.move(18,64);
        ballc.move(36,134);
        System.out.println(balla);
        System.out.println(ballb);
        System.out.println(ballc);
    }
}
