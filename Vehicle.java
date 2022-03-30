package classes;
import java.util.Scanner;
public class masv {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vehicle car = new Vehicle();
        System.out.println("Enter car make:");
        car.carName = scanner.nextLine();

        System.out.println("Enter the average speed of the car:");
        car.avgSpeed = scanner.nextDouble();

        System.out.println("Enter consumption per 100 km:");
        car.fuelRate = scanner.nextDouble();

        System.out.println("Choose body type:");
        car.type = scanner.next();


        System.out.println("Travel distance:");
        double distance = scanner.nextDouble();


        System.out.println("Time to overcome a given distance for " + car.carName + " will be " + String.format("%.2f",car.TimeForTrip(distance)) + "ч. - " + String.format("%.0f",car.TimeForTrip(distance) * 60) + " minutes" +
                "\nThis will require " + car.FuelForTrip(distance)+ "l. fuel");

        System.out.println("\nParameters:");
        car.ShowParametrs();


    }


}
