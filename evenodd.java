package practice;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the elements=");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	

	}

}
