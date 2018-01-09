package training;

import java.util.*;
import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class ArrayLsitExample {
	public static void main(String args[])
	{
	  ArrayList<String> al=new ArrayList<String>();
	  al.add("Vijay");
	  al.add("Ajay");  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Sonoo"); 
	  al2.add("raj");  
	 al.addAll(al2);//adding second list in first list  
	 for(String obj:al)  
	 {
		    System.out.println(obj); 
	 }
	   
	}
}
