package mohiniPackage;

import java.util.Scanner;

public class Factorial_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=Sc.nextInt();
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
       System.out.println(factorial);
	}

}
