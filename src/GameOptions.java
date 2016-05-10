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
			//Thread.sleep(999999999); //will last for 1M seconds (should be long enough :))
			Thread.sleep(1000);  //1 sec
		//try to trigger sleep in main (Thread.sleep pauses the entire method it is acting on-thus, it will pause the entire game (hopefully)
		if (a != true)
			//Timer with 3 second life (if possible, SOS 3,2,1: GO)
	}
}
