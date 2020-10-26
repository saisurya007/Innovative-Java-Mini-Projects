import java.util.Scanner;  // Scanner class helps to accept user input
import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;

public class Gross_Salary_Calculator {
    public static void main(String[] args) throws InterruptedException { // Here the Exception is mandatory if sleep() is to be used in the program

        System.out.println("Hello there!");
        sleep(1500); // Sleep method helps to control the execution of steps in this java code and make it more real
        System.out.println("Do you want to know your gross salary per annum ???");
        Scanner ip = new Scanner(System.in);
        String  uip1=ip.nextLine();
        sleep(2000);
        char euro='\u20AC';
        if(uip1.toLowerCase().equals("yes")) {
            System.out.println("Wow! That's cool. Let's begin :)");
            sleep(2000);
            System.out.println("Now tell us the number of hours you work weekly : ");
            int uip2 = ip.nextInt();
            sleep(2000);
            if (uip2 <= 20) {
                System.out.println("Wow! You're are a part time worker. You've the flexibility to utilize your off time on other important tasks");
            } else if (uip2 >= 20 && uip2 <= 40) {
                System.out.println("That's amazing! you got a full-time job to support you");
            } else {
                System.out.println("You truly are a gem of a millionaire. Your hard work definitely pays off");
            }
            sleep(2000);
            System.out.println("Now tell us a little bit more about your hourly wage. Ah Oh! Please kindly wait...");
            sleep(2000);
            System.out.println("Sincere apologies for the delay. It's a very busy day for us. Please kindly tell me about your hourly wage in "+euro+" : ");
            int uip3=ip.nextInt();
            sleep(2000);
            System.out.println("That's cool. Now...");
            sleep(2000);
            System.out.println("                    please tell us how many days a year are you off I mean your vacation days in a year : ");
            int uip4=ip.nextInt();
            int uip5=vac_weeks(uip4);
            sleep(2000);
            System.out.println("Thank you for all your time. ");
            sleep(2000);
            System.out.println("Your gross salary per annum is "+euro+" "+salary(uip2,uip3,uip5));
        }
        // Second condition if the user didn't like to go ahead with this application
        else {
            System.out.println("Sorry to know that your are uninterested in calculating your salary :(");
        }
    }

    // Function code for calculating salary

    public static int salary(int x, int y, int z){
        int vac_day =8;
        int salary = ((x*y)*(52 - z));
        return salary;
    }
    public static int vac_weeks(int x){
        int vw = x/7;
        return vw;
    }
}
