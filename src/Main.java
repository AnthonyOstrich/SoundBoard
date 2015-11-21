import java.awt.*;
import javax.swing.*;

/**
 * Created by anthony on 11/21/15.
 */
public class Main {

    private static void createWindow() {
        JFrame frame = new JFrame("Sound Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setName("Menu");
        JMenu menu = new JMenu("Stuff");
        menu.add(new JMenuItem("Click"));
        menu.add(new JMenuItem("Me"));
        menu.add(new JMenuItem("Plese"));
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createWindow();
            }
        });
    }
}
