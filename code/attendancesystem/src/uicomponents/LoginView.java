
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginView {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    // Constructor and other methods

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
