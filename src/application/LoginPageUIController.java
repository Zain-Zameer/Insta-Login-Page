package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

import javax.swing.JOptionPane;

public class LoginPageUIController {

	public String name = "admin";
	public String pass = "password";
	
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public String usrname;
	public String usrpass;
	@FXML
	public TextField userName;
	@FXML
	public PasswordField userCode;
	// Event Listener on Button.onAction
	
	@FXML
	public void pressLogin(ActionEvent event) throws IOException {
		usrname = userName.getText();
		usrpass = userCode.getText();
		 UserCredentials userCredentials = UserCredentials.getInstance();
		System.out.println(usrname + " "+ usrpass);
		if(usrname.equals(name) && usrpass.equals(pass) || usrname.equals(userCredentials.getUsername()) && usrpass.equals(userCredentials.getPassword())){
			FXMLLoader loader = new FXMLLoader(getClass().getResource("verified.fxml"));
			root = loader.load();
			verifiedController VerifiedController = loader.getController();
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid ID or Password!");
			userName.clear();
			userCode.clear();
			
			
		}
	}
	// Event Listener on Button.onAction
	@FXML
	public void pressForgot(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Email has been sent!");
	
	}
	
	@FXML
	public void pressFacebook(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Now you can login with Facebbok Account!");
			
	}
	
	@FXML
	public void pressSignup(ActionEvent event) throws IOException{
//		root = FXMLLoader.load(getClass().getResource("SignUpPageUI.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpPageUI.fxml"));
		root = loader.load();
		SignUpPageUIController signUpPageUIController = loader.getController();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
