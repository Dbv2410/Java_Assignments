
public abstract class Bird {

	
	int weight;
	int Height;
	int length;
    String colour ;
	
    public void eat() {
    	System.out.println("Eatimg....");
    }
    
    public void fly() {
    	System.out.println("Flying....");
    }
    
    public abstract void sound();
    public abstract void wings();
    

	}

