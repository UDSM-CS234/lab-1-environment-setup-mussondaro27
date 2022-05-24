package com.company;

public class Main {

    public static void main(String[] args) {
        double a = -9.81; // Earth's gravity in m/s^2
        double vi = 0.0;
        double t = 10.0;
        double xi = 0.0;
        double xt = 0.5*a*t*t+vi*t+xi;
        System.out.println("The object's position after " + t +
                " seconds is " + xt + " m.");
    }
}
