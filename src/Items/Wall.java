package Items;

public class Wall implements GameEntity{
	private int walEnth;
	public Wall(int length){
		walEnth = length;
	}
	@Override
	public void collide(GameEntity other) {
		
		
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
