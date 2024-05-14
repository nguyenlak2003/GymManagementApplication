
package application.view;

import javax.swing.JFrame;

/**
 *
 * @author Lăk
 */
public class DashboardView extends JFrame{

    public DashboardView() {
        init();
    }
    
    private void init(){
        dashboardButton = new DashboardButton();
        setSize(new java.awt.Dimension(1280, 720));       
        setLocationRelativeTo(null);
        add(dashboardButton);
    }
    
    private DashboardButton dashboardButton;
    
    public static void main(String[] args) {
        new DashboardView().setVisible(true);
    }
}
