package Items;

import Mobs.Player;

public class FloorObject implements GameEntity{
	private GameObject pickup;
	public FloorObject(GameObject dropped){
		pickup = dropped;
	}
	@Override
	public void collide(GameEntity other) {
		// TODO Auto-generated method stub		
	}
	
	public void collide(Player other){
	}

	@Override
	public void takedamage(int x) {
		// TODO Auto-generated method stub
		
	}
	
}
