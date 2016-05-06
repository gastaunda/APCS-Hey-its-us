package Items;

public interface GameEntity {
	public void collide(GameEntity other);
	
	public void takedamage(int x);
}
