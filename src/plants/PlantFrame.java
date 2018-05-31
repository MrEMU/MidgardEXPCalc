package plants;

import util.PlantRessources;

import javax.swing.*;
import java.awt.*;

public class PlantFrame extends JFrame {

    PlantPanel panel;

    public PlantFrame() {
        panel = new PlantPanel(this);
        PlantRessources.init();
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Midgard Kräuter Generator");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width / 4, screenSize.height / 4, screenSize.width / 4, screenSize.height / 4);
        setPreferredSize(new Dimension(screenSize.width / 4, screenSize.height / 4));
        setResizable(false);
        pack();
        setVisible(true);
        repaint();
    }

}
