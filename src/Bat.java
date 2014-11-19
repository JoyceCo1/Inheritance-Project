
public class Bat extends Mammal implements Flyable
	{
	public Bat()
	{
	name = "bat";
	food = "insects";
	}
	
	public void makesNoise()
		{
		System.out.println("The bat emits an ultrasonic pulse.");
		}
	
	public void flies()
		{
		System.out.println("The " + name + " can also fly!");
		}

	}
