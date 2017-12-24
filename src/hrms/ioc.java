package hrms_project;
import java.io.*;
import java.util.Scanner;

public class ioc {

	   public static void main(String args[]) throws IOException {  
	 
	      FileInputStream in = null;
	      FileOutputStream out=null;
	      Scanner sc=new Scanner(System.in);
	         out = new FileOutputStream("output.txt");
	         
	         int c;
	         for(int i=0;i<5;i++)
	         {
	         System.out.println("Enter details : ");
c=sc.nextInt();
     out.write(c);
	         }
	         out.close();
	         in = new FileInputStream("output.txt");
	         while((c = in.read()) != -1) {
	             System.out.println(c);
	         }
	      in.close();
	   }
}

