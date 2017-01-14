package serialization;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
               System.out.println("hello");
               System.out.println("hello");
               System.out.println("hello");            
               System.out.println("hello");
               System.out.println("hello");
          Exception1 ob=new Exception1();           
               ob.hero();
               ob.countfun();
               ob.removespecial();
               ob.fibb();
             // ob.number();
              ob.mergesort();
	}

	 void hero()
     {
  	   System.out.println("hello");
     }
	  void countfun()
	 {
		 
		 String d;
		 String abc="sdfasgfsafasbgrbfd";//s-4 d-2 a-3  s-4 f-4 b-2 g-2 r-1
		 for(int i=0;i<abc.length();i++)
		 {
			 int count=0;
			 for(int j=0;j<abc.length();j++)
			 {
				 if(abc.charAt(i)==abc.charAt(j))
					 count++;
			 }
			 System.out.println(abc.charAt(i)+" "+count);
			 d=String.valueOf(abc.charAt(i)).toString();
			 abc=abc.replaceAll(d, "");
			 i=0;
			 
		 }
	 }
	  void removespecial()
	  {
		  String a="sdfa sgf            saf/ 7@#!ml;l'' '[[ip;a sbg rbf d";
		  a=a.replaceAll("[^a-zA-Z0-9]","");
		  System.out.println(a);
	  }
	  void fibb()
	  {
	   int n=10;
	  	int fib1=0,fib2=1,fib3;
	  	System.out.println("fibonacci series is ");
	  	System.out.print(fib1+" "+fib2);
	  	for(int i=2;i<n;i++){
	  		fib3=fib1+fib2;
	  		fib1=fib2;
	  		fib2=fib3;
	  		System.out.print(" "+fib3);
	  	}
	  	System.out.println();
	  }
	  void number()
	  {
	     int[] arr={1,2,3,5,6,8,10};
	     System.out.println("Please Enter the number");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int l=0, r=arr.length-1;
	  while(l<r)
	  {
		  if((arr[l]+arr[r])==n){
			System.out.println(arr[l]+" "+arr[r]);
			break;
		  }
		  else if((arr[l]+arr[r]) < n)
			  l++;
		  else
			  r--;
		  			  
	  }
	     
	  }
	  void mergesort()
	  {
		  int[] arr1={3,4,12,324,6,8,1};
		  int[] arr2={32,31,2};
		  int p=arr1.length+arr2.length;
		  int[] arr3=new int[p];
		  int i=0,j=0,k=0;
		  while(arr1[i]!='0' && arr2[k]!='0')
		  {
			  if(arr1[i] < arr2[k])
				  arr3[j++]=arr1[i++];
			  else
				  arr3[j++]=arr2[k++];
		  }
		  while(arr1[i]!='0')
			  arr3[j++]=arr1[i++];
		  while(arr2[k]!='0')
			  arr3[j++]=arr2[k++];
	  
		  System.out.println("sorted array is");
		  for(i=0;i<p-1;i++)
		  {
			 System.out.println(arr3[i]);
		  }
			  
	  }
	  
	  
}
