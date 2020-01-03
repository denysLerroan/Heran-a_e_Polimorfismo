package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char response = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (response == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employee.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employee.add(emp);
			}

		}
		System.out.println("-------");
		System.out.println("PAYMENT:");
		for (Employee emp : employee) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}
}