
import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{
    String EmpId;
    String EmpName;
    String EmpDepart;
    int EmpAge;

    @Override
    public void GetDetails() {
        System.out.println("ID: "+EmpId);
        System.out.println("NAME: "+EmpName);
        System.out.println("DEPARTMENT: "+EmpDepart);
        System.out.println("AGE: "+EmpAge);
        System.out.println("SHOWROOM NAME: ");
    }
    @Override
    public void SetDetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        EmpId=String.valueOf(uuid);
        System.out.println("==================== *** ENTER EMPLOYEE DETAILS *** =====================");
        System.out.println();
        System.out.println("EMPLOYEE NAME: ");
        EmpName=sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        EmpAge=sc.nextInt();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        EmpDepart=sc.nextLine();
        System.out.println("SHOWROOM NAME: ");
        ShowroomName=sc.nextLine();
    }
}
