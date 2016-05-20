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
    private ArrayList<Double> moveX = new ArrayList<Double>();
    private ArrayList<Double> moveY = new ArrayList<Double>();
    double x = 0, y = 0, velx = 0, vely = 0;
    double accel = 0.3;

    public GraphicExperiment()
    {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g)
    {
    	for (double i = 100; i <= 200; i= i + 100)
        {
            lischt.add(new Wall(25, i, i));
        }
        super.paintComponent(g);
        lischt.player().getImage().paintIcon(this,g,(int)lischt.player().getPosX(),(int)lischt.player().getPosY());
        for(Wall x: lischt.getWalls()){
        	x.imageIcon().paintIcon(this, g, (int)x.getPosX(), (int)x.getPosY());
        }
    }


    public void actionPerformed(ActionEvent e)
    {
        repaint();
        lischt.frameAdvance();
    }

    public boolean canMove(double x,double y)
    {
        return true;
    }

    public void up()
    {
        vely = -5;
    }

    public void down()
    {
        vely = 5;
    }

    public void left()
    {
        velx = -3;
    }

    public void right()
    {
        velx = 3;
    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
        {
            lischt.player().setVelY(-5);
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
    	lischt.player().setVelY(0);
        lischt.player().setVelX(0);
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
