package assignmentFunctions;
 import java.util.Scanner;
public class Question2 
{
	
	Scanner s= new Scanner(System.in);

	void Greater2(int a,int b,int c)
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
	
	void Greater3(int a,int b)
	{
		System.out.print("Enter the integer 1st = ");
		a=s.nextInt();
		System.out.print("Enter the integer 2nd = ");
		b=s.nextInt();
		
		int Greaternum = Math.max(a,b) ;
		
		System.out.println("There greator number from ["+a+" ," + b+ "] = "+Greaternum);
			}
	void Greater4(int a,int b,int c)
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
	
	
	
}