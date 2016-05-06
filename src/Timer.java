
//This is a timer for things that require time (i.e. position based on velocity/accel; projectile life (time based); jump time, ect)
public class Timer 
{
	private int time;
	private long t1;
	
	public Timer(int t)
	{
		time = t * 1000;
	}
	
	public boolean countdown()
	{
		t1 = System.currentTimeMillis();
        while (true)
        {

            int a = (int) (System.currentTimeMillis() - t1);
            if (a >= time)
            {
                System.out.println("Time extra passed(int millis): " + (a % time)); //(This is to test efficiency when implemented)
                //If method is too inefficent, then we'll have to either find a better 'timer', or copy/paste getElapsedTime() (i have standalone version on blueJay) into method directly)
                return true;
                //OR return a / 1000;
            }
        }
	}
	
	public int getElapsedTime()
	{
		return (int) (System.currentTimeMillis() - t1);
	}
	
}
