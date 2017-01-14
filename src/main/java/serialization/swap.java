package serialization;

import java.util.Arrays;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*int a=10;
     int b=20;
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("a "+a+ " b "+b);*/
	 
	String  arr[];//=new String[100];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array\n");
	int n=sc.nextInt();
	arr=new String[n];
	System.out.println("Enter String");
	for(int i=0;i<n;i++)
		arr[i]=sc.next();
	
	System.out.println("List:-\n"+Arrays.asList(arr));
	
	Arrays.sort(arr);
	
	System.out.println("Sorted:-\n"+Arrays.asList(arr));
		
	//System.out.println("please enter the value");
	
	/*for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
	System.out.println("value of array");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	*/
	}

}
