import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temprature: ");
        temp = scan.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C of F): ");
        unit = scan.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) +32;
        //                        Von Fahrenheit zu Celsius  Von Celsius zu Fahrenheit

        System.out.printf("%.1f°%s", newTemp, unit);



        scan.close();
    }
}
