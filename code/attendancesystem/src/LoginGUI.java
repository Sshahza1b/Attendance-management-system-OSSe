import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginController {
    public static void login(String role) {
        // Handle login functionality based on the role
        switch (role) {
            case "Admin":
                System.out.println("Logged in as Admin");
                break;
            case "Manager":
                System.out.println("Logged in as Manager");
                break;
            case "Employee":
                System.out.println("Logged in as Employee");
                break;
            case "Guest":
                System.out.println("Logged in as Guest");
                break;
            default:
                System.out.println("Invalid role");
                break;
        }
    }
}

public class LoginGUI extends JFrame {
    private JComboBox<String> roleComboBox;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel roleLabel = new JLabel("Select Role:");
        roleComboBox = new JComboBox<>(new String[]{"Admin", "Manager", "Employee", "Guest"});
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        mainPanel.add(roleLabel);
        mainPanel.add(roleComboBox);
        mainPanel.add(usernameLabel);
        mainPanel.add(usernameField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(new JLabel()); // Empty label for spacing
        mainPanel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedRole = (String) roleComboBox.getSelectedItem();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Perform validation here (e.g., check against stored credentials)
                if (validateLogin(selectedRole, username, password)) {
                    LoginController.login(selectedRole);
                } else {
                    JOptionPane.showMessageDialog(LoginGUI.this, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        getContentPane().add(mainPanel, BorderLayout.CENTER);
        pack();
    }

    private boolean validateLogin(String role, String username, String password) {
        // Perform validation based on the role, username, and password
        // Replace the validation logic below with your own implementation
        switch (role) {
            case "Admin":
                return username.equals("admin") && password.equals("admin123");
            case "Manager":
                return username.equals("manager") && password.equals("manager123");
            case "Employee":
                return username.equals("employee") && password.equals("employee123");
            case "Guest":
                return username.equals("guest") && password.equals("guest123");
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }
}
