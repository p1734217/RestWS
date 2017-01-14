package serialization;

import java.util.Scanner;


public class Hello {
	
	public static void main(String args[]) {
		String s="mmababctamantlslmag";
	    int distinct = 0 ;
	    System.out.println("sssssst   "+s);
	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        } 
	        //if(distinct>1)
	        System.out.println(s.charAt(i)+"--"+distinct);
	        //System.out.println("a   "+s);
	        String d=String.valueOf(s.charAt(i));
	       // System.out.println("b   "+s);
	       // System.out.println("d   "+d);
	        s=s.replaceAll(d,"");
	       // System.out.println("c   "+s);
	        distinct = 0;
           i=0;
	    }
		
		
	}

}
