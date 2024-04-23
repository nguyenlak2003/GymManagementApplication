
package application.func;

import application.entity.User;

/**
 *
 * @author Lăk
 */
public class UserFunc {
    public boolean checkUser(User user){
        if(user != null) {
            if ("admin".equals(user.getUserName()) 
                    && "admin".equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
