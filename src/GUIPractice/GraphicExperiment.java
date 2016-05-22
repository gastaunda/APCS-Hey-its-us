package GUIPractice;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent
import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.event.*;     // access 

import items.EntityList;
import items.Floor;
import items.Wall;

import java.util.ArrayList;

/**
 * Write a description of class Graphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphicExperiment extends JPanel implements ActionListener,KeyListener
{
	private EntityList lischt = new EntityList();
    Timer t = new Timer(5,this);

    public GraphicExperiment()
    {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g)
    {
    	for (double i = 0; i <= 200; i += 25)
        {
            lischt.add(new Floor(25, i, 200));
        }
        super.paintComponent(g);
        lischt.player().getImage().paintIcon(this,g,(int)lischt.player().getPosX(),(int)lischt.player().getPosY());
        for(Wall x: lischt.getWalls()){
        	x.imageIcon().paintIcon(this, g, (int)x.getPosX(), (int)x.getPosY());
        }
    }


    public void actionPerformed(ActionEvent e)
    {
    	lischt.frameAdvance();
        repaint();
    }

    public boolean canMove(double x,double y)
    {
        return true;
    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP && lischt.player().getGround())
        {
            lischt.player().setVelY(-5);
            lischt.player().move();
        }

        if (code == KeyEvent.VK_DOWN)
        {
            lischt.player().setVelY(5);
        }

        if (code == KeyEvent.VK_RIGHT)
        {
            lischt.player().setVelX(3);
        }

        if (code == KeyEvent.VK_LEFT)
        {
            lischt.player().setVelX(-3);
        }

    }

    public void keyReleased(KeyEvent e)
    {

    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void sleep(long x)
    {
        try
        {
            Thread.sleep(x);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
