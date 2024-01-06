import java.util.*;

//login
 class login
{ 
     static String ac;
    static String def = "\u001B[0m";
    static String bold="\033[0;1m";
    static String blink ="\u001B[5m";
    static String yellow ="\u001B[33m";
    static String red = "\u001B[31m";
    static String blue = "\u001B[34m";
    static String green = "\u001B[32m";
    static String orange="\u001B[38;5;202m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static Scanner sc=new Scanner(System.in);
    static login obj=new login();
    String first_name="ram";
    String last_name="shetty";
    String gender="male";
    int c=0;
    private String mbno="9949669133";
    private String user_id="ram123";
    private String password="ram@123";
    void setid(String user_id)
    {
        this.user_id=user_id;
    }
    void setpin(String password)
    {
        this.password=password;
    }
    void setnumber(String mbno)
    {
        this.mbno=mbno;
    }
    void otp()
    {
        int x=(int)(Math.random()*(9999-1001+1)+1001);
        System.out.println(bold+green+"OTP is SENT TO YOUR NUMBER");
        System.out.println(bold+def+x);
        System.out.println(bold+blue+"ENTER YOUR OTP");
        System.out.print(def);
        int y=sc.nextInt();
        if(x==y)
        {
            System.out.println(bold+green+"OTP IS MATCHED");
        }
        else
        {
            System.out.println(bold+red+"WRONG OTP IS ENTERED");
            System.out.println("RE-ENTER THE OTP");
            obj.otp();
        }
    }
    void signup()
    {
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t******           SIGNUP              ******");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------"+"\n");
        boolean frname=true;
        while(frname)
        {
         int fr=0;
         System.out.print(bold+blue+"ENTER YOUR FIRST NAME    : ");
         System.out.print(def);
         this.first_name=sc.next();
         int size=this.first_name.length();
         for(int i=0;i<size;i++)
         {
		if(this.first_name.charAt(i)>='0' && this.first_name.charAt(i)<='9')
                {
			fr=1;
 			break;
 		}
         }
         if(fr==0)
         {
		frname=false;
         }
         else
         {
		System.out.println(bold+red+"INVALID INPUT");
                System.out.println(red+"RE-ENTER IT");
                System.out.print(def);
         }
        }
        boolean lsname=true;
        while(lsname)
        {
         int ls=0;
         System.out.print(bold+blue+"ENTER YOUR LAST NAME    : ");
         System.out.print(def);
         this.last_name=sc.next();
         int size=this.last_name.length();
         for(int i=0;i<size;i++)
         {
		if(this.last_name.charAt(i)>='0' && this.last_name.charAt(i)<='9')
                {
			ls=1;
 			break;
 		}
         }
         if(ls==0)
         {
		lsname=false;
         }
         else
         {
		System.out.println(bold+red+"INVALID INPUT");
                System.out.println(red+"RE-ENTER IT");
                System.out.print(def);
         }
        }
        boolean gen=true;
        while(gen)
        {
             System.out.print(bold+blue+"ENTER YOUR GENDER        : ");
             System.out.print(def);
          this.gender=sc.next();
          if(this.gender.equalsIgnoreCase("MALE") || this.gender.equalsIgnoreCase("FEMALE"))
	  {
            gen=false;
          }
          else
          {
            System.out.println(bold+red+"INVALID");
            System.out.println("RE-ENTER IT");
            System.out.print(def);
          }
        }
        System.out.print(def);
        System.out.print(bold+blue+"ENTER YOUR MOBILENUMBER    : ");
        System.out.print(bold+def+"+91 " );
        boolean d=true;
        while(d==true)
        {
            int n=0;
            String num=sc.next();
            int size=num.length();
            if(!(size==10))
            {
                n=1;
            }
            else
            {
               for(int i=1;i<size;i++)
 	       {
		if(!(num.charAt(i)>='0' && num.charAt(i)<='9'))
                {
			n=1;
		}
	       }
            }
            if(n==0)
	    {
		System.out.println(bold+green+"VALID");
                obj.setnumber(num);
                d=false;
	    }
	    else
            {
               System.out.println(bold+red+"INVALID");
               System.out.println(bold+red+"RE-ENTER THE NUMBER");
                System.out.print(bold+def+"+91 " );
            }
        }
        obj.otp();
        System.out.println(bold+green+"SUCCESSFULLY REGISTERED");
	System.out.println(bold+orange+"CREATE YOUR ACCOUNT"+"\n");
        System.out.print(bold+blue+"PLEASE ENTER YOUR USER_ID: ");
        System.out.print(def);
        obj.setid(sc.next());
        System.out.print(bold+blue+"ENTER YOUR PASSWORD: ");
        System.out.print(def);
        obj.setpin(sc.next());
        System.out.println(bold+green+"YOUR ACCOUNT IS CREATED"+"\n");
        System.out.println(bold+orange+"PLEASE ENTER 'CONTINUE' FOR SIGNIN"+"\n");
        System.out.println(bold+red+"ENTER 'EXIT' TO EXIT THE APPLICATION");
        boolean b=true;
        while(b)
        {
            System.out.print(def);
             ac=sc.next();
            if(ac.equalsIgnoreCase("CONTINUE"))
            {
                obj.signin();
                b=false;
            }
            else if(ac.equalsIgnoreCase("EXIT"))
            {
                   b=false;
                   break;
            }
            else
            {
                System.out.println(bold+red+"PLEASE ENTER 'CONTINUE' FOR SIGNIN");
                System.out.print(def);
            }
        }
    }
    void signin()
    {
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t******           SIGNIN              ******");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------"+"\n");
        System.out.print(bold+blue+"ENTER YOUR USER_ID   : ");
	System.out.print(def);
        String id=sc.next();
        System.out.print(bold+blue+"ENTER YOUR PASSWORD  : ");
	System.out.print(def);
        String pc=sc.next();
        if((pc.equals(password)) && id.equals(user_id))
        {
            ac="continue";
            System.out.println(bold+green+"DETAILS MATCHED");
	    System.out.print(def);
            System.out.println(bold+green+"LOGIN SUCCESSFULL");
	    System.out.print(def);
        }
        else 
        {
            c++;
            if(c>2)
            {
                System.out.println(bold+red+"YOUR ENTERED CREDENTIALS IS WRONG  MORETHAN 2 TIMES");
		System.out.println(bold+red+" PLEASE 'SIGNUP' AGAIN");
		obj.signup();
            }
            else
            {
              System.out.println(bold+red+"INVALID CREDENTILAS ");
              System.out.println("ENTER '1' FOR 'RESETING PASSWORD'");
              System.out.println("ENTER 'ANY ANOTHER NUMBER' FOR 'SIGNIN AGAIN'");
	      System.out.print(bold+blue+"ENTER YOUR OPTION:");
	      System.out.print(def);
	      int rs=sc.nextInt();
	      if(rs==1)
	      {
		System.out.print(bold+blue+"ENTER YOUR NEW PASSWORD:");
                System.out.print(def);
                obj.setpin(sc.next());
                System.out.println(bold+green+"PASSWORD IS UPDATED");
		System.out.print(def);
                obj.signin();
              }
              else
              {
		obj.signin();
               }
            }
        }
        
    }

}
//selection of bike 
class Bike
{
    static String bold="\033[0;1m";
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static String emoji="\uD83D\uDE00";
    static String bike="\uD83D\uDEB2";
    static String orange="\u001B[38;5;202m";
    static Scanner sc=new Scanner(System.in);
    static Bike ob=new Bike();
    static Cars ob3=new Cars();
    static double b=0;
    void Vehicle()
    {
         System.out.println();
         System.out.println(bold+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t****** DIFFERENT TYPES OF VEHICLES ******");
        System.out.println(bold+"\t\t\t\t\t    -------------------------------------"+"\n");
        System.out.println(bold+orange+"\t\t\t\t\t            "+bold+green+"1. Scooty "+"\n"+ "         \t\t\t\t\t    "+bold+yellow+"2. Bike "+"\n"+ " \t\t\t\t\t            "+bold+skblue+"3. EV Scooty"+"\n"+ " \t\t\t\t\t            "+bold+red+"4.CHANGE TO SECTION OF CARS"+"\n");
	System.out.print(def);
        System.out.println(bold+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t ******* PLEASE SELECT THE VEHICLE ******* ");
        System.out.println(bold+"\t\t\t\t\t    ------------------------------------");
	System.out.print(def);
        boolean K=true;
        while(K)
        {
         System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option :");
	 System.out.print(def);
          int n=sc.nextInt();
         switch(n)
         {
            case 1:SCOOTY();K=false;break;
            case 2:BIKES();K=false;break;
            case 3:EV_SCOOTY();K=false;break;
            case 4:ob3.Vehicle();K=false;break;
            default:
                System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
                System.out.println(bold+red+"PLEASE ENTER THE VALID NUMBER"+"\n");
		System.out.print(def);
                
         }
        }
        System.out.println(bold+def+"Choose the option required"+"\n"+bold+green+"1.To book another vehicle"+"\n"+bold+blue+"2. Proceed to the payment"+"\n"+bold+purple+"*---ENTER ANY KEY TO EXIT THE APPLICATION---*");
        System.out.println(bold+blue+"Enter your option : ");
	System.out.print(def);
        int b=sc.nextInt();
        if(b==1)
        {
            boolean h=true;
            while(h)
 	    {
              System.out.println(bold+def+"Enter 1 For 'Bikes' and enter 2 For 'Cars'");
              System.out.println(bold+blue+"Enter your option");
              System.out.print(def);
              int p=sc.nextInt();
	      switch(p)
	      {
                 case 1:
                      ob.Vehicle();
			h=false;
			break;
		 case 2:
			ob3.Vehicle();
			h=false;
			break;
		 default:
                     System.out.println(bold+red+"INVALID INPUT");
		     System.out.print(def);
	      }
	    }
        }
        else if(b==2)
        {
            //System.out.print(bold+green+"EXIT");
            //new Payment2();
	    Payment2 pay=new Payment2();
	    pay.payment(); 
            System.out.print(def);
        }
        else
        {
        }
    }
    //   method scooty//
    void SCOOTY()
    {
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t\t    ***** SCOOTYS *****");
        System.out.println(bold+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+"\t\t\t\t\t            "+bold+green+"1. SUZUKI ACCESS 125  "+"\n"+ "         \t\t\t\t\t    "+bold+yellow+"2. HONDA ACTIVA 6G  "+"\n"+ " \t\t\t\t\t            "+bold+skblue+"3. TVS JUPITER"+"\n"+"\t\t\t\t\t            "+bold+red+"4.PREVIOUS PAGE");
         boolean j=true;
         while(j)
        {
	System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option :");
	System.out.print(def);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.print(bold+def+"Total amount for selected hours = "+ SUZUKI_ACCESS_125()+"\n");
		    j=false;
                    break;
            case 2:System.out.print(bold+def+"Total amount for selected hours = "+ HONDA_ACTIVE_6G()+"\n");
                    j=false;
                    break;
            case 3:System.out.print(bold+def+"Total amount for selected hours = "+ TVS_JUPITER()+"\n");
		    j=false;
                    break;
	    case 4:
			ob.Vehicle();
          		j=false;
			break;
            default:
                    System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
                    System.out.println(bold+red+"PLEASE ENTER THE VALID NUMBER"+"\n");
		    System.out.print(def);;
        }
       }
    }
    double SUZUKI_ACCESS_125()
    {
        System.out.println(bold+def+"SUZUKI ACCESS125"+"\n");
        System.out.println(bold+def+"1 hour = 20/-"+"\n");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*20*bk;
        System.out.println("AMOUNT FOR SUZUKI_ACCESS_125:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double HONDA_ACTIVE_6G()
    {
        System.out.println(bold+def+"HONDA ACTIVE 6G"+"\n");
        System.out.println(bold+def+"1 hour = 50/-"+"\n");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*50*bk;
        System.out.println("AMOUNT FOR HONDA_ACTIVE_6G:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    double TVS_JUPITER()
    {
        System.out.println(bold+def+"TVS JUPITER"+"\n");
        System.out.println(bold+def+"1 hour = 25/-"+"\n");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours  : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*25*bk;
        System.out.println("AMOUNT FOR TVS JUPITER:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    // v     ---//
    void BIKES()
    {
        System.out.println(bold+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t\t  ****** BIKES ****** ");
        System.out.println(bold+"\t\t\t\t\t    -------------------------------------");
        //System.out.println(bold+blue"----- SPORTS BIKES -----"+"\n");
        System.out.println(bold+green+"\t\t\t\t\t            1. R1-5  "+"\n"+bold+yellow+ "         \t\t\t\t\t    2. NINJA  "+"\n"+ bold+skblue+" \t\t\t\t\t            3. YAMAHA"+"\n"+"\t\t\t\t\t            "+bold+red+"4.PREVIOUS PAGE");
	System.out.print(def);
        boolean j=true;
        while(j)
        {
	System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option : ");
	System.out.print(def);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.println(bold+def+"Total amount for selected hours = "+ R1_5()+"\n");
		   System.out.print(def);j=false;break;
            case 2:System.out.println(bold+def+"Total amount for selected hours = "+ NINJA()+"\n");
		   System.out.print(def);j=false;break;
            case 3:System.out.println(bold+def+"Total amount for selected hours = "+ YAMAHA()+"\n");
                    j=false;
		   System.out.print(def);break;
	    case 4:
			ob.Vehicle();
          		j=false;
			break;
            default:  
                    System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
		    System.out.print(def);
                    System.out.println(bold+red+"PLEASE ENTER THE VALID NUMBER ");
		    System.out.print(def);
          }
         }
    }
    double R1_5()
    {
        System.out.println(bold+def+"R1-5"+"\n");
        System.out.println(bold+def+"1 hour = 50/-"+"\n");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES :  ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*50*bk;
        System.out.println("AMOUNT FOR R1_5:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    double NINJA()
    {
        System.out.println(bold+def+"NINJA"+"\n");
        System.out.println(bold+def+"1 hour = 100/-");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES  : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*100*bk;
        System.out.println("AMOUNT FOR NINJA:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double YAMAHA()
    {
        System.out.println(bold+def+"YAMAHA"+"\n");
        System.out.println(bold+def+"1 hour = 70/-"+"\n");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*70*bk;
        System.out.println("AMOUNT FOR YAMAHA:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    //   Ev_scty //
    void EV_SCOOTY()
    {
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t\t   ***** EV-SCOOTY *****");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        //System.out.println("----- EV_SCOOTYS -----"+"\n");
        System.out.println("\t\t\t\t\t            "+bold+green+"1. EVOLET PONY  "+"\n"+ "         \t\t\t\t\t    "+bold+yellow+"2. OLA ELECTRIC  "+"\n"+ " \t\t\t\t\t            "+bold+skblue+"3. TVS iQUBE"+"\n"+"\t\t\t\t\t            "+bold+red+"4.PREVIOUS PAGE");
        boolean j=true;
        while(j)
        {
	System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option:  ");
       System.out.print(def);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.print(bold+def+"Total amount for selected hours =  "+ Evolet_Pony()+"\n");
		   j=false;break;
            case 2:System.out.print(bold+def+"Total amount for selected hours =  "+ OLA_ELECTRIC()+"\n");
		   j=false;break;
            case 3:System.out.print(bold+def+"Total amount for selected hours =  "+ TVS_iQube()+"\n");
		   j=false;break;
	    case 4:
			ob.Vehicle();
          		j=false;
			break;

            default:
                    System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
                    System.out.println(bold+red+"PLEASE ENTER THE VALID NUMBER"+"\n");
                System.out.print(def);
        }
  	}
    }
    double Evolet_Pony()
    {
        System.out.println(bold+def+"Evolet Pony"+"\n");
        System.out.println(bold+def+"1 hour = 50/-"+"\n");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*50*bk;
        System.out.println("AMOUNT FOR Evolet_pony:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double OLA_ELECTRIC()
    {
        System.out.println(bold+def+"OLA ELECTRIC"+"\n");
        System.out.println(bold+def+"1 hour = 30/-"+"\n");
        System.out.print(bold+skblue+"ENTER NUMBER OF BIKES : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*30*bk;
        System.out.println("AMOUNT FOR OLA_ELECTRIC:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double TVS_iQube()
    {
        System.out.println(bold+def+"TVS iQube"+"\n");
        System.out.println(bold+def+"1 hour = 50/-"+"\n");
        System.out.print(bold+blue+"ENTER NUMBER OF BIKES : ");
	System.out.print(def);
        int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
	System.out.print(def);
        int c=sc.nextInt();
        double sum=c*50*bk;
        System.out.println("AMOUNT FOR TVS_iQube:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    static void PERSON_DETAILS()
    {
        System.out.println(bold+def+"ENTER YOUR DETAILS");
        System.out.print(bold+blue+"ENTER YOUR NAME :");
	System.out.print(def);
        String user_name=sc.next();
        boolean b=true;
        while(b==true)
        {
             System.out.print(bold+blue+"ENTER YOUR ADHAAR NUMBER : ");
	     System.out.print(def);
             String aadhar=sc.next();
               if(aadhar.length()==12)
              {
                    b=false;
                    break;
              }
               else
              {
               System.out.println(bold+red+"INVALID AADHAR NUMBER");
              }
        }

      System.out.print(bold+blue+"ENTER YOUR LICENCE ID : ");
      System.out.print(def);
     boolean D=true;
	while(D)
	{
        String licence=sc.next();
        int size=licence.length();
	int k=0;
	if(!(size==16))
	{
		k=1;
	}
	else
	{
       		for(int i=0;i<size;i++)
		{	
			if(i==0 || i==1)
			{
				if(!(licence.charAt(i)>='A' && licence.charAt(i)<='Z'))
				{
					k=1;
				}
			}
			else
			{
				if(!(licence.charAt(i)>='0' && licence.charAt(i)<='9'))
				{
					k=1;
				}
			}	
		
		}
	}
	if(k==0)
	{
		System.out.println(bold+green+"valid");
                System.out.print(def);
		D=false;
                
	}
	else 
	{
		System.out.println(bold+red+"NOT VALID");
		D=true;
                System.out.println(bold+red+"RE-ENTER YOUR LICENCE ID NUMBER");
                System.out.print(def);
	}
	}
    }
}
//selection of cars
 class Cars extends Bike
{
    static String bold="\033[0;1m";
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static String emoji="\uD83D\uDE00";
    static String bike="\uD83D\uDEB2";
    static String orange="\u001B[38;5;202m";
    static Scanner sc=new Scanner(System.in);
    static Cars ob1=new Cars();
    void Vehicle ()
    {
         System.out.println();
         System.out.println( bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t****** DIFFERENT TYPES OF VEHICLES ******");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------"+"\n");
        System.out.println(bold+green+"\t\t\t\t\t            1. Mini "+"\n"+bold+yellow+ "         \t\t\t\t\t    2. Sedan "+"\n"+bold+skblue+" \t\t\t\t\t            3. Suv"+"\n"+bold+red+"\t\t\t\t\t            4.CHANGE TO SECTION OF SECTION OF BIKES "+"\n");
        System.out.println(bold+def+"\t\t\t\t\t   -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t******* PLEASE SELECT THE VEHICLE ******* ");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        boolean K=true;
        while(K)
        {
	System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option :  ");
        System.out.print(def);
        int n=sc.nextInt();
         switch(n)
         {
            case 1:MINI();K=false;break;
            case 2:SEDAN();K=false;break;
            case 3:SUV();K=false;break;
	    case 4:ob.Vehicle();K=false;break;
            default:
                System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
                System.out.println(bold+red+"PLEASE ENTER THE VALID NUMBER"+"\n");
				
         }
       }
        System.out.println(bold+blue+"choose the required option");
        System.out.print(def);
        System.out.println(bold+orange+"1.to book another vehicle"+"\n"+bold+orange+"2.Proceed to the payment"+"\n"+bold+purple+"*---ENTER ANY KEY TO EXIT THE APPICATION---*");
	System.out.print(bold+blue+"Enter your option :");
        System.out.print(def);
        int b=sc.nextInt();
        if(b==1)
        {
            boolean h=true;
            while(h)
 	    {
              System.out.println(bold+def+"Enter 1 For 'Bikes' and enter 2 For 'Cars'");
              System.out.println(bold+blue+"Enter your option");
              System.out.print(def);
              int p=sc.nextInt();
	      switch(p)
	      {
                 case 1:
                       ob.Vehicle();
			h=false;
			break;
		 case 2:
			ob1.Vehicle();
			h=false;
			break;
		 default:
                     System.out.println(bold+red+"INVALID INPUT");
		     System.out.print(def);
	      }
	    }
        }
       
	else if(b==2)
        {
	    Payment2 pay=new Payment2();
	    pay.payment();
        }
        else
        {
        }
    }
    void MINI()
    {
        System.out.println( "\t\t\t\t\t    -------------------------------------");
        System.out.println(
                bold+red+"\t\t\t\t\t\t    ***** TYPE OF CARS *****");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+green+"\t\t\t\t\t            1. TATA PUNCH  "+"\n"+bold+yellow+ "         \t\t\t\t\t    2. HYUNDAI NIOS  "+"\n"+ bold+skblue+" \t\t\t\t\t            3. MARUTHI SWIFT"+"\n"+"\t\t\t\t\t            "+bold+red+"4.PREVIOUS PAGE");
         boolean j=true;
        while(j)
        {
	System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option :  ");
        System.out.print(def);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.print(bold+def+"Total amount for selected hours =  "+ TATA_PUNCH()+"\n");
                    j=false;break;
            case 2:System.out.print(bold+def+"Total amount for selected hours =  "+ HYUNDAI_NIOS()+"\n");
                    j=false;break;
            case 3:System.out.print(bold+def+"Total amount for selected hours =  "+ MARUTHI_SWIFT()+"\n");
                    j=false;break;
	    case 4:
			ob1.Vehicle();
          		j=false;
			break;
            default:
                    System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
                    System.out.println(bold+blue+"PLEASE ENTER THE VALID NUMBER"+"\n");
        }
       }
    }
    double TATA_PUNCH()
    {
        System.out.println("TATA PUNCH"+"\n");
        System.out.println(bold+def+"1 hour = 125/-"+"\n");
		System.out.print(bold+blue+"Enter Number of Cars : ");
          System.out.print(def);
		int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
         System.out.print(def);
        int c=sc.nextInt();
        double sum=c*125*bk;
        System.out.println("AMOUNT FOR TATA_PUNCH:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    double HYUNDAI_NIOS()
    {
        System.out.println("HYUNDAI NIOS"+"\n");
        System.out.println(bold+def+"1 hour = 150/-"+"\n");
		System.out.print(bold+blue+"Enter Number of Cars :  ");
              System.out.print(def);
		int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
         System.out.print(def);
        int c=sc.nextInt();
        double sum=c*150*bk;
        System.out.println("AMOUNT FOR HYUNDAI_NIOS:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double MARUTHI_SWIFT()
    {
        System.out.println("MARUTHI SWIFT"+"\n");
          System.out.print(def);
        System.out.println("1 hour = 100/-"+"\n");
		System.out.print(bold+blue+"Enter Number of Cars: ");
        System.out.print(def);
		int bk=sc.nextInt();
        System.out.println(bold+blue+"Enter The Number of Hours : ");
         System.out.print(def);
        int c=sc.nextInt();
        double sum=c*100*bk;
        System.out.println("AMOUNT FOR MARUTHI SWIFT:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    // v     ---//
    void SEDAN()
    {
        System.out.println(bold+def+ "\t\t\t\t\t    -------------------------------------");
        System.out.println(
                bold+red+"\t\t\t\t\t\t  ****** TYPES OF CARS ****** ");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+green+"\t\t\t\t\t\t   1. HONDA CITY "+"\n"+ bold+yellow+"\t\t\t\t\t\t   2. TOYOTA CAMRY "+"\n" +bold+skblue+"\t\t\t\t\t\t   3. NISSAN VERSA "+"\n"+"\t\t\t\t\t            "+bold+red+"4.PREVIOUS PAGE");
        boolean j=true;
        while(j)
       {
	System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option :  ");
		System.out.print(def);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.print(bold+def+"Total amount for selected hours ="+HONDA_CITY()+"\n");j=false;break;
            case 2:System.out.print(bold+def+"Total amount for selected hours ="+ TOYOTA_CAMRY()+"\n");j=false;break;
            case 3:System.out.print(bold+def+"Total amount for selected hours ="+ NISSAN_VERSA()+"\n");j=false;break;
	    case 4:
			ob1.Vehicle();
          		j=false;
			break;
            default:  
                    System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
                    System.out.println(bold+blue+"PLEASE ENTER THE VALID NUMBER "+"\n");
        }
      }
    }
    double HONDA_CITY()
    {
        System.out.println("HONDA CITY"+"\n");
        System.out.println("1 hour = 190/-"+"\n");
	System.out.print(bold+blue+"Enter Number of Cars : ");
		System.out.print(def);
	int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours :  ");
		System.out.print(def);
        int c=sc.nextInt();
        double sum=c*190*bk;
        System.out.println("AMOUNT FOR HONDA_CITY:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double TOYOTA_CAMRY()
    {
        System.out.println("TOYOTA CAMRY"+"\n");
        System.out.println("1 hour = 110/-"+"\n");
		System.out.print(bold+blue+"Enter Number of Cars : ");
		System.out.print(def);
		int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
		System.out.print(def);
        int c=sc.nextInt();
        double sum=c*110*bk;
        System.out.println("AMOUNT FOR TOYOTA_CAMRY:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double NISSAN_VERSA()
    {
        System.out.println("NISSAN_VERSA"+"\n");
        System.out.println("1 hour = 180/-"+"\n");
		System.out.print(bold+blue+"");
		System.out.print(bold+blue+"Enter Number of Cars : ");
		System.out.print(def);
		int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
		System.out.print(def);
        int c=sc.nextInt();
        double sum=c*180*bk;
        System.out.println("AMOUNT FOR NISSAN_VERSA:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    //   suv //
    void SUV()
    {
        System.out.println(bold+def+ "\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+red+"\t\t\t\t\t          ***** SUV CARS *****         ");
        System.out.println(bold+def+"\t\t\t\t\t    -------------------------------------");
        System.out.println(bold+green+"\t\t\t\t\t            1. KIA RIO  "+"\n"+bold+yellow+"         \t\t\t\t\t    2. FORD_ENDEVOUR "+"\n"+ bold+skblue+" \t\t\t\t\t            3. FORD EXPLORER"+"\n"+"\t\t\t\t\t            "+bold+red+"4.PREVIOUS PAGE");
        boolean j=true;
        while(j)
        {
	System.out.print(bold+blue+"\t\t\t\t\t\tEnter your Option :");
		System.out.print(def);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.println(bold+def+"Total amount for selected hours ="+ KIA_RIO()+"\n");j=false;break;
            case 2:System.out.println(bold+def+"Total amount for selected hours ="+ FORD_ENDEVOUR()+"\n");j=false;break;
            case 3:System.out.println(bold+def+"Total amount for selected hours ="+ FORD_EXPLORER()+"\n");j=false;break;
	    case 4:
			ob1.Vehicle();
          		j=false;
			break;
            default:
                    System.out.println(bold+red+"YOU HAVE ENTERED THE INVALID NUMBER"+"\n");
                    System.out.println(bold+red+"PLEASE ENTER THE VALID NUMBER"+"\n");
        }
       }
    }
    double KIA_RIO()
    {
        System.out.println("KIA RIO"+"\n");
        System.out.println("1 hour = 220/-"+"\n");
		System.out.print(bold+blue+"Enter Number of Cars : ");
		System.out.print(def);
		int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
		System.out.print(def);
        int c=sc.nextInt();
        double sum=c*220*bk;
        System.out.println("AMOUNT FOR KIA_RIO:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b; 
    }
    double FORD_ENDEVOUR()
    {
        System.out.println(bold+def+"FORD_ENDEVOUR"+"\n");
        System.out.println("1 hour = 195/-"+"\n");
		System.out.print(bold+def+"Enter Number of Cars : ");
		System.out.print(def);
		int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
        System.out.print(def);
        int c=sc.nextInt();
        double sum=c*195*bk;
        System.out.println("AMOUNT FOR FORD_ENDEVOUR:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    double FORD_EXPLORER()
    {
        System.out.println(bold+def+"FORD EXPLORER"+"\n");
		System.out.print(def);
        System.out.println("1 hour = 270/-"+"\n");
		System.out.print(bold+blue+"Enter Number of Cars : ");
		System.out.print(def);
		int bk=sc.nextInt();
        System.out.print(bold+blue+"Enter The Number of Hours : ");
		System.out.print(def);
        int c=sc.nextInt();
        double sum=c*270*bk;
        System.out.println("AMOUNT FOR FORD EXPLORER:"+sum);
        b+=sum;
        PERSON_DETAILS();
        return b;  
    }
    static void PERSON_DETAILS()
    {
        System.out.println(bold+def+"ENTER YOUR DETAILS");
        boolean name=true;
        while(name)
        {
         int fl=0;
         System.out.print(bold+blue+"ENTER YOUR FULL NAME : ");
         System.out.print(def);
         String full_name=sc.next();
         int size=full_name.length();
         for(int i=0;i<size;i++)
         {
		if(full_name.charAt(i)>='0' && full_name.charAt(i)<='9')
                {
			fl=1;
 			break;
 		}
         }
         if(fl==0)
         {
		name=false;
         }
         else
         {
		System.out.println(bold+red+"INVALID INPUT");
                System.out.println(red+"RE-ENTER IT");
                System.out.print(def);
         }
        }
        boolean b=true;
        while(b==true)
        {
             System.out.print(bold+blue+"ENTER YOUR ADHAAR NUMBER : ");
		System.out.print(def);
             String aadhar=sc.next();
              if(aadhar.length()==12)
              {
                    b=false;
                    break;
              }
               else
              {
               System.out.println(bold+red+"INVALID AADHAR NUMBER");
              }
        }
      System.out.print(bold+blue+"ENTER YOUR LICENCE ID :");
      System.out.print(def);
      boolean D=true;
	while(D)
	{
       String licence=sc.next();
        int size=licence.length();
	int k=0;
	if(!(size==16))
	{
		k=1;
	}
	else
	{
       		for(int i=0;i<size;i++)
		{	
			if(i==0 || i==1)
			{
				if(!(licence.charAt(i)>='A' && licence.charAt(i)<='Z'))
				{
					k=1;
				}
			}
			else
			{
				if(!(licence.charAt(i)>='0' && licence.charAt(i)<='9'))
				{
					k=1;
				}
			}	
		
		}
	}
	if(k==0)
	{
		System.out.println(bold+green+"valid");
		D=false;
                
	}
	else 
	{
		System.out.println(bold+red+"NOT VALID");
		D=true;
                System.out.println(bold+red+"RE-ENTER YOUR LICENCE ID NUMBER");
               System.out.print(def);
	}
	}
    }

}
//payment......................
interface Payment
{
	int pin = 1234;
	void phonepay(double amount);
	void gpay(double amount);
}
abstract class ptm
{
  abstract void paytm(double amount);
}
class Payment2 extends ptm implements Payment
{
    static String bold="\033[0;1m";
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static String emoji="\uD83D\uDE00";
    static String bike="\uD83D\uDEB2";
	static double balance = 1000000;
	static Scanner s = new Scanner(System.in);
        Cars object=new Cars();
  	public void phonepay(double amount)
  	{
                System.out.println("\t\t\t\tAMOUNT:"+object.b);
		System.out.print(bold+blue+"\n\t\t\t\tEnter pin : ");
                System.out.print(def);
		int pin = s.nextInt();
		if(Payment.pin==pin)
		{	
  			if(balance>=amount)
   			{
     				if(amount>=1000)
	     			{
      					balance = balance-(amount);
      					//System.out.println("\n\t\t\t\tyou have to 20/- as gst");
     				}
      				else
      				{
       					balance = balance-amount;
      				}
     				System.out.println(bold+green+"\n\t\t\t\t\t\tYOUR TRANSACTIONS IS SUCCESSFUL");
				System.out.println(bold+green+"\n\t\t\t\t\t\tYOUR ORDER IS CONFIRMED"); 
				System.out.println(bold+purple+"\n\t\t\t\t\t\tLOCATION :  COLLECT YOUR VEHICLE ");
				System.out.println("\t\t\t\t*-----------------------------------------------------------*");
				System.out.println(bold+red+"\n\t\t\t\t\t\tAt  ELITE RENTALS,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tROAD NO-1,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tKPHB , HYDERABAD .");
                                System.out.println(bold+red+"\n\t\t\t\t\tFOR ENQUIRY CONTACT:7032566589,");
				System.out.println(bold+blue+"\n\t\t\t\t\t\tEMAIL:eliterentals@gmail.com ..");
				System.exit(0);
     				
   			}
   			else
   			{
   				System.out.println(bold+red+"\n\t\t\t\tyou don't have sufficient balance");
				System.out.print(def);
   			}
		}
		else
		{
			System.out.println(bold+red+"\n\t\t\t\tInvalid Pin");
			System.out.println(bold+red+"\n\t\t\t\tPlease re-enter the pin");
			System.out.print(def);
			phonepay(amount);
		}
  	}
	public void gpay(double amount)
 	{
                System.out.println("\t\t\t\tAMOUNT:"+object.b);
   		System.out.print(bold+blue+"\n\t\t\t\tEnter pin : ");
		System.out.print(def);
		int pin = s.nextInt();
		if(Payment.pin==pin)
		{	
  			if(balance>=amount)
   			{
     				if(amount>=1000)
	     			{
      					balance = balance-(amount);
      					//System.out.println("\n\t\t\t\t gst");
     				}
      				else
      				{
       					balance = balance-amount;
      				}
     				System.out.println(bold+green+"\n\t\t\t\t\t\tYOUR TRANSACTIONS IS SUCCESSFUL");
				System.out.println(bold+green+"\n\t\t\t\t\t\tYOUR ORDER IS CONFIRMED"); 
				System.out.println(bold+purple+"\n\t\t\t\t\t\tLOCATION :  COLLECT YOUR VEHICLE \n");
				System.out.println("\t\t\t\t*-----------------------------------------------------------*");
				System.out.println(bold+red+"\n\t\t\t\t\t\tAt  ELITE RENTALS,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tROAD NO-1,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tKPHB , HYDERABAD .");
                                System.out.println(bold+red+"\n\t\t\t\t\t\tFOR ENQUIRY CONTACT:7032566589");
				System.out.println(bold+blue+"\n\t\t\t\t\t\tEMAIL:eliterentals@gmail.com ..");
				System.exit(0);
   			}
   			else
   			{
   				System.out.println(blue+red+"\n\t\t\t\tyou don't have sufficient balance");
				System.out.print(def);
   			}
		}
		else
		{
			System.out.println(bold+red+"\n\t\t\t\tInvalid Pin");
			System.out.println(bold+red+"\n\t\t\t\tPlease re-enter the pin");
			System.out.print(def);
			gpay(amount);
		}
  	}
	public void paytm(double amount)
  	{
                System.out.println("\t\t\t\tAMOUNT:"+object.b);
   		System.out.print(bold+blue+"\n\t\t\t\tEnter Pin : ");
		System.out.print(def);
		int pin = s.nextInt();
		if(Payment.pin==pin)
		{	
  			if(balance>=amount)
   			{
     				if(amount>=1000)
	     			{
      					balance = balance-(amount+10);
      					//System.out.println("\n\t\t\t\t  gst");
     				}
      				else
      				{
       					balance = balance-amount;
      				}
     				System.out.println(bold+green+"\n\t\t\t\t\t\tYOUR TRANSACTIONS IS SUCCESSFUL\n");
     				System.out.println(bold+green+"\n\t\t\t\t\t\tYOUR ORDER IS CONFIRMED\n"); 
				System.out.println(bold+purple+"\n\t\t\t\t\t\tLOCATION :  COLLECT YOUR VEHICLE \n");
				System.out.println("\t\t\t\t*-----------------------------------------------------------*");
				System.out.println(bold+red+"\n\t\t\t\t\t\tAt  ELITE RENTALS,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tROAD NO-1,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tKPHB , HYDERABAD .");
                                System.out.println(bold+red+"\n\t\t\t\t\t\tAt  FOR ENQUIRY CONTACT:7032566589");
				System.out.println(bold+blue+"\n\t\t\t\t\t\tEMAIL:eliterentals@gmail.com  ..");
				System.out.print(def);
				System.exit(0);
   			}
   			else
   			{
   				System.out.println(bold+red+"\n\t\t\t\tyou don't have sufficient balance");
   			}
		}
		else
		{
			System.out.println(bold+red+"\n\t\t\t\tInvalid Pin");
			System.out.println(bold+red+"\n\t\t\t\tPlease re-enter the pin");
			System.out.print(def);
			paytm(amount);
		}
  	}
	public void internet_Banking(double amount)
	{
                System.out.println("\t\t\t\tAMOUNT:"+object.b);
		long acc_no = 1234567890;
		String ifsc_code = "SBI123";
		System.out.print(bold+blue+"\n\t\t\t\tEnter account number : ");
		System.out.print(def);
		long accno = s.nextLong();
		System.out.print(bold+blue+"\n\t\t\t\tEnter IFSC code : ");
		System.out.print(def);
		String ifsc = s.next();
		if(accno == acc_no && ifsc_code.equals(ifsc))
		{
			if(balance>=amount)
   			{
				balance = balance - amount;
     				System.out.println(bold+green+"\n\t\t\t\tyour transaction is completed");
     				//System.out.println(bold+green+"\n\t\t\t\tyour current balance is : "+balance+"rs"); 
				System.out.println(bold+purple+"\n\t\t\t\t\t\tLOCATION :  COLLECT YOUR VEHICLE \n");
				System.out.println("\t\t\t\t*-----------------------------------------------------------*");
				System.out.println(bold+red+"\n\t\t\t\t\t\tAt  ELITE RENTALS,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tROAD NO-1,");
				System.out.println(bold+red+"\n\t\t\t\t\t\tKPHB , HYDERABAD .");
                                System.out.println(bold+red+"\n\t\t\t\t\t\t  FOR ENQUIRY CONTACT:7032566589");
				System.out.println(bold+blue+"\n\t\t\t\t\t\tEMAIL:eliterentals@gmail.com  ..");
				System.exit(0);
   			}
   			else
   			{
   				System.out.println(bold+red+"\n\t\t\t\tyou don't have sufficient balance");
				System.out.print(def);
   			}
		}
		else
		{
			System.out.println(bold+red+"\n\t\t\t\tInvalid Credentials \n\n\t\t\t\t\t\tPlease re-enter details");
        		System.out.print(def);
			internet_Banking(amount);
		}
	}
	void payment()
	{
		//Scanner s = new Scanner(System.in);
	 	System.out.println(bold+green+"\t\t\t\t*       1. Google-Pay                                       *");
		System.out.println(bold+def+"\t\t\t\t*===========================================================*");
		System.out.println(bold+purple+"\t\t\t\t*       2. Phonepe                                          *");
		System.out.println(bold+def+"\t\t\t\t*===========================================================*");
		System.out.println(bold+skblue+"\t\t\t\t*       3. Paytm                                            *");
		System.out.println(bold+def+"\t\t\t\t*===========================================================*");
		System.out.println(bold+yellow+"\t\t\t\t*       4. Internet Banking                                 *");
		System.out.println(bold+def+"\t\t\t\t*-----------------------------------------------------------*");
		System.out.print(bold+blue+"\n\t\t\t\tEnter Your Choice : ");
		System.out.print(def);
  		options(s.nextInt());
	}
  	void options(int n)
  	{
   		switch(n)
   		{
    			case 1:
      				gpay(object.b);
      				break;
   			case 2:
      				phonepay(object.b);
      				break;
   			case 3:
      				paytm(object.b);
      				break;
			case 4:
				internet_Banking(object.b);
				break;
    			default:
        			//options(s.nextInt());
					System.out.println(bold+red+"\t\t\t\tEnter valid option : ");
		                   System.out.print(def);
					options(s.nextInt());
        			break;
  		}
	}

}
class elite 
{
    static String def = "\u001B[0m";
    static String bold="\033[0;1m";
    static String blink ="\u001B[5m";
    static String yellow ="\u001B[33m";
    static String red = "\u001B[31m";
    static String blue = "\u001B[34m";
    static String green = "\u001B[32m";
    static String orange="\u001B[38;5;202m";
    static void display()
    {
      System.out.println(bold+"\u001B[5m"+red+"                               * * * * * *    * *         "+bold+red+"\u001B[5m"+"   * * * * * *   "+bold+red+"\u001B[5m"+" * * * * * *   * * * * * *        ");
		System.out.println(bold+"\u001B[5m"+red+"                               * * * * * *    * *         "+bold+red+"\u001B[5m"+"   * * * * * *   "+bold+red+"\u001B[5m"+" * * * * * *   * * * * * *        ");
		System.out.println(bold+"\u001B[5m"+red+"                               * *            * *         "+bold+red+"\u001B[5m"+"       * *       "+bold+red+"\u001B[5m"+"     * *       * *                ");
		System.out.println(bold+"\u001B[5m"+red+"                               * * * * * *    * *         "+bold+red+"\u001B[5m"+"       * *       "+bold+red+"\u001B[5m"+"     * *       * * * * * *        ");
		System.out.println(bold+"\u001B[5m"+red+"                               * * * * * *    * *         "+bold+red+"\u001B[5m"+"       * *       "+bold+red+"\u001B[5m"+"     * *       * * * * * *        ");
		System.out.println(bold+"\u001B[5m"+red+"                               * *            * *         "+bold+red+"\u001B[5m"+"       * *       "+bold+red+"\u001B[5m"+"     * *       * *                ");
		System.out.println(bold+"\u001B[5m"+red+"                               * * * * * *    * * * * * * "+bold+red+"\u001B[5m"+"   * * * * * *   "+bold+red+"\u001B[5m"+"     * *       * * * * * *        ");
		System.out.println(bold+"\u001B[5m"+red+"                               * * * * * *    * * * * * * "+bold+red+"\u001B[5m"+"   * * * * * *   "+bold+red+"\u001B[5m"+"     * *       * * * * * *        ");
	    System.out.println();
        System.out.println(bold+"\u001B[5m"+blue+"                 * * * * * * *  * * * * * * "+bold+blue+"\u001B[5m"+"   * * *     * * "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+" * * * * * *       * *         * *            * * * * *  ");
        System.out.println(bold+"\u001B[5m"+blue+"                 * * * * * *    * * * * * * "+bold+blue+"\u001B[5m"+"   * ** *    * * "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+" * * * * * *      * * *        * *            * * * * *  ");
        System.out.println(bold+"\u001B[5m"+blue+"                 * *    * *     * *         "+bold+blue+"\u001B[5m"+"   * * * *   * * "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+"     * *         * * * *       * *            * *        ");
        System.out.println(bold+"\u001B[5m"+blue+"                 * * * * *      * * * * * * "+bold+blue+"\u001B[5m"+"   * *  * *  * * "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+"     * *        * *   * *      * *            * * * * *  ");
        System.out.println(bold+"\u001B[5m"+blue+"                 * * * * *      * * * * * * "+bold+blue+"\u001B[5m"+"   * *   * * * * "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+"     * *       * * * * * *     * *            * * * * *  ");
        System.out.println(bold+"\u001B[5m"+blue+"                 * *    * *     * *         "+bold+blue+"\u001B[5m"+"   * *    *  * * "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+"     * *      * * * * * * *    * *                  * *  ");
        System.out.println(bold+"\u001B[5m"+blue+"                 * *    * *     * * * * * * "+bold+blue+"\u001B[5m"+"   * *     * * * "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+"     * *     * *         * *   * * * * * * *  * * * * *  ");
        System.out.println(bold+"\u001B[5m"+blue+"                 * *    * *     * * * * * * "+bold+blue+"\u001B[5m"+"   * *      * ** "+bold+"\u001B[5m"+bold+blue+"\u001B[5m"+"     * *    * *           * *  * * * * * * *  * * * * *  ");
        System.out.println(def);
    }
    static login obj=new login();
    static Bike ob=new Bike();
    static Cars ob1=new Cars();
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        display();
        boolean b=true;
        while(b)
        {
            System.out.println(bold+red+"PLEASE ENTER 1 FOR SIGNUP or 2 FOR SIGNIN ");
            System.out.print(def);
            int s=sc.nextInt();
            switch(s)
            {
                case 1:
                    obj.signup();
                    b=false;
                    break;
                case 2:
                    obj.signin();
                    b=false;
                    break;
                default:
                System.out.println(bold+red+"INVALID INPUTS ");
            }
        }
        if(obj.ac.equalsIgnoreCase("CONTINUE"))
        {
        boolean opt=true;
        while(opt)
        {
                        System.out.println(bold+red+"\t\t\t\t\t     --------CHOOSE YOUR VEHICLE--------");
			System.out.println(bold+def+"\t\t\t\t*-----------------------------------------------------------*");
                        System.out.println(bold+green+"\t\t\t\tENTER 1 FOR 'SELECTING BIKES' ");
			System.out.println(bold+def+"\t\t\t\t*-----------------------------------------------------------*");
			System.out.println(bold+yellow+"\t\t\t\tENTER 2 FOR ' SELECTING CARS'");
			System.out.println(bold+def+"\t\t\t\t*-----------------------------------------------------------*");
                        System.out.println(bold+red+"\t\t\t\tENTER 3 FOR 'EXIT THE APPILICATION'");
			System.out.println(bold+def+"\t\t\t\t*-----------------------------------------------------------*");
                        System.out.print(bold+blue+"\t\t\t\tEnter your Option : ");
			System.out.print(def);
            int option=sc.nextInt();
            switch(option)
 	       {
                case 1:
                        //bike
                    ob.Vehicle();
                    opt=false;
                    break;
                case 2:
                       //cars
		   ob1.Vehicle();
                    opt=false;
                    break;
                case 3:
			opt=false;
			break;
		default:
		    System.out.println(bold+red+"\t\t\t\tInvalid Option");
		    System.out.println(bold+red+"\t\t\t\tChoose Right Option");
		    System.out.print(def);
              }
      }
     }
    }
}