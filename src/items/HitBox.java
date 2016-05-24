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
		return other.posX >= posX && other.posX <= posX + 2*width && other.posY >= posY && other.posY <= posY + 2*height;
	}
	
	private boolean tRight(HitBox other){
		return other.posX + 2*other.width >= posX && other.posX + 2*other.width <= posX + 2*width && other.posY >= posY && other.posY <= posY + 2*height;
	}
	
	private boolean bLeft(HitBox other){
		return other.posX >= posX && other.posX <= posX + 2*width && other.posY + 2*other.height >= posY && other.posY + 2*other.height <= posY + 2*height;
	}
	
	private boolean bRight(HitBox other){
		return other.posX + 2*other.width >= posX && other.posX + 2*other.width <= posX + 2*width && other.posY + 2*other.height >= posY && other.posY + 2*other.height <= posY + 2*height;
	}
}
