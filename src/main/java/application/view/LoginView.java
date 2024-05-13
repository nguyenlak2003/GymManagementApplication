package application.view;

import application.entity.User;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lăk
 */
public class LoginView extends JFrame {

    public LoginView() {
        initComponents();
        //setBackground(new Color(0, 0, 0, 0));
    }

    private void initComponents() {
        
        background = new JLabel();
        panelLogin = new PanelLogin();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setLayout(null);
        
        background.setIcon(new ImageIcon(getClass().getResource("/image/background.png")));
        
        background.setBounds(0, 0, 1280, 720);
        
        add(panelLogin);
        add(background);
        
        setSize(new java.awt.Dimension(1280, 720));       
        setLocationRelativeTo(null);
    }

    private JLabel background;
    private PanelLogin panelLogin;
    
    public User getUser(){
        return panelLogin.getUser();
    }
    
    public void addLoginListener(ActionListener listener){
        panelLogin.addActionListener(listener);
    }
}
