package loginformadit;

import com.sun.tools.javac.Main;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class LoginFormAdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JWindow frame = new JWindow();
        frame.setLayout(null); //Terminates default flow layout
        frame.setBounds(100, 200, 350, 300);
        frame.setVisible(true);
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:/User/admin/Downloads/PM.png"));
        Dimension size = label.getPreferredSize();
        label.setBounds(50, 30, size.width, size.height);
        
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 500;
        int height = 200;
        frame.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        frame.setVisible(true);
        
        try {
             TimeUnit.SECONDS.sleep(2);  // wait 3 seconds
           } catch (InterruptedException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           }
        frame.dispose();
        
        //Container c = frame.getContentPane();
        
//        JLabel label = new JLabel(); //JLabel Creation
//        label.setIcon(new ImageIcon("C:/User/admin/Downloads/PM.png")); //Sets the image to be displayed as an icon
//        Dimension size = label.getPreferredSize(); //Gets the size of the image
//        label.setBounds(50, 30, size.width, size.height);
//        
//        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
//        int width = 500;
//        int height = 200;
//        frame.setBounds(center.x - width / 2, center.y - height / 2, width, height);
//        frame.setVisible(true);
        
        // Start Login Page Frame
        
        LoginFirst LoginFrame = new LoginFirst();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
    
}
