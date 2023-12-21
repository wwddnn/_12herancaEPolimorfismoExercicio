package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* instantiate a list of employee */
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        /* iterate in program for collect the data employee*/
        for (int i = 0; i < n ; i++) {
            System.out.println("Emplyoee # " + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hs = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                /*instantiate a new OutsourcedEmployee ...
                ... and we add this OutsourcedEmployee to the list. */
                Employee emp = new OutsourceEmployee(name, hs, valuePerHour, additionalCharge);
                list.add(emp);
            }
            /* if this employee don't is OutsourcedEmployee ...
            * ... so we added this employee to the list */
            else {
                Employee emp = new Employee(name, hs, valuePerHour);
                list.add(emp);
            }
        }

        /* show the payments on the screen*/
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee emp : list ){
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }
    sc.close();
    }

}
