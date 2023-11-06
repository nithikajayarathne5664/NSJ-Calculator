package project;

 class WeightComp extends NSJMain{
	 
	 public static void weight() {
		 
		 

	        if (e.getCurrentWeight()<=66) {
	      	  System.out.println("You ara belong to: Fly Weight Cattegory ");
	        }
	        else if(e.getCurrentWeight()<=73) {
	      	  System.out.println("You ara belong to: Light  Weight Cattegory ");
	        }
	        else if(e.getCurrentWeight()<=81) {
	      	  System.out.println("You ara belong to: Light Middle Weight Cattegory ");
	        }
	        else if(e.getCurrentWeight()<=90) {
	      	  System.out.println("You ara belong to: Middle Weight Cattegory ");
	        }
	        else if(e.getCurrentWeight()<=100) {
	      	  System.out.println("You ara belong to: Light Heavy Weight Cattegory ");
	        }
	        else {
	      	  System.out.println("You ara belong to : Heavy Weight Cattegory ");
	        }
	     
	      System.out.println();
	    
	 }

}
