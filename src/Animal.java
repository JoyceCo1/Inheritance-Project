
public abstract class Animal
	{
	protected String name;
	protected String food;
	
	public abstract void bearYoung();
	
	public void eats(){
	System.out.println("The " + name + " is looking forward to eating some " + food);
	}
	
	public abstract void makeNoise();


	}
