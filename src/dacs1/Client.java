/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dacs1;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class Client extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JButton loginButton;
    private JLabel statusLabel;

    public Client() {
        createUI();
    }

    private void createUI() {
        setTitle("Login/Register");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        registerButton = new JButton("Register");
        panel.add(registerButton);

        loginButton = new JButton("Login");
        panel.add(loginButton);

        statusLabel = new JLabel("");
        panel.add(statusLabel);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        add(panel);
    }

    private void register() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        sendRequest("register", username, password);
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        sendRequest("login", username, password);
    }

    private void sendRequest(String action, String username, String password) {
        try (Socket socket = new Socket("192.168.1.53", 12345);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            output.println(action);
            output.println(username);
            output.println(password);

            String response = input.readLine();
            statusLabel.setText(response);
        } catch (IOException ex) {
            ex.printStackTrace();
            statusLabel.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Client client = new Client();
                client.setVisible(true);
            }
        });
    }
}