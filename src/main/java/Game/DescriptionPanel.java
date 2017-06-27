package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Cesar on 27/06/2017.
 */
public class DescriptionPanel extends JPanel {

    private String description;
    private JLabel textArea;

    public DescriptionPanel(String description)
    {
        this.description = description;
        textArea = new JLabel();
        textArea.setText(this.description);
        this.add(textArea, BorderLayout.CENTER);

    }

    public String getDescription(){
        return description;
    }
}
