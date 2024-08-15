package com.model;

import java.util.Scanner;

public class Car {
    String color;
    String make;
    String model;

    public Car() {
        this.make = "";
        this.model = "";
        this.color = "";
    }

    public void display() {
        System.out.println("===Car details===");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter make: ");
        this.make = input.nextLine();
        System.out.print("Enter model: ");
        this.model = input.nextLine();
        System.out.print("Enter color: ");
        this.color = input.nextLine();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
