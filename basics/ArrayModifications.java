
import java.io.*;
//import java.lang.*;
import java.util.*;

class ArrayModifications {
	public static void main (String[] args) 
	{
	    //modifying int value
	    int a = 10;
	    int b = a;
	    System.out.println("Before modifying b");
	    System.out.println("a: "+a);
	    System.out.println("b: "+b);
	    b = 20;
	    System.out.println("After modifying b");
	    System.out.println("a: "+a);
	    System.out.println("b: "+b);
	    
	    //modifying Array
	    int[] c ={0,1,2,3,4};
	    int[] d = c;
	    System.out.println("Before modifying d");
	    System.out.println("c: "+ Arrays.toString(c));
	    System.out.println("d: "+ Arrays.toString(d));
	    d[2]=10;
	    System.out.println("After modifying d");
	    System.out.println("c: "+ Arrays.toString(c));
	    System.out.println("d: "+ Arrays.toString(d));
	}
}
