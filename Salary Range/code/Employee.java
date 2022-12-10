
           /* code for Employee salary range using if else statement*/

import java.util.*;
class Employee
{
    public static void main(String[] args)
	{
		int salary;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the salary");
		salary=s.nextInt();
		if(salary>=70000)
		{
			System.out.println("High salary:"+salary);
		}
		else if ((salary<70000)&&(salary>=50000))
		{
			System.out.println("Mid high salary:"+salary);
		}
		else if ((salary<50000)&&(salary>=25000))
		{
			System.out.println("mid salary:"+salary);
		}
		else if ((salary<25000)&&(salary>=15000))
		{
			System.out.println("low salary:"+salary);
		}
		else 
		{
			System.out.println("Your salary is too LOW:"+salary);
		}
	}
}