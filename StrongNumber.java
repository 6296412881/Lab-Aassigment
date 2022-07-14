package anudeep;

import java.util.Scanner;

public class StrongNumber {
	public static void main (String[] args) {
	int num,temp,count=0,rem,sum=0,i,fact;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to check strong or not :");
	num=sc.nextInt();
	//variable 
	temp=num;
	
	while(num>0)
	{
		rem=num%10;
		fact=1;
		for(i=1; i<=rem ;i++)
		{
			fact=fact*i;
			
		}
		sum+=fact;
		num=num/10;
	}
	if(sum== temp)
		System.out.println(temp+" is a strong number");
	else
		System.out.println(temp+" is not a strong number");
}

}
