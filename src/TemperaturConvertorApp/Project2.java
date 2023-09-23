package TemperaturConvertorApp;
//--TEMPERATURE CONVERTOR APP--//
import java.util.Scanner;

public class Project2 {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
