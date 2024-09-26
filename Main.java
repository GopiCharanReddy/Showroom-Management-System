
import java.util.*;

interface utility{
    public void GetDetails();
    public void SetDetails();
}

public class Main {
    static void MainMenu(){
        System.out.println();
        System.out.println("===================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** ==================== ");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE*** =============================== ");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("===================== *** ENTER 0 TO EXIT *** ==================== ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employees[]= new Employees[5];
        Cars cars[]= new Cars[5];
        int showroomCounter=0;
        int employeesCounter=0;
        int carsCounter=0;
        int choice =100;
        while (choice!=0){
            MainMenu();
            choice =sc.nextInt();

            while(choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                        showroom[showroomCounter]= new Showroom();
                        showroom[showroomCounter].SetDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1]. ADD NEW SHOWROOM");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 2:
                        employees[employeesCounter]=new Employees();
                        employees[employeesCounter].SetDetails();
                        employeesCounter++;
                        System.out.println();
                        System.out.println("2]. ADD NEW EMPLOYEE ");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 3:
                        cars[carsCounter]= new Cars();
                        cars[carsCounter].SetDetails();
                        carsCounter++;
                        System.out.println("3]. ADD NEW CAR ");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<showroomCounter;i++){
                            showroom[i].GetDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("0]. EXIT");
                        choice=sc.nextInt();
                        break;
                    case 5:
                        for(int i=0;i<employeesCounter;i++){
                            employees[i].GetDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("0]. EXIT");
                        choice=sc.nextInt();
                        break;
                    case 6:
                        for(int i=0;i<carsCounter;i++){
                            cars[i].GetDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("0]. EXIT");
                        choice=sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE :");
                        break;
                }
            }
        }
    }
}