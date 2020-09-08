package employee.data;

import java.util.Scanner;

public class MainEmployeeClass {
	

	public static void main(String[] args) {
		int option;

		Scanner sc = new Scanner(System.in);
		EmpManagement empManagement = new EmpManagement();

		do {
			System.out.println("Enter your option \n 1.Add record \n 2.Display record \n 3.Search record by id  \n 4.Delete record \n 5.Exit"); 
			option  = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter following details to add record");
				System.out.println("Enter ID :");
				int id = sc.nextInt();
				System.out.println("Enter Name :");
				String name = sc.next();
				System.out.println("Enter Department :");
				String department = sc.next();
				System.out.println("Enter Designation :");
				String designation = sc.next();
				System.out.println("Enter Salary :");
				int salary = sc.nextInt();
				empManagement.addRecord(new Employee(id, name, department,designation,salary));
				System.out.println("Record added.");
				break;

			case 2:
				empManagement.displayRecords();
				break;

			case 3: System.out.println("Enter the Employee ID to search :");
			id = sc.nextInt();
			empManagement.search(id);
			break;

			case 4:
				System.out.println("Enter ID to delete record");
				id = sc.nextInt();
				empManagement.delete(id);
				System.out.println("Record has been deleted");
				break;

			case 5:
				System.out.println("Exit the program");
				break;

			default: 
				System.out.println("Wrong option.");
			}

		}while(option!=5);
		sc.close();
	}
}






























































