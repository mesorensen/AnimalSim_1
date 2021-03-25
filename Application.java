public class Application {
	public static void main(String[] args) {
		
		System.out.println("*********************************************\nLocation Tests:\n              ");
			System.out.println("Location will be tested in Goldfinch and Brownbear tests:)");
		
		System.out.println("*********************************************\nAnimal Tests: \n                     ");
			//Animal puppy = new Animal();
			// this would prevent the program from compiling because Animal is an abstract class.
			
		System.out.println("*********************************************\nGoldfinch Tests: \n       ");
			Goldfinch goldie = new Goldfinch();
			goldie.setWingSpan(8.0);
			System.out.println(goldie.getWingSpan());
			//tests wingspan
			
			
			System.out.println("Is Goldie full? " + goldie.isFull());
			goldie.eat();
			System.out.println("How about now? " + goldie.isFull());
			
			
			
			System.out.println("Did Goldie get 8 hours of sleep last night? " + goldie.isRested());
			goldie.sleep();
			System.out.println("How about now? " + goldie.isRested());
			 
			goldie.walk(1);
			
			System.out.println("Goldie walked one unit forward. New location: " + goldie.getLocation());
			
			
			goldie.Fly(20, 10);
			System.out.println(goldie.getLocation());
			
			
			
		System.out.println("*********************************************\nBrownbear Tests: \n     ");
			BrownBear yogiBear = new BrownBear();
			yogiBear.setSubSpecies("Alaskan");
			System.out.println(yogiBear.getSubSpecies());
			
			System.out.println("Did Yogi get 8 hours of sleep last night? " + yogiBear.isRested());
			yogiBear.sleep();
			System.out.println("How about now? " + yogiBear.isRested());
			
			System.out.println("Is Yogi full? " + yogiBear.isFull());
			yogiBear.eat();
			System.out.println("How about now? " + yogiBear.isFull());
			
			
			yogiBear.update(0, 0);
			yogiBear.walk(2);
			System.out.println("Yogi waled one unit sideways. New location: " + yogiBear.getCoordinates());
			
			yogiBear.swim(1);
			System.out.println("Yogi sawm 2 units forwards: " + yogiBear.getXCoord() + ", " + yogiBear.getYCoord());
	}	
}
