package project;



import java.util.regex.Pattern;

class Inputs extends NSJMain {


	public static void Inp() {
	
	//Get Name and check validation	
		System.out.println("Please Enter Your Deatails for Registration.....");
		System.out.println();
		System.out.println("Enter user Name: ");
		while(true) {
		e.setName(sc.nextLine());
		String regex="^[A-Za-z]\\w{5,29}$";
		if(e.getName().matches(regex)) 
		{
			System.out.println(" Welcome  :"+e.getName()+"!!"); 
			break;
		}
		else {
			System.out.println("Enter valid Name");
		}
		}
		
		System.out.println();
         
		//get Training plan and check validation
		
        System.out.println("These ara the following Training Plans:"+
                          "\nCategory                                               fee"+
        		          "\n1.Beginner(2 sessions per week)                    weekly fee $25.00"+
                          "\n2.Intermediate(3 sessions per week)                weekly fee $30.00"+
        		          "\n3.Elite(5session per week)                         weekly fee $35.00"+
                          "\nNote :You can also get Private tution, per hour it cost $9.00 and also"
                          + " Athletes can receive a maximum of five hours’ private coaching a week"+
                          "\nNote:Only Elite and Intermediate members can participate for competitins");
        System.out.println();
        System.out.println("Enter Your desire number :");
        e.setTrainingPlan(sc.nextLine());
        while(true) {
        String regex1="[1,2,3]";
        Pattern pattern=Pattern.compile(regex1);
        if(e.getTrainingPlan().matches(regex1)){
        	System.out.println("Training Plan:"+e.getTrainingPlan());
        	break;
        }
        else {
        	System.out.println("Entar valid plan");
        	break;
        }
        
        }
        
       
        System.out.println();
        
        //choose weight category
        
        System.out.println();
        System.out.println("Enter user current weight: ");
        e.setCurrentWeight(sc.nextFloat());
        
        
        System.out.println();
        System.out.println("These are the Weight Category : "+
                "\nCategory                        Upper Weight Limit(kg)"+
		        "\nHeavy Weight                    Unlimited(over 100)"+
                "\nLight Heavy Weight              100"+
		        "\nMiddle Weight                   90"+
                "\nLight Middle Weight             81"+
		        "\nLight Weight                    73"+
                "\nFly Weight                      66");
        
        System.out.println();
       
    	
     
      
      // No.Of>competition
      		String regex2="[2,3]";
      		Pattern pattern=Pattern.compile(regex2);
      		if(e.getTrainingPlan().matches(regex2)) {
      			System.out.println("Enter no.of.competitions:");
      			e.setNoOfCompetition(sc.nextInt());
      			System.out.println("No.Of.Competition:");
      		}
      		else {
      			System.out.println("YOU CAN NOT ATTEND TO COMPETITION");
      		}
      		
      		//Get private coaching hours
      		System.out.println();
      		System.out.println("If you want to get private coaching enter private coaching hours");
      		e.setNoOfPrivateCoaching(sc.nextInt());
      		
      		
      		
      		
      }
   	  
	}



