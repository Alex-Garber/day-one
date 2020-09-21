package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    double celsius = Double.parseDouble(args[0]);
    double fahrenheit = celsiusToFahrenheit(celsius);
    System.out.println(fahrenheit);
  }

  private static double celsiusToFahrenheit(double celsius) {
    return celsius * 9 / 5 + 32;
  }
}
