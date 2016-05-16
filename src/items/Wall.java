package items;

public class Wall extends GameEntity{
	private int walEnth;
	public Wall(int length){
		walEnth = length;
	}
	@Override
	public void collide(GameEntity other) {
		other.setVelX(-other.getVelX());		
	}
}
