package com.codegym.shape.subclass;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle("indigo",false,3.5);
        System.out.println(circle2);
    }
}
