import java.util.*;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the year:");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}