
public class Bat extends Mammal implements Flyable
	{
	public Bat()
	{
	name = "Bat";
	food = "insects";
	}
	
	public void makeNoise()
		{
		System.out.println("The bat emits an ultrasonic pulse.");
		}
	
	public void flies()
		{
		System.out.println("The " + name + " can also fly!");
		}

	}
