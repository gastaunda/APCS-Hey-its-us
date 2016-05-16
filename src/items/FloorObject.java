package items;

public class FloorObject extends GameEntity{
	private GameObject pickup;
	public FloorObject(GameObject dropped){
		pickup = dropped;
	}

	public void collide(GameEntity other) {
		
	}	
}
