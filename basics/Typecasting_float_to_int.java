import java.io.*;

class Arthy {
	public static void main (String[] args) 
	{
		float f=10;
		//typecasting float to integer
		int i = (int)f;
		f=i;
		f= f+i;//no problem in adding an integer to float
		i= i+(int)f; //should convert float to int 
		System.out.println("float: "+f);
		System.out.println("integer: "+i);
	}
}