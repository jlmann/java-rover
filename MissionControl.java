
public class MissionControl
{
	
	public static void main(String[] args) 
	{
	    Rover r1 = new Rover();
	    
		Rover r3 = new Rover("Opportunity", 17, 12, 3);
		Rover r4 = new Rover("Curiosity", 5, -3, 0);
		r3.status();
		r4.status();
		
		r3.rotateLeft();
		r3.move(2);
		r3.status();
		
		r4.rotateLeft();
		r4.move(4);
		r4.status();
		
		r4.rotateLeft();
		r4.move(3);
		r4.status();
		
		r4.rotateRight();
		r4.move(7);
		r4.status();
		
		r4.takePicture();
		
	}
}