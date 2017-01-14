package serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;

import javassist.bytecode.Descriptor.Iterator;

import org.apache.commons.collections.map.LinkedMap;

import antlr.collections.List;

public class Reversearray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h=new HashSet<Integer>(Arrays.asList(5,2,3,11,9));
/*		h.add(5);
		h.add(2);
		h.add(3);
		h.add(11);
		h.add(9);*/
                 java.util.Iterator<Integer> itr=h.iterator();  
                 //traversing elements of ArrayList object  
                 while(itr.hasNext()){   
                   System.out.println(itr.next());  
                 }   
              //   Collections.sort(h);
                 System.out.println("reverse list");
             
	}

}
