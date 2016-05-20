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

import java.util.ArrayList;

/**
 * Write a description of class Graphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graphic extends JPanel implements ActionListener,KeyListener
{
    Timer t = new Timer(5,this);
    private ArrayList<Double> moveX = new ArrayList<Double>();
    private ArrayList<Double> moveY = new ArrayList<Double>();
    double x = 0, y = 0, velx = 0, vely = 0;
    double accel = 0.3;

    public Graphic()
    {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon image = new ImageIcon("assets\\images\\image.png");
        ImageIcon stick;
        image.paintIcon(this,g,(int)x,(int)y);
        for (double i = 0; i < 200; i= i + 100)
        {
            ImageIcon brick = new ImageIcon("assets\\images\\brick.png");
            brick.paintIcon(this,g,(int)i,451);
            moveX.add(i);
            moveY.add((double)451);
        }
        if (System.currentTimeMillis() % 2 == 0)
        {
            stick = new ImageIcon("stick1.png");
        }
        else 
        {
            stick = new ImageIcon("stick2.png");
        }
        stick.paintIcon(this,g,100,200);
        ImageIcon brick = new ImageIcon("brick.png");
        brick.paintIcon(this,g,50,100);
        moveX.add((double)50);
        moveY.add((double)100);
    }


    public void actionPerformed(ActionEvent e)
    {
        repaint();

        if (x >= 0)
        {
            x += velx;
            if (!canMove(x,y))
            {
                x -= velx;
                velx = 0;
            }
        }
        else
        {
            x = 0;
        }

        if (y <= 400)
        {
            accel = 0.1;
            vely += accel;
            y += vely;
            if (!canMove(x,y))
            {
                y -= vely;
                vely = 0;
            }
        }
        else
        {
            y = 400;
            accel = 0;
            y += vely;
        }
    }

    public boolean canMove(double x,double y)
    {
        for (int i = 0; i < moveX.size(); i++)
        {
            if (moveX.get(i) == x || moveY.get(i) == y)
            {
                return false;
            }
        }
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
            up();
        }

        if (code == KeyEvent.VK_DOWN)
        {
            down();
        }

        if (code == KeyEvent.VK_RIGHT)
        {
            right();
        }

        if (code == KeyEvent.VK_LEFT)
        {
            left();
        }

    }

    public void keyReleased(KeyEvent e)
    {
        velx = 0;
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
