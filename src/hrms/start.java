package hrms_project;


import java.util.Scanner;

public class start {
	Scanner sc=new Scanner(System.in);
void starting()
{
	admin1 A = new admin1();
	emp e=new emp();
	int q=1;
	while(q!=2)
	{
	System.out.println("\t\t         CODE      |          CHOICE         ");
	System.out.println("\t\t-------------------|-------------------------");
	System.out.println("\t\t         123       |      LOGIN BY ADMIN     ");
	System.out.println("\t\t         121       |     LOGIN AS EMPLOYEE   ");
	System.out.println("\t\t         000       |           EXIT          ");
	System.out.println("\n\n\t Enter Choice : ");
	int n=sc.nextInt();
	
	switch(n)
	{
	case 123 : 
		
		A.login();
		
	break;
	case 121 : 
		e.login();
		
		break;
	case 000 :
		System.exit(0);
		break;
		default :
			System.out.println("Wrong Choice !");
	}
	System.out.println("Do you wish to login again ? 1. YES 2. NO ");
	q=sc.nextInt();
	}
}

}


