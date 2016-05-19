import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent
import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.event.*;     // access 
/**
 * Write a description of class Graphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graphic extends JPanel implements ActionListener,KeyListener
{
    Timer t = new Timer(5,this);

    double x = 0, y = 0, velx = 0, vely = 0;

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
        ImageIcon image = new ImageIcon("image.jpg");
        image.paintIcon(this,g,(int)x,(int)y);
    }

    public void actionPerformed(ActionEvent e)
    {
        repaint();
        x += velx;
        y += vely;
    }

    public void up()
    {

        vely = -10;

    }

    public void down()
    {

        vely = 10;

    }

    public void left()
    {
        velx = -5;

    }

    public void right()
    {
        velx = 5;

    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
        {
            up();
        }
        else if (vely > 0)
        {
            vely -= 0.1;
        }
        if (code == KeyEvent.VK_DOWN)
        {
            down();
        }
        else if (vely < 0)
        {
            vely += 0.1;
        }
        if (code == KeyEvent.VK_RIGHT)
        {
            right();
        }
        else if (velx > 0)
        {
            velx -= 0.1;
        }
        if (code == KeyEvent.VK_LEFT)
        {
            left();
        }
        else if (velx < 0)
        {
            velx += 0.1;
        }
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public void keyReleased(KeyEvent e)
    {
        if (vely > 0)
        {
            while (vely > 0)
            {
                vely -= 0.1;
            }
            velx = 0;
        }
        if (vely < 0)
        {
            while (vely < 0)
            {
                vely += 0.1;
            }
            vely = 0;
        }
        if (velx > 0)
        {
            while (velx > 0)
            {
                velx -= 0.1;
            }
            velx = 0;
        }
        if (velx < 0)
        {
            while (velx < 0)
            {
                velx += 0.1;
            }
            velx = 0;
        }
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
