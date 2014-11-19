
public class Robin extends Bird implements Flyable
	{
	public Robin()
	{
		name = "robin";
		food = "worms";
	}
	public void makesNoise()
		{
		System.out.println("The robin says, \"Chirp.\"");
		}
	
	public void flies()
		{
		System.out.println("The " + name + " can also fly!");
		}

	}
