
package neacourseworkgui;

import java.util.HashMap;


public class UserNameAndPasswords {
    
    static HashMap<String,String> LoginInfo = new HashMap<String,String>();

    static Object get(String Username) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    UserNameAndPasswords(){ 
        
        LoginInfo.put("usernametest","passwordtest");
        
    }
    
    protected HashMap getLoginInfo(){
        return LoginInfo;
    }
    
}
