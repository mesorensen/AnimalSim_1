public class Goldfinch extends Animal implements Walkable, Flyable{
	private double wingSpan;
	private int simID;
	private boolean full;
	private boolean rested;
	Location l = new Location();
	
	public Goldfinch() {
		simID = 0;
		location = l;
		full = false;
		rested = true;
		wingSpan = 9.0;
	}//empty argument constructor
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		
		this.simID = simID;
		this.location = l;
		setWingSpan(wingSpan);
	}//preferred constructor
	
	
	public void Walk(int direction) {
		int x = location.getXCoord() +1;
		int y = location.getYCoord();
		
		if(direction == 1) {
			location.update(x ,y);
		}
		else if(direction == 2){
			location.update(x,y);
		}
	}//implementation of Walkable interface
	
	public void Fly(int x, int y ) {
		
		if(x>0 && y > 0) {
			location.update(x,y);
		}
	}	
	
	//getters and setters
	public double getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(double wingSpan){
		try {
		if(wingSpan < 5.0 || wingSpan > 11.0) {
			throw new InvalidWingspanException("Invalid Wingspan.");
		}
		else {
			this.wingSpan = wingSpan;
		}
		}
		catch(InvalidWingspanException e) {
			System.out.println(e);
		}//handles InvalidWingspanException
	}
	public int getSimID() {
		return simID;
	}
	public void setSimID(int simID) {
		this.simID = simID;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public boolean isRested() {
		return rested;
	}
	public void setRested(boolean rested) {
		this.rested = rested;
	}

	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		
	}
	
	
}
