/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Dudu
 */
public class Employee {

    private String name;
    private Double salary;
    private Integer id;

    public Employee(String name, Double salary, Integer id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void salary(double porcentage) {
        this.salary += salary * porcentage / 100;

    }

    public String toString() {
        return id + ", " + name + ", " + salary;
    }

}
