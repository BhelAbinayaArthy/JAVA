
import java.io.*;

class Arthy {
	public static void main (String[] args) 
	{
	    //overflow
		int a= 131;
		//byte value from -128 to 127 so it will be a overflow 
		// so after 127 it starts from -128 and goes as -127,,-126,...
		byte b= (byte)a; //byte value from -128 to 127
		System.out.println(a); 
		System.out.println(b);
		//output
		//131
		//-125
		
		
		//Adding lower type variables
		
		byte c = 10;
		byte d = 20;
		byte e = (byte)(c+d); //10+20=30 is an integer 
		System.out.println(e);
	}
}