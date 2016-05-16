package items;

public abstract class GameEntity {
	private double posX;
	private double posY;
	private double velX;
	private double velY;
	private double accX;
	private double accY;
	private double vXMax;
	private double vYMax;
	private int health;
	private float bounce;
	private HitBox hitBox;
	
	public void takedamage(int x) {
		health -= x;
	}
	
	public int getHealth(){
		return health;
	}
	
	public double getPosX(){
		return posX;
	}
	
	public double getPosY(){
		return posY;
	}
	
	public double getVelX() {
		return velX;
	}
	
	public double getVelY() {
		return velY;
	}
	
	public double getAccX() {
		return accX;
	}
	
	public double getAccY() {
		return accY;
	}
	
	public void setPosX(double pos){
		posX = pos;
	}
	public void setPosY(double pos){
		posY = pos;
	}
	
	public void setVelX(double velocity) {
		velX = velocity;
	}
	
	public void setVelY(double velocity) {
		velY = velocity;
	}
	
	public void setAccX(double acceleration) {
		accX = acceleration;
	}
	
	public void setAccY(double acceleration) {
		accY = acceleration;
	}
	
	public float bounce(){
		return bounce;
	}
	
	public HitBox HitBox(){
		return hitBox;
	}
	
	public void move() {
		posX += velX;
		posY += velY;
		velX += accX;
		velY += accY;
		if (velX > vXMax)
			velX = vXMax;
		if (velY > vYMax)
			velY = vYMax;	
	}
	
	public void collide(GameEntity other){
		
	}
}
