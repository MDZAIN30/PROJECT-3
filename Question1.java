
import java.util.Scanner;
public class Question1 
{
 Scanner s= new Scanner(System.in);
	void cube(int a) 
			{
				System.out.print("Enter the integer =");
				a=s.nextInt();
				System.out.println("The cube of "+a+" = "+(a*a*a));
				
			} 
			
			void Square(int b) 
			{
				System.out.print("Enter the integer =");
				b=s.nextInt();
				System.out.println("The Square of "+b+" = " + (b*b));
			}
			
			void Greater(int a,int b,int c)
			
			{
				System.out.print("Enter the integer 1st = ");
				a=s.nextInt();
				System.out.print("Enter the integer 2nd = ");
				b=s.nextInt();
				System.out.print("Enter the integer 3rd = ");
				c=s.nextInt();
				int Greaternum = Math.max(a,Math.max(b,c)) ;
				
				System.out.println("There greator number from ["+a+" ,"+b+" ,"+c+"] = "+Greaternum);
				
			}
			
			public static void main(String []args)
			
			{
				
				Question1 m= new Question1();
				m.cube(2);
				m.Square(22);
				m.Greater(12, 4, 7);
				
				
			}
			
	
}

	


	
   

