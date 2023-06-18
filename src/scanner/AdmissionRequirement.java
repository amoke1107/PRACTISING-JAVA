package scanner;

import java.time.LocalDate;
import java.util.Scanner;

public class AdmissionRequirement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your name");
        String studentName = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in the year" + " " + year);
        System.out.println("enter your score");
        int studentScore = scanner.nextInt();
        if (studentScore >= 50){
            System.out.println("congratulations" + " " + studentName + " " + "You have been admitted");

        }
        else
        {
            System.out.println("You have not been admitted");

    }
    }
}