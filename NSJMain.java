package project;

import java.util.Scanner;


public class NSJMain{
	
	static  Scanner sc=new Scanner(System.in);
	
	static Entity e =new Entity();
	
	static Inputs i =new Inputs();
  
	static Calculatee c=new Calculatee();
	
	static OutPut o=new OutPut ();
	
	static WeightComp w=new WeightComp();
	   public static void main(String [] args) {
    
	
	Inputs.Inp();
	WeightComp.weight();
	OutPut.Output();
	Calculatee.TrainingCost();
	
	
	}
}



