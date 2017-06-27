package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Cesar on 27/06/2017.
 */
public class GameWindow extends JFrame implements ActionListener, KeyListener{

    private static String TITLE = "Shoot game match";

    public static final int TabKey   = 32;
    public static final int PlusKey  = 107;
    public static final int UpKey    = 38;
    public static final int DownKey  = 40;
    public static final int RightKey = 39;
    public static final int LeftKey  = 37;

    private Timer timer;

    private JPanel paramPanel;
    //private GameVisor visor;

    private Player mainPlayer;

    private JLabel lifeLabel, positionLabel;

    public GameWindow()
    {
        this(TITLE);
    }

    public GameWindow(String title)
    {
        super(title);
        timer = new Timer(10000, this);
        initializeMenus();
        setSize(800,800);
        setResizable(false);
    }

    private void initializeMenus()
    {
        lifeLabel = new JLabel("Life points -> ");
        positionLabel = new JLabel("Position -> ");
        paramPanel = new JPanel();

        paramPanel.add(lifeLabel, BorderLayout.NORTH);
        paramPanel.add(positionLabel, BorderLayout.SOUTH);

        this.add(paramPanel, BorderLayout.SOUTH);
    }


    public void actionPerformed(ActionEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}