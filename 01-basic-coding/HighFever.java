
import java.util.ArrayList;
import java.util.List;

class Pair {
    String name;
    double temperature;

    public Pair(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }
}

/*
 * Problem: High Fever
 *
 * Intuition:
 * Employees with temperatures above 98.6°F are added
 * to the result list.
 *
 * Approach:
 * Traverse the employee details and compare each
 * temperature with 98.6. If it is greater, add the
 * employee's name to the result list.
 *
 * TC: O(n), where n is the number of employees.
 * SC: O(k) for the result list, where k is the number
 * of employees whose temperatures exceed 98.6°F.
 */

public class HighFever {

    public static List<String> checkEmployees(int n, Pair[] details) {
        List<String> employeesWithHighFever = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Pair employee = details[i];

            if (employee.temperature > 98.6) {
                employeesWithHighFever.add(employee.name);
            }
        }

        return employeesWithHighFever;
    }

    public static void main(String[] args) {
        int n = 4;

        Pair[] details = {
            new Pair("Peter", 98.9),
            new Pair("Ron", 98.5),
            new Pair("Cynthia", 99.0),
            new Pair("Sherry", 100)
        };

        List<String> employeesWithHighFever = checkEmployees(n, details);
        System.out.println(employeesWithHighFever);
    }
}
