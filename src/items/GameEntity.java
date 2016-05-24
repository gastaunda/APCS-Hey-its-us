package items;

import javax.swing.ImageIcon;

public abstract class GameEntity {
	private double posX;
	private double posY;
	private double velX;
	private double velY;
	private double accX;
	private double accY;
	private double vXMax = 4;
	private double vYMax = 4;
	private int health;
	private float bounce;
	private HitBox hitBox;
	protected ImageIcon myImage;
	private boolean grounded;
	public void takedamage(int x) {
		health -= x;
	}
	
	public void setGround(boolean turing){
		grounded = turing;
	}
	public void setMaxVel(double max){
		vXMax = max;
		vYMax = max;
	}
	public boolean getGround(){
		return grounded;
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
	
	public void setHitBox(double x, double y, double h, double w){
		hitBox = new HitBox(x, y, h, w);
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
		else if(velX < -vXMax)
			velX = -vXMax;
		if (velY > vYMax)
			velY = vYMax;
		else if(velY < -vYMax)
			velY = -vYMax;
		hitBox.setPosX(posX);
		hitBox.setPosY(posY);
	}
	public ImageIcon imageIcon(){
		return myImage;
	}
	public void collide(GameEntity other){
		
	}
}
