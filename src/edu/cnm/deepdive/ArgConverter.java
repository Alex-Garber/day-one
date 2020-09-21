package edu.cnm.deepdive;

public class ArgConverter {

  public static void main(String[] args) {
    double celsius = Double.parseDouble(args[0]);
    double fahrenheit = InputConverter.celsiusToFahrenheit(celsius);
    System.out.println(fahrenheit);
  }


}
