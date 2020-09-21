package edu.cnm.deepdive;

import java.util.Scanner;

public class InputConverter {


    public static void main(String[] args) {
        boolean running;
        Scanner input = new Scanner(System.in);
        running = true;
        while (running) {
            String userInput;
            
            System.out.println("Enter a temperature in degrees celsius (blank to quit)");
            userInput = input.nextLine();
            if (userInput.length() > 0) {
                double celsius;
                
                celsius = Double.parseDouble(userInput);
                System.out.print("Tempature in degrees Farenheit = ");
                System.out.println(celsiusToFahrenheit(celsius));
            } else {
                running = false;
            }
        }
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        
        fahrenheit = celsius * 9 / 5 + 32;
        
        return fahrenheit;
    }
}
