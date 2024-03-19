package emp;
import java.util.Scanner;
public class Empolyee
{
	short empId;
	public int expYears;
	String empName;
	public float salary;
	public  Empolyee()
	{
		Scanner sc=new Scanner(System in);
		System.out.println("enter empolyee number");
		empId=Short parseShort(sc.next());
		System.out.println("enter empolyee name");
		empName=sc.next();
		System.out.println("enter empolyee gross salary");
		empId=Float parseFloat(sc.next());
		System.out.println("enter empolyee years of experince");
		empId=Integer parseInt(sc.next());
	}
	public void getEmpolyee
	{
		System.out.println(empId+"\t"+empName+"\t"+expYears+"\t"+salary");
	}
}
		