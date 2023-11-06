package project;
 
import java.util.ArrayList;

  class Calculatee extends NSJMain {
	 
	
public static void TrainingCost() {
;
    ArrayList<String> cost =new ArrayList<String>();
    float privateCoach= e.getNoOfPrivateCoaching( ) *9.00f;	 
	cost.add("Private Coaching Cost:"+String.valueOf(privateCoach));
	float competitionNo=e.getNoOfCompetition()*22.00f;
	cost.add("Competition Cost per Month:"+String.valueOf(competitionNo));
	switch(e.getTrainingPlan()) {
	case "1":
		float trainingCost=25.00f*4f;
		cost.add("trainingCost"+String.valueOf(trainingCost));
		break;
	case "2":
		float trainingCost1=30.00f*4f;
		cost.add("trainingCost"+String.valueOf(trainingCost1));
		break;
	case"3":
		float trainingCost2=35.00f*4f;
		cost.add("trainingCost2"+String.valueOf(trainingCost2));
		break;
	}
	float privateCo=e.getNoOfPrivateCoaching();
	cost.add("Private Coaching per hours:"+String.valueOf(privateCo));
	float CompNo=e.getNoOfCompetition();
	cost.add("Competitions number:"+String.valueOf(CompNo));
	
	System.out.println("The itemized list of the cost:"+cost);
	System.out.println();
	
	if (e.getTrainingPlan().equals("1")) {
		float begin=25.00f*4f+e.getNoOfPrivateCoaching()*9f;
		System.out.println("The total cost of your training per month:"+begin);
		System.out.println();
		
	}else if (e.getTrainingPlan().equals("2")) {
		float interm=30.00f*4f+e.getNoOfPrivateCoaching()*9.00f+e.getNoOfCompetition()*22.00f;
		System.out.println("The total cost of your training per month:"+interm);
		System.out.println();
	}
	else if(e.getTrainingPlan().equals("3")) {
		float elite=35.00f*+e.getNoOfCompetition()*9.00f+e.getNoOfCompetition()*22.00f;
		System.out.println("The total cost for your training per month:"+elite);
		System.out.println();
	}
	
	
}

}
