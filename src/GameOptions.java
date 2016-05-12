public class GameOptions 
{
	private String img;
	private String Button1;
	private String Button2;
	private String Button3;
	
	public GameOptions(String image)
	{
		img = image;
		Button1 = "Menu";
		Button2 = "How To Play";
		Button3 = "Pause";
	}
	
	public void Menu()
	{
		//sends user to menu (maybe verification screen?)
	}
	
	public void HowToPlay()
	{
		//Brings up pop-up which displays info on how to play (probably an image)
		//boolean b = true;
		//while (b == true)
		//{
			//pause(true);
			//once "DONE" button is pressed, then pause(false);
		//}
	}
	
	public void pause(boolean a)
	{
		while (a == true)
		{
			//sleep(1);
		}
		//0.5 seconds. Might need to make it shorter to reduce lag time.
		//try to trigger sleep in main (Thread.sleep pauses the entire method it is acting on-thus, it will pause the entire game (hopefully)
		if (a != true)
		{
			
		}
			//Timer with 3 second life (if possible, SOS 3,2,1: GO)
	}
	
	public void sleep(int x)
	{
		long y = (long)x;
		try
		{
			Thread.sleep(y); 

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
