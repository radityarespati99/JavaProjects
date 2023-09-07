
package net.codejava.crawljava;

import java.awt.BorderLayout;
import java.awt.Desktop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.lang.model.util.Elements;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class CrawlJava {
    public static void main(String[] args) throws IOException {
    	
    	String url = JOptionPane.showInputDialog("Enter valid url: ");
    	String directory = JOptionPane.showInputDialog("Choose Directory\nPath=> C://Users//...");
    	String fileName = JOptionPane.showInputDialog("Name your file: \nexample.txt");
    	JOptionPane.showConfirmDialog(null,"Execute?", "\nCancel?", JOptionPane.YES_NO_OPTION);
    	
    	long startTime = System.currentTimeMillis();
    	
        Document doc = Jsoup.connect(url).get();
        org.jsoup.select.Elements link1 = doc.select("img");
        BufferedWriter writer = null;
        
        try {
            writer = new BufferedWriter(new FileWriter("C://Users//"+directory+fileName));
            for (Element e : link1) {
                String link = e.attr("abs:src");
                System.out.println(link);
                writer.write(link);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        
        long estimatedTime = System.currentTimeMillis() - startTime;
        
        JOptionPane.showMessageDialog(null,"Crawler Finished!\nTime elapsed: "+estimatedTime+" ms");
        new ImageNew().setVisible(true);
        JOptionPane.showMessageDialog(null,"File can be accessed in the directory below:\nC://Users//"+directory+fileName); 
        Desktop.getDesktop().open(new File("C://Users//"+directory+fileName));
        
        //Desktop.getDesktop().open(new File("C://Program Files//Neo4j Desktop//Neo4j Desktop.exe"));
    }
}

class ImageNew extends JFrame
{
  public ImageNew()
 {

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Crawling Successful! Here's a Spoderman with Rainbows-_-");

    ImageIcon image = new ImageIcon("C:\\Users\\admin\\Pictures\\maxresdefault.jpg");
    JLabel label = new JLabel(image);
    JScrollPane scrollPane = new JScrollPane(label);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    add(scrollPane, BorderLayout.CENTER);
    pack();
 }
}
