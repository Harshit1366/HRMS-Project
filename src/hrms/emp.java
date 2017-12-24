package hrms_project;
//import java.util.List;
//import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class emp extends admin1 implements Runnable,LOGINS{

	Random rand =new Random();
    static Scanner sc=new Scanner(System.in);
	int sum=0,n,a=0;
	public void run()
    {
		System.out.println("Which month attendance in year 2016 you want to see ? ");
		System.out.println("1. JANUARY\n2. FEBRUARY\n3. MARCH\n4. APRIL\n5. MAY\n6. JUNE\n7. JULY\n8. AUGUST\n9. SEPTEMBER\n10. OCTOBER"
				+ "\n11. NOVEMBER\n12. DECEMBER ");
		
    	System.out.println("Enter your choice : ");
    	n=sc.nextInt();
    	switch(n)
    	{
    	case 1:
    		a=31;
    		break;
    	case 2 :
    		a=28;
    		break;
    	case 3:
    		a=31;
    		break;
    	case 4 :
    		a=30;
    		break;
    	case 5 :
    		a=31;
    		break;
    	case 6 :
    		a=30;
    		break;
    	case 7:
    		a=31;
    		break;
    	case 8:
    		a=31;
    		break;
    	case 9:
    		a=30;
    		break;
    	case 10 :
    		a=31;
    		break;
    	case 11:
    		a=30;
    		break;
    	case 12 :
    		a=31;
    //		System.out.println("Record yet not updated!");
    		
    		break;
    		default :
    			System.out.println("Wrong Choice!");
    	}
    	int attend[]=new int[a];
    	for(int i=0;i<a;i++)
    	{
    		attend[i]=rand.nextInt(2)+0 ;
    		sum=sum+attend[i];
    		System.out.print("\nAttendance on "+(i+1)+"/"+n+"/2016 : ");
    		if(attend[i]==1)
    			System.out.print("Present");
    		else
    			System.out.print("Absent");
    		try {
    			Thread.sleep(100);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    	get_attend();
    }
	
	/*String ann;
	public static String getAnn() {
		return ann;
	}


	public static void setAnn(String ann) {
		this.ann = ann;
	}*/
    void get_attend()
    {
    System.out.println("\n\tTotal Attendance : "+sum+"/"+a);
    }
    
    public void login() {
int z=1;
		System.out.println("\t\tLOGIN PAGE \n\nNOTE : Username of employee is his/her name & default password is his/her employee code !");
		System.out.println("Please fill the following details :- \n");
		System.out.println("USERNAME : ");
		String username = sc.next();
		System.out.println("PASSWORD : ");
		String password = sc.next();
		int a=  admin1.fn.indexOf(username);  
		emp e1=new emp();
		Thread t=new Thread(e1);
		if(a!=-1)
		{
		if (((password).equals(admin1.pas.get(a)))) {
			System.out.println("You are logged into your account !");
			System.out.println("\n\n\t\t*** WELCOME "+admin1.fn.get(a)+" ***");
			getann();
            show(a);
             do{
    			System.out.println("\n\t 1. CHANGE PASSWORD \n\t 2. CHECK ATTENDANCE ");
    			int x=sc.nextInt();
    			switch(x)
    			{
    			case 1  : 
    				password();
    				break;
    			case 2:
    		
    			t.start();
    				try{  
    					  t.join();  
    					 }catch(Exception e){System.out.println(e);}
    				break;
    				default :
    					System.out.println("Wrong Choice !");
    			}
    			System.out.println("Do you wish to continue? 1. YES 2. NO ");
    			z=sc.nextInt();
    		}while (z != 2);
		} 
		else {
			System.out.println("\tINVALID LOGIN ID OR PASSWORD !\n\nPlease Login again");
			login();
		}
		}
		else
		{
			System.out.println("Employee is not present!");
		}
	}
		
        void show(int a)
        {
        	System.out.println("DETAILS :- \nEmployee Name : " + admin1.fn.get(a) + "\nEmployee Code : " + admin1.ec.get(a)
			+ "\nDepartment : " + admin1.de.get(a) + "\nDesignation : " + admin1.ds.get(a) + "\nGender : " + admin1.g.get(a));
        }
        
        void password()
        {
        	System.out.println("Enter old password : ");
			String pass=sc.next();
			int q=admin1.pas.indexOf(pass);
			if(q!=-1)
			{
					if ((pass).equals(admin1.pas.get(q))) {
						System.out.println("Enter new password : ");
						String newp=sc.next();
						admin1.pas.set(q, newp);
						System.out.println("Password changed successfully!");}
					else
					{
						System.out.println("Invalid password! Please enter again!");
						password();
					}
			}
			else
			{
				System.out.println("Employee is not present!");
			}
        }
        
        
}

