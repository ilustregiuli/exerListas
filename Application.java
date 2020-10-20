package exerListas;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registred?");
		int qntyEmployee = sc.nextInt();
		List <Employee> listEmployee = new ArrayList<>();
		for(int i = 0; i < qntyEmployee; i ++) {
			listEmployee.add(i,new Employee());
			System.out.println("Employee #" + (i+1) + ":");
			System.out.println("Id: ");
			listEmployee.get(i).setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Name: ");
			listEmployee.get(i).setName(sc.nextLine());
			System.out.println("Salary: ");
			listEmployee.get(i).setSalary(sc.nextDouble());
		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int empId = sc.nextInt();
		boolean findIt = false;
		for(int i = 0; i < listEmployee.size(); i ++) {
			if(listEmployee.get(i).getId() == empId) {
				findIt = true;
				System.out.println("Enter the percentage: ");
				listEmployee.get(i).increaseSalary(sc.nextDouble());
			} 
		} // end FOR	
		if(!findIt) {
			System.out.println("This id does not exist!");
			}
		System.out.println("List of emplyees: ");
		for(Employee listaEmp : listEmployee) {
			System.out.println(listaEmp.getId() + ", " + listaEmp.getName() + ", " + listaEmp.getSalary());
		}
		sc.close();
	}

}
