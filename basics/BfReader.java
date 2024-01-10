import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BfReader
{
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = read.readLine();
        System.out.println("Enter your age:");
        int age = Integer.parseInt(read.readLine());
        System.out.println("Enter your height in ft:");
        float height = Float.parseFloat(read.readLine());
        System.out.println("Name : "+ name);
        System.out.println("Age : "+age);
        System.out.println("Height : "+height+" ft");
    }
}