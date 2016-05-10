package Items;

import Mobs.Player;

public class FloorObject implements GameEntity{
	private GameObject pickup;
	public FloorObject(GameObject dropped){
		pickup = dropped;
	}
	@Override
	public void collide(GameEntity other) {
		other.takedamage(0);	
	}
	
	public void collide(Player other){
		
	}
	

	@Override
	public void takedamage(int x) {
		
	}
	@Override
	public double getVelocityX() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getVelocityY() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getAccelerationX() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getAccelerationY() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setVelocityX(double velocity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setVelocityY(double velocity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setAccelerationX(double acceleration) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setAccelerationY(double acceleration) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
	
}
