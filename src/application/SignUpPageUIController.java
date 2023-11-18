package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;

public class SignUpPageUIController {
	

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public String Newemail;
	public String NewfullName;
	public String NewuserName;
	public String NewuserPass;
	
	
	@FXML
	TextField userEmail;
	@FXML
	TextField userFullName;
	@FXML
	TextField userUserName;
	@FXML
	PasswordField userPassword;

	// Event Listener on Button.onAction
	@FXML
	public void pressSignUpButton(ActionEvent event) throws IOException {
		Newemail = userEmail.getText();
		NewfullName = userFullName.getText();
		NewuserName = userUserName.getText();
		NewuserPass = userPassword.getText();
		if (NewuserName.isEmpty() || NewuserPass.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Please fill all the details!");
	        return; // Do not proceed further
	    }
		UserCredentials userCredentials = UserCredentials.getInstance();
        userCredentials.setUsername(NewuserName);
        userCredentials.setPassword(NewuserPass);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("verified.fxml"));
		root = loader.load();
		verifiedController VerifiedController = loader.getController();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	// Event Listener on Button.onAction
	@FXML
	public void pressLoginButton(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPageUI.fxml"));
		root = loader.load();
		LoginPageUIController loginPageUIController = loader.getController();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
