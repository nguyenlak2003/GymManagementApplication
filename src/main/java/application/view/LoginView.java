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
        
        background.setIcon(new ImageIcon(getClass().getResource("/image/background.jpg")));
        
        background.setBounds(0, 0, 1280, 720);
        
        add(panelLogin);
        add(background);
        
        setSize(new java.awt.Dimension(1280, 720));       
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setLockAndFeel();
                new LoginView().setVisible(true);   
            }

            private void setLockAndFeel() {
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
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
