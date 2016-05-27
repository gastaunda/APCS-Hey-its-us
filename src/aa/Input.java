package aa;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {
	private int kup;
	private int kdown;
	private int kleft;
	private int kright;
	private int kshootL;
	private int kshootR;
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;
	private boolean shootL;
	private boolean shootR;

	public Input(int up, int down, int left, int right, int shootL, int shootR) {
		kup = up;
		kdown = down;
		kleft = left;
		kright = right;
		kshootL = shootL;
		kshootR = shootR;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int code = arg0.getKeyCode();
		if (code == kup)
			up = true;
		else if (code == kdown)
			down = true;
		else if (code == kleft)
			left = true;
		else if (code == kright) 
			right = true;
		else if (code == kshootL)
			shootL = true;
		else if (code == kshootR)
			shootR = true;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		int code = arg0.getKeyCode();
		if (code == kup)
			up = false;
		else if (code == kdown)
			down = false;
		else if (code == kleft)
			left = false;
		else if (code == kright) 
			right = false;
		else if (code == kshootL)
			shootL = false;
		else if (code == kshootR)
			shootR = false;
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public boolean getUp() {
		return up;
	}

	public boolean getDown() {
		return down;
	}

	public boolean getLeft() {
		return left;
	}

	public boolean getRight() {
		return right;
	}

	public boolean getShootR() {
		return shootR;
	}

	public boolean getShootL() {
		return shootL;
	}
}
