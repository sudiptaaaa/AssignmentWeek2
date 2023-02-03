package Employee;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class User {
	public static void main(String args[])
	{
		int choice;
		List<Employee> data = new ArrayList();
		int empid,flag=0,index=0;
		String empname;
		double sal;
		
		do {
			System.out.println("Press:  \n1.To Insert \n2.To Display \n3.To Search \n4.To Delete \n5.To Update");
			System.out.print("Enter: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			//menu
			switch(choice)
			{
			case 1:
				//read user info and create new employee object and insert it in ArrayList.
				System.out.print("Enter employee ID: ");
				empid = sc.nextInt();
				System.out.print("Enter employee Name: ");
				empname = sc.next();
				System.out.print("Enter employee Salary: ");
				sal = sc.nextDouble();
				//create employee object
				Employee obj = new Employee(empid,empname,sal);
				//add the object in the array
				data.add(obj);
				//notify user data is added.
				System.out.println("Employee data has been added in the system");
				break;
			case 2:
				System.out.println("\n--EMPLOYEE DETAILS--");
				Iterator<Employee> itr = data.iterator();
				while(itr.hasNext())
					System.out.println(itr.next());
				break;
			case 3:
				//read empid from user to search for the employee in the data.
				System.out.print("Enter ID of the employee to be searched: ");
				empid = sc.nextInt();
				//iterate in the data and check.
				Iterator<Employee> itr1 = data.iterator();
				while(itr1.hasNext())
				{
					Employee temp = (Employee)itr1.next();
					if(temp.getEmpid() == empid)
					{
						flag=1;
						System.out.println("--Found--");
						System.out.println(temp);
						break;
					}
				}
				if(flag==0)
					System.out.println("Not such employee found");
				
				break;
			case 4:
				//read empid from user to search for the employee in the data.
				System.out.print("Enter ID of the employee to be deleted: ");
				empid = sc.nextInt();
				//iterate in the data and check.
				Iterator<Employee> itr2 = data.iterator();
				while(itr2.hasNext())
				{
					Employee temp = (Employee)itr2.next();
					if(temp.getEmpid() == empid)
					{
						flag=1;
						data.remove(temp);
						System.out.println("--Deleted--");
						break;
					}
				}
				if(flag==0)
					System.out.println("Not such employee found");
				
				break;
			case 5:
				//read empid from user to search for the employee in the data.
				System.out.print("Enter ID of the employee to be updated: ");
				empid = sc.nextInt();
				//iterate in the data and check.
				Iterator<Employee> itr3 = data.iterator();
				index=0;
				while(itr3.hasNext())
				{
					Employee temp = (Employee)itr3.next();
					index++;
					if(itr3.next().getEmpid() == empid)
					{
						flag=1;
						System.out.print("Enter employee ID: ");
						empid = sc.nextInt();
						System.out.print("Enter employee Name: ");
						empname = sc.next();
						System.out.print("Enter employee Salary: ");
						sal = sc.nextDouble();
						Employee obj2 = new Employee(empid,empname,sal);
						data.set(index, obj2);
						System.out.println("--Updated--");
						break;
					}
				}
				if(flag==0)
					System.out.println("Not such employee found");
				
				break;
			case 6:break;
			}
			
		}while(choice!=6);
	}

}

/*
Output:
Press:  
1.To Insert
2.To Display
3.To Search
4.To Delete
5.To Update
Enter: 1
Enter employee ID: 101
Enter employee Name: Sudipta
Enter employee Salary: 15000
Employee data has been added in the system
Press:
1.To Insert
2.To Display
3.To Search
4.To Delete
5.To Update
Enter: 3
Enter ID of the employee to be searched: 102
Not such employee found
 */