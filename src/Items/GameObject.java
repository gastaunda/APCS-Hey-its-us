package Items;
public class GameObject{
	private boolean drops;
	private String name;
	private String description;
	
	public GameObject(String newname, String newdescription)
	{
		name = newname;
		description = newdescription;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	
	
	
}
