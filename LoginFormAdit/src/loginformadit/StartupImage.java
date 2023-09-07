/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginformadit;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author raditya
 */
public class StartupImage {
    public static void StartImg() {
        JWindow frame = new JWindow();
        frame.setLayout(null); //Terminates default flow layout
        frame.setBounds(100, 200, 350, 300);
        
        Container c = frame.getContentPane();
        
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:/User/admin/Downloads/PM.png"));
        Dimension size = label.getPreferredSize();
        label.setBounds(50, 30, size.width, size.height);
        
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 500;
        int height = 200;
        frame.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        frame.setVisible(true);
        
    }
        
}
