/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program8;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dudu
 */
public class Program8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many emplyoees will be registered? ");
        int numEmployee = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < numEmployee; i++) {
            System.out.println("Emplyoee #" + (i + 1));
            System.out.print("ID: ");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(name, salary, ID));
        }
        System.out.print("Enter the emplyoee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        System.out.println(emp);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double porcentage = sc.nextDouble();
            emp.salary(porcentage);
        }
        System.out.println();
        System.out.println("List of employees:");

        for (Employee obj : list) {

            System.out.println(obj);

        }

    }

}
