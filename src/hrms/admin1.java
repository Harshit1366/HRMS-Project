package hrms_project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class admin1 implements LOGINS{
	
//	String a,b,c,d,e;121
	
	static int emp=0;
	int z=0,x;

	static Scanner sc = new Scanner(System.in);
	static List<String> fn=new ArrayList<String>();
	static List<String> ec=new ArrayList<String>();
	static List<String> de=new ArrayList<String>();
	static List<String> ds=new ArrayList<String>();
	static List<String> g=new ArrayList<String>();
	static List<String> pas=new ArrayList<String>();

	
	public static int getEmp() {
		return emp;
	}


	public static void setEmp(int emp) {
		admin1.emp = emp;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public static Scanner getSc() {
		return sc;
	}


	public static void setSc(Scanner sc) {
		admin1.sc = sc;
	}


	public List<String> getFn() {
		return fn;
	}


	public void setFn(List<String> fn) {
		admin1.fn = fn;
	}


	public List<String> getEc() {
		return ec;
	}


	public void setEc(List<String> ec) {
		admin1.ec = ec;
	}


	public List<String> getDe() {
		return de;
	}


	public void setDe(List<String> de) {
		admin1.de = de;
	}


	public List<String> getDs() {
		return ds;
	}


	public void setDs(List<String> ds) {
		admin1.ds = ds;
	}


	public List<String> getG() {
		return g;
	}


	public void setG(List<String> g) {
		admin1.g = g;
	}


	public List<String> getPas() {
		return pas;
	}


	public void setPas(List<String> pas) {
		admin1.pas = pas;
	}


/*	public static String getAnn() {
		return ann;
	}


	public static void setAnn(String ann) {
		admin1.ann = ann;
	}
*/

	public void login() {

		System.out.println("\t\tLOGIN PAGE \n\n");
		System.out.println("Please fill the following details :- \n");
		System.out.println("USERNAME : ");
		String user = sc.next();
		System.out.println("PASSWORD : ");
		String pass = sc.next();
		if ((user.equals("admin")) && (pass.equals("admin"))) {
			System.out.println("You are logged into your account !");
			System.out.println("\n\n\t\t*** WELCOME ADMIN ***");
			 do {
				 try{
					 System.out.println("\n\t1. ADD EMPLOYEE \n\t2. EDIT EMPLOYEE DETAILS\n\t3. VIEW EMPLOYEE \n\t"
					           + "4. DELETE EMPLOYEE\n\t5. LIST ALL EMPLOYEES\n\t6. MAKE ANNOUNCEMENT");
					 x = sc.nextInt();
						} catch (InputMismatchException e) {
						    System.out.print(e.getMessage());
						}
				
				
				switch (x) {
				case 1:
	                add();
					break;
				case 2:
					edit();
					break;
				case 3:
					search();
					break;
			    case 4:
					delete();
					break;
				case 5:
					list();
					break;
				case 6 :
					announce();

					break;
				default:
					System.out.println("THANKS ! ");

				}
				try{
					System.out.println("Do you wish to continue ? \t1. YES    2. NO");
					z = sc.nextInt();
	
				} catch (InputMismatchException e) {
				    System.out.print(e.getMessage());
				    sc.nextLine();
				}
					
				
			
		}while(z==1);
			if(z==2)
			{
				System.out.println("You are logged out ! ");
			}

		} else {
			System.out.println("\tINVALID LOGIN ID OR PASSWORD !\n\nPlease Login again");
			login();
		}
	}


	void add() {
	    
	 	System.out.println("Enter name : ");
		String a = sc.next();
		System.out.println("Enter employee code : ");
		String b = sc.next();
		System.out.println("Enter department : ");
		String c = sc.next();
		System.out.println("Enter designation : ");
		String d = sc.next();
		System.out.println("Enter employee's gender (Male/Female) : ");
		String e = sc.next();
		fn.add(a);
		ec.add(b);
		de.add(c);
		ds.add(d);
		g.add(e);
		pas.add(b);
		emp++;
	}

	void search() {
		System.out.println("Employee code : ");
		String co = sc.next();
		int z = ec.indexOf(co);
		if (z != -1) {
			System.out.println("Yes, the employee is present !");
			System.out.println("DETAILS :- \nEmployee Name : " + fn.get(z) + "\nEmployee Code : " + ec.get(z)
					+ "\nDepartment : " + de.get(z) + "\nDesignation : " + ds.get(z) + "\nGender : " + g.get(z));
		}
		else
		{
			System.out.println("The employee is not present !");
		}
	}

	void edit() {

		System.out.println("Employee code : ");
		String code = sc.next();
		int x=ec.indexOf(code);
		if (x != -1) {
		System.out.println("Enter the code of information to be edited : \n1. Employee Name \n2. Employee Code \n3. Department \n4. Designation \n5. Gender\n");
		System.out.println("Enter choice : ");
		int r=sc.nextInt();
		switch(r)
		{
		case 1 :
			System.out.println("Enter new name : ");
			String nn=sc.next();
			fn.set(x,nn);
			break;
		case 2 :
			System.out.println("Enter new code : ");
			String nc=sc.next();
			ec.set(x,nc);
			break;
		case 3 :
			System.out.println("Enter new department : ");
			String nd=sc.next();
			de.set(x,nd);
			break;
		case 4 : 
			System.out.println("Enter new designation : ");
			String dn=sc.next();
			ds.set(x,dn);
			break;
		case 5 :
			System.out.println("Enter your gender : ");
			String ng=sc.next();
			g.set(x,ng);
			break;
			default :
				System.out.println("Wrong Choice !");
		}
		}
		else
		{
			System.out.println("The employee is not present !");
	}
		
		
	}

	void delete() {
		
		System.out.println("Employee code : ");
		String cod = sc.next();
		int y=ec.indexOf(cod);
		if(y != -1)
		{
			fn.remove(y);
			ec.remove(y);
			de.remove(y);
			ds.remove(y);
			g.remove(y);
			System.out.println("The employee is deleted !");
			emp--;
		}
		else
		{
				System.out.println("The employee is not present !");
		}

	}

	void list() {
		System.out.println("\nNo. of employees present : "+emp);
		System.out.println(
				"\n\nEmployee Name \tEmployee Code \tDepartment \tDesignation \tGender  \tPassword\n"
				+ "--------------------------------------------------------------------------------------------------- ");
		if(emp==0)
		{
			System.out.println("\t\t\tThe List is empty!");
		}
		else
		{
		for(int i=0;i<emp;i++)
			{
			System.out.println(fn.get(i)+"\t\t"+ec.get(i)+"\t\t"+de.get(i)+"\t\t"+ds.get(i)+"\t\t"+g.get(i)+"\t\t"+pas.get(i));
			}
		}
	}
	
	static String ann;
	static void announce()
 {

 	System.out.println("Enter note to announce (please write the note with _ in between words ) : ");
 	ann=sc.nextLine();
	sc.next();
 	System.out.println("Your note is successfully added!");
		
 	
 }
   
    public void getann()
    {
    	//if(ann.equals(null))
    	//System.out.println("No note to display!");
    	//else
	   System.out.println("*** NOTE : "+ann+" ***");
    }
	
	/* static String ann;
		static void announce()
     {

     	System.out.println("Enter note to announce : ");
     	ann=sc.nextLine();
     	sc.next();
     	System.out.println("Your note is successfully added!");
			
     	
     }*/

    
	
/*	public List<String> getfn()
	{
		return fn;
	}
	public List<String> getec()
	{
		return ec;
	}
	public List<String> getde()
	{
		return de;
	}
	public List<String> getds()
	{
		return ds;
	}
	public List<String> getg()
	{
		return g;
	}
	*/
	
/*	void login1() {

		System.out.println("\t\tLOGIN PAGE \n\nNOTE : Username of employee is his/her name & password is his/her employee code !");
		System.out.println("Please fill the following details :- \n");
		System.out.println("USERNAME : ");
		String username = sc.next();
		System.out.println("PASSWORD : ");
		String password = sc.next();
		int a=fn.indexOf(username);
		
		if(a!=-1)
		{
		if (((password).equals(pas.get(a)))) {
			System.out.println("You are logged into your account !");
			System.out.println("\n\n\t\t*** WELCOME "+fn.get(a)+" ***");
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
    				emp e1=new emp();
    				e1.start();
    				try{  
    					  e1.join();  
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
			login1();
		}
		}
		else
		{
			System.out.println("Employee is not present!");
		}
	}
		
        void show(int a)
        {
        	System.out.println("DETAILS :- \nEmployee Name : " + fn.get(a) + "\nEmployee Code : " + ec.get(a)
			+ "\nDepartment : " + de.get(a) + "\nDesignation : " + ds.get(a) + "\nGender : " + g.get(a));
        } */
        
        
    /*    
        void password()
        {
        	System.out.println("Enter old password : ");
			String pass=sc.next();
			int q=pas.indexOf(pass);
			if(q!=-1)
			{
					if ((pass).equals(pas.get(q))) {
						System.out.println("Enter new password : ");
						String newp=sc.next();
						pas.set(q, newp);
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
        
       static String ann;
		void announce()
        {

        	System.out.println("Enter note to announce : ");
        	ann=sc.nextLine();
			
        	sc.next();
        }

       public void getann()
        {
    	   System.out.println("*** NOTE : "+ann+" ***");
        }
        */
        
}
