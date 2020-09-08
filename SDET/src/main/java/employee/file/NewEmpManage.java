package employee.file;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class NewEmpManage {

	Set<NewEmp> employees = new LinkedHashSet<NewEmp>();

	Scanner sc = new Scanner(System.in);

	public void addRecord(NewEmp emp) {

		employees.add(emp);
	}
	
	


	public void displayRecords() {
		employees.forEach(emp -> System.out.println(emp));
	}



	public void search(int id) {
		for (NewEmp employee : employees) {
			if (employee.getId() == id) {

				System.out.println(employee);

			}
		}

	}

	public void edit(int id) {
		for(NewEmp employee:employees)
		{
			if(employee.getId()==id)
			{ 

				System.out.println("Enter the field you want to edit:\n1.Id\n2.Name\n3.Department\n4.Designation\n5.Salary");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Id:");
					employee.setId(sc.nextInt());
					break;
				case 2:
					System.out.println("Enter Name:");
					employee.setName(sc.next());
					break;
				case 3:
					System.out.println("Enter Department:");
					employee.setDepartment(sc.next());
					break;
				case 4:
					System.out.println("Enter Designation:");
					employee.setDesignation(sc.next());
					break;
				case 5:
					System.out.println("Enter Salary:");
					break;

				default:
					System.out.println("Wrong Choice..!!");
					break;
				}


			}
		}

	}

	public boolean delete(int id) {
		for (NewEmp employee : employees) {
			if (employee.getId() == id) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}



	public void readfile() throws IOException 
	{
		int ch; 
		FileReader fr = null;
		try
		{ 
			fr = new FileReader("D:\\records.txt");
			while ((ch=fr.read())!=-1) 
				System.out.print((char)ch);
			fr.close(); 

		} 
		catch (FileNotFoundException fe) 
		{ 
			System.out.println("File not found"); 
		} 
	}
}


	




	
















