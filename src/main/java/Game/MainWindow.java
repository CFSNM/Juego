package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Cesar on 27/06/2017.
 */
public class MainWindow extends JFrame{

    private static String TITLE = "Shoot Game";
    private JMenuBar menuBar;
    private JMenu mainMenu;
    private JMenuItem newGame, options, close;
    private ImagePanel imagePanel;
    private DescriptionPanel descrPanel;


    private GameWindow gameWindow;
    public MainWindow()
    {
        this(TITLE);
        initializeMenus();
        setSize(800,800);
        setResizable(false);
    }

    public MainWindow(String title)
    {
        super(title);
    }

    private void initializeMenus()
    {
        newGame = new JMenuItem("Start new game");
        options = new JMenuItem("Settings");
        close = new JMenuItem("Close");
        mainMenu = new JMenu("File");
        menuBar = new JMenuBar();
        imagePanel = new ImagePanel("src/main/resources/shoot.jpg");

        descrPanel = new DescriptionPanel("Shoot game v0.1 - CFSNM");


        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    gameWindow = new GameWindow();
                    gameWindow.setVisible(true);
            }
        });

        options.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("SETTINGS");
            }
        });

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        mainMenu.add(newGame);
        mainMenu.add(options);
        mainMenu.add(close);
        menuBar.add(mainMenu);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(imagePanel, BorderLayout.CENTER);
        imagePanel.repaint();
        this.add(descrPanel, BorderLayout.SOUTH);

    }

}
