package harshpatel_a1_hr;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Name: \n");
        String first_name = input.next();
        System.out.print("Enter Last Name: \n");
        String last_name = input.next();
        System.out.print("Enter Birth Month: \n");
        int BM = input.nextInt();
        System.out.print("Enter Birth Day: \n");
        int BD = input.nextInt();
        System.out.print("Enter Birth Year (4 digits): \n");
        int BY = input.nextInt();
        
        harshpatel_a1_HR heartrate = new harshpatel_a1_HR(first_name, 
                last_name, BM, BD, BY);
        
        System.out.print("Name: " + heartrate.get_fname() + " " + heartrate.get_lname() + "\n");
        System.out.print("Date of Birth: " + heartrate.get_b_month() + 
                "-" + heartrate.get_b_day() + "-" + heartrate.get_b_year() + ".\n");
        System.out.print("Age in years: " + heartrate.age() + ".\n");
        System.out.print("Maximum HeartRate for your age (BPM): " + 
                heartrate.HRM() +  "\n");
        System.out.print("Your ideal heart rate should be in the range of: " + 
                heartrate.target1() + " and " + 
                heartrate.target2() + " BPM.\n" + "Thank you for using this calculator, " + 
                heartrate.get_fname() + ".");     
    }
}
