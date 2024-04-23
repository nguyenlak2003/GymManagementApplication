package application.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lăk
 */
public class loginView extends JFrame {

    public loginView() {
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
        
        background.setIcon(new ImageIcon("src/main/java/application/image/background.jpg"));
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
                new loginView().setVisible(true);   
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
                    java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    private JLabel background;
    private PanelLogin panelLogin;
    
}
