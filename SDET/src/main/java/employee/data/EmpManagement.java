package employee.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class EmpManagement {
	ArrayList<Employee> employees = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);

	

	public void addRecord(Employee emp) {
		employees.add(emp);
	}

	

	public void printAllEmpData() {
		employees.forEach(emp -> System.out.println(emp));
	}

	public boolean delete(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}

	public void search(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {

				System.out.println(employee);
			}
		}

	}



	
		
	}



