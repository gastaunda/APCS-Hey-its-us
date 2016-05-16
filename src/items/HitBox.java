package items;

public class HitBox {
	private double posX;
	private double posY;
	private double height;
	private double width;
	public HitBox(double pxX, double pyY, double upRad, double sideRad){
		posX = pxX;
		posY = pyY;
		height = upRad;
		width = sideRad;
	}
	
	public void setPosX(double newX){
		posX = newX;
	}
	public void setPosY(double newY){
		posY = newY;
	}
	public boolean collisionCheck(HitBox other){
		return tLeft(other) || tRight(other) || bLeft(other) || bRight(other);
	}
	
	private boolean tLeft(HitBox other){
		return other.posX + other.width <= posX + width && other.posX + other.width >= posX - width && other.posY + other.height <= posY + height && other.posY + other.height >= posY - height;
	}
	
	private boolean tRight(HitBox other){
		return other.posX - other.width <= posX + width && other.posX - other.width >= posX - width && other.posY + other.height <= posY + height && other.posY + other.height >= posY - height;
	}
	
	private boolean bLeft(HitBox other){
		return other.posX + other.width <= posX + width && other.posX + other.width >= posX - width && other.posY - other.height <= posY + height && other.posY - other.height >= posY - height;
	}
	
	private boolean bRight(HitBox other){
		return other.posX - other.width <= posX + width && other.posX - other.width >= posX - width && other.posY - other.height <= posY + height && other.posY - other.height >= posY - height;
	}
}
