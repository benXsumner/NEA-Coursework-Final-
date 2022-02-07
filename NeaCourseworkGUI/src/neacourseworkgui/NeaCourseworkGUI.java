package neacourseworkgui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NeaCourseworkGUI implements ActionListener {

    int count = 0;

    private static JTextField userText;
    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel successfulLogin;

    public static void main(String[] args) {
        StartScreenJFrame StartScreen = new StartScreenJFrame();
        StartScreen.setVisible(true);
        
        UserNameAndPasswords usernameandpasswords = new UserNameAndPasswords();
        
        LoginScreenJFrame LoginInfo = new LoginScreenJFrame(usernameandpasswords.getLoginInfo());
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        //check if what is entered matches username database
        //check is what is entered matches password database
        if (user.equals("") && password.equals("")) {
            System.out.println("login successful!");
        } else {
            successfulLogin.setText("login unsuccessful try again");
        }

    }

    public static boolean ValidPasswordCheck(String password) {
        //password must contain: 1 symbol, 1 number, 1 upper case, and be at least 8 characters long
        //checks it has the valid requirements
        String regex = "^(?=.*[0-9])" + "(?=.*[A-Z])" + "(?=.*@$£&!-_)" + "(\\S+$).{8,25}";

        Pattern p = Pattern.compile(regex);
        //if password is empty return false
        if (password == null) {
            return false;
        }
        //used to find match between password entered and regular expression
        Matcher m = p.matcher(password);
        //return if the password matched the regex
        return m.matches();

    }

}
