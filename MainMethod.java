package assignmentFunctions;
import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) 
	{
	     
		Scanner s= new Scanner(System.in);
		while(true)
		{
	   System.out.println("1.Cube ");
	   System.out.println("2.Square ");
	   System.out.println("3.Greaternum ");
	   System.out.println("4.Greaternumber ");
	   
	   System.out.print("Enter Your Choice :");
	   
	   int choice =s.nextInt();
	   
	   if(choice==0)
	   {
		   break;
	   }
		   
		 switch(choice){  
		 
		 case 1:
	     Question1 a= new Question1();
	         a.cube(2);
			break;
			 
		 case 2:	   
		   Question1 b= new Question1();
		  b.Square(22);
		  break;
			
		  case 3:
		   Question1 c= new Question1();
	        c.Greater(12, 4, 7);
	        break;
		  case 4:
			  Question2 d = new Question2();
			  d.Greater2(12,22,4);
			  d.Greater2(12,22,4);
			  d.Greater2(12,22,4);
			  
		  default:
              System.out.println("Invalid choice. Please try again.");
	   }
                    	
	
	}
	}
}


