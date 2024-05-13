
package application.controller;

import application.entity.User;
import application.func.UserFunc;
import application.view.DashboardButton;
import application.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lăk
 */
public class LoginController {
    private UserFunc userDao;
    private LoginView loginView;
    private DashboardButton dashboardButton;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        loginView.setVisible(true);
        this.userDao = new UserFunc();
        loginView.addLoginListener(new LoginListener());
    }
    
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if(userDao.checkUser(user)){
                //LoginView loginView = (LoginView) SwingUtilities.getWindowAncestor(this);
                loginView.getContentPane().removeAll();
                loginView.getContentPane().add(new DashboardButton());
                loginView.revalidate();
                loginView.repaint();
            }
            else{
                JOptionPane.showMessageDialog(loginView, "username or password is not correct");
            }
        }    
    }
}
