import emp.Empolyee;
import bouns.issueBouns;
public class demopackage
{
	public static void main(String[] args)
	{
		System.out.println("this program illustrates use of package...");
		Empolyee list[]=new Empolyee[3];
		for (byte i=0;i<list.length;i++)
			list [i]=new Empolyee();
		System.out.println("\n*******************************");
		System.out.println("empId\tempName\texpYears\tsalary");
		System.out.println("\n*******************************");
		for (byte i=0;i<list.length;i++){
			issueBouns.issueEmpolyeeBouns(list[i])
			list[i].getEmpolyee()
		}
		System.out.println("\n*******************************");
	}
}