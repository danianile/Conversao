package com.company;

public class Conversao {

    public static void main(String[] args) {
	// write your code here
    }

    public static int celsiusKelvin(int x) {
        int result = x + 273;
        return result;
    }

    public static int kelvinCelsius(int x) {
        int result = x - 273;
        return result;
    }

    public static double metroKm(double x) {
        double result = x * 3.6;
        return result;
    }

    public static double kmMetro(double x) {
        double result = x / 3.6;
        return result;
    }

    public static double metroCm(double x) {
        double result = x * 100;
        return result;
    }

    public static double cmMetro(double x) {
        double result = x / 100;
        return result;
    }

    public static double segMin(double x) {
        double result = x / 60;
        return result;
    }

    public static double minSeg(double x) {
        double result = x * 60;
        return result;
    }

}
