package employee.data;

import java.util.*;



public class EmpManagement {


	Set<Employee> employees = new LinkedHashSet<Employee>();

	Scanner sc = new Scanner(System.in);




	public void addRecord(Employee emp) {

		employees.add(emp);
	}

	public void displayRecords() {
		employees.forEach(emp -> System.out.println(emp));
	}

	

	public void search(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {

				System.out.println(employee);

			}
		}

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
	
		}



	

























