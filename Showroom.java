
import java.util.Scanner;

public class Showroom implements utility{
    String ShowroomName;
    String ShowroomAddress;
    int TotalEmployees;
    int TotalCarsInStock;
    String ManagerName;

    @Override
    public void GetDetails() {
        System.out.println("SHOWROOM NAME: "+ShowroomName);
        System.out.println("SHOWROOM ADDRESS: "+ShowroomAddress);
        System.out.println("MANAGER NAME: "+ManagerName);
        System.out.println("TOTAL EMPLOYEES: "+TotalEmployees);
        System.out.println("TOTAL CARS IN STOCK: "+TotalCarsInStock);
    }
    @Override
    public void SetDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== **** ENTER SHOWROOM DETAILS *** ====================");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        ShowroomName=sc.nextLine();
        System.out.println("SHOWROOM ADDRESS: ");
        ShowroomAddress=sc.nextLine();
        System.out.println("MANAGER NAME: ");
        ManagerName=sc.nextLine();
        System.out.println("TOTAL EMPLOYEES: ");
        TotalEmployees=sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK: ");
        TotalCarsInStock=sc.nextInt();
    }

}