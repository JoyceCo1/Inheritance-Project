
public class Robin extends Bird implements Flyable
	{
	public void makeNoise()
		{
		System.out.println("The robin says, \"Chirp.\"");
		}
	
	public void flies()
		{
		System.out.println("The " + name + " can also fly!");
		}

	}
