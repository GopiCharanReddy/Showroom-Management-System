
import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String CarName;
    String CarColor;
    String CarFuelType;
    int CarPrice;
    String CarType;
    String CarTransmission;
    @Override
    public void GetDetails() {
        System.out.println("CAR NAME: "+CarName);
        System.out.println("CAR COLOR: "+CarColor);
        System.out.println("FUEL TYPE(PETROL/DIESEL): "+CarFuelType);
        System.out.println("PRICE: "+CarPrice);
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHBACK): "+CarType);
        System.out.println("TRANSMISSION TYPE(AUTOMATIC/MANUAL): "+CarTransmission);
    }
    @Override
    public void SetDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================== *** ENTER CAR DETAILS *** ========================");
        System.out.println();
        System.out.println("CAR NAME: ");
        CarName=sc.nextLine();
        System.out.println("CAR COLOR: ");
        CarColor=sc.nextLine();
        System.out.println("FUEL TYPE(PETROL/DIESEL): ");
        CarFuelType=sc.nextLine();
        System.out.println("PRICE: ");
        CarPrice=sc.nextInt();
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        CarType=sc.nextLine();
        System.out.println("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        CarTransmission=sc.nextLine();
        TotalCarsInStock++;
    }
}
