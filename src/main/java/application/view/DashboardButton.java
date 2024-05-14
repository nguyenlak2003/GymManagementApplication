package application.view;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DashboardButton extends JPanel {
    

    public DashboardButton() {
       
        createPanel(); 
        createInnerPanel();
    }
    public void createInnerPanel()
    {
         JPanel info = new JPanel();
        info.setBounds(64, 50, 1152, 620);
        info.setBackground(new Color(184,165,151));
        add(info);
        setLayout(null);
        
    }
    public void createPanel() {
        JButton admin = new JButton("admin");
        JButton member = new JButton("member");
        JButton coach = new JButton("coach");
       
       

        member.setBounds(512, 0, 256, 50);
        member.setBackground(new Color(237,217,204));
        member.setForeground(new Color(31, 21,21));
        member.setBorderPainted(false);
        member.setFocusPainted(false); 
        admin.setBounds(256, 0, 256, 50);
        admin.setBackground(new Color(237,217,204));
        admin.setForeground(new Color(31, 21,21));
        admin.setBorderPainted(false);
        admin.setFocusPainted(false);
        coach.setBounds(768, 0, 256, 50);
        coach.setBackground(new Color(237,217,204));
        coach.setForeground(new Color(31, 21,21));
        coach.setBorderPainted(false);
        coach.setFocusPainted(false);
        
        
        add(admin);
        add(coach);
        add(member);
       
        setLayout(null);
        setBounds(0, 0, 1280, 50);
        setBackground(new Color(178,8,8));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(1280, 720);
        frame.add(new DashboardButton());
        
        frame.setVisible(true);
        /*JFrame innerFrame = new JFrame();
        innerFrame.setSize(1152,620);
        innerFrame.setBackground(new Color(184,165,151));
        innerFrame.setUndecorated(true);
        innerFrame.setShape(new RoundRectangle2D.Double(64,50,1152,1152,50,50));
        innerFrame.setVisible(true);*/
    }
}
