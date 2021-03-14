package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;


public class LoginMenuController {

    public TextField userNameText;
    public PasswordField passwordText;

    public void signInAction(ActionEvent actionEvent) {

        String message = userNameText.getText();
        String password = passwordText.getText();
        System.out.println(message);
        System.out.println(password);
    }

    public void exitAction(ActionEvent actionEvent) {
        System.out.println("Exit");
    }
}
