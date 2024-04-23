package application.view;

import application.entity.User;
import application.swing.MyPasswordField;
import application.swing.MyTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 *
 * @author Lăk
 */
public class PanelLogin extends JPanel{

    public PanelLogin() {
        createPanel();
    }

    public void createPanel(){

        textFieldUsername = new MyTextField();
        textFieldPassword = new MyPasswordField();
        buttonLogin = new JButton();
        labelLogin = new JLabel("Log in");
        labelLogo = new JLabel();
        labelSufLogo = new JLabel();
        labelHeader = new JLabel("F I N E S S");
        labelName = new JLabel("Gym management");

        labelLogo.setBounds(140, 80, 65, 65);
        labelLogo.setIcon(new ImageIcon(getClass().getResource("/image/exercise.png")));

        labelSufLogo.setBounds(180, 80, 65, 65);
        labelSufLogo.setIcon(new ImageIcon(getClass().getResource("/image/line.png")));

        labelHeader.setBounds(225, 85, 160, 35);
        labelHeader.setFont(new Font("Stencil", 0, 34));

        labelName.setBounds(225, 120, 160, 30);
        labelName.setFont(new Font("Sitka Text", 0, 18));

        labelLogin.setBounds(115, 145, 290, 100);
        labelLogin.setHorizontalAlignment(SwingConstants.CENTER);
        labelLogin.setFont(new Font("Tw Cen MT Condensed Extra Bold", 0, 45));

        textFieldUsername.setBounds(115, 250, 290, 50);
        textFieldUsername.setHint("Username");
        textFieldUsername.setPrefixIcon(new ImageIcon(getClass().getResource("/image/user.png")));

        textFieldPassword.setBounds(115, 310, 290, 50);
        textFieldPassword.setHint("Password");
        textFieldPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/image/padlock.png")));

        buttonLogin.setBounds(210, 390, 100, 50);
        //buttonLogin.setFocusable(false);
        buttonLogin.setText("LOGIN");
        buttonLogin.setRolloverEnabled(false);
        buttonLogin.setBackground(new Color(0, 0, 0));
        buttonLogin.setForeground(new Color(230, 245, 241));

        add(labelLogo);
        add(labelSufLogo);
        add(labelHeader);
        add(labelName);
        add(labelLogin);
        add(textFieldUsername);
        add(textFieldPassword);
        add(buttonLogin);

        setLayout(null);
        setBounds(90, 60, 520, 580);
        setBackground(new Color(226, 229, 255, 50));
    }
   
    private MyTextField textFieldUsername;
    private MyPasswordField textFieldPassword;
    private JButton buttonLogin;
    private JLabel labelLogin;
    private JLabel labelLogo, labelSufLogo, labelHeader, labelName;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(1280, 720));
        frame.add(new PanelLogin());
        frame.setVisible(true);
    }
    
    public User getUser(){
        return new User(textFieldUsername.getText(),
                        String.copyValueOf(textFieldPassword.getPassword()));
    }
    
    public void addActionListener(ActionListener listen){
        buttonLogin.addActionListener(listen);
    }
}
