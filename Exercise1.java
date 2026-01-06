package Exercise1;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercise1 {
    public static void main(String args[]) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter fullname: ");
        String fullname = scanner.nextLine();
        
        System.out.println("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter hometown: ");
        String hometown = scanner.nextLine();
        
        System.out.println("Enter GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.println("Enter mayjor: ");
        String mayjor = scanner.nextLine();
        
        System.out.println("Enter scholarship: ");
        boolean scholarship = scanner.nextBoolean();
        scanner.nextLine();
        
        Date DayOfBirth;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter date of birth (dd/MM/yyyy): ");
        String input = scanner.nextLine();
        DayOfBirth = sdf.parse(input);
        
        System.out.println("\nFullname: " + fullname
                +"\nStudent ID: " + studentId
                +"\nHometown: " + hometown
                +"\nGPA: " + gpa
                +"\nMayjor: " + mayjor
                +"\nScholarship: " + scholarship
                +"\nDay of birth: " + sdf.format(DayOfBirth));
        
    }
}
