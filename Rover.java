/* A Mars Rover */

public class Rover 
{
    // fields
    private String name;
    private int x;
    private int y;
    private int direction;
    private int numPics;
    
    // constructors
    public Rover()
    {
        
    }

    public Rover(String name, int x, int y, int direction)
    {
        this.name = name;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    
    
    // methods
    private String directionName()
    {
        if (direction == 0)
            return "North";
        else if (direction == 1)
            return "East";
        else if (direction == 2)
            return "South";
        else
            return "West";
    }
    
    public void rotateRight()
    {
        direction = direction + 1;
        if (direction==4) 
            direction = 0;
        
        System.out.println(name + " turned to the right");
    }
    
    public void rotateLeft()
    {
        direction = direction - 1;
        if (direction==-1) 
            direction = 3;
        
        System.out.println(name + " turned to the left");
    }
    
    public void move(int n)
    {
        if(direction==0)
            y = y + n;
        else if (direction==1) 
            x = x + n;
        else if     (direction==2) 
            y = y - n;
        else             
            x = x - n;
        
        System.out.println(name + " moved " + n + " units.");
    }
    
    public void takePicture()
    {
        System.out.print(name + " took a picture" );
        System.out.print(" at (" + x + ", " + y + ")");
        System.out.println(" facing " + directionName() + ".");
        numPics += 1;
    }
    
    public void status()
    {
            
        System.out.println(name + " [x=" + x + ",y=" + y + ",d=" + directionName() + "]");
    }
}