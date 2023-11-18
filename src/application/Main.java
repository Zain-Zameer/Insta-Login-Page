package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Parent root = FXMLLoader.load(getClass().getResource("LoginPageUI.fxml"));
			
			Scene scene = new Scene(root);
			// Load the window icon image
	        Image icon = new Image(getClass().getResourceAsStream("instaicon.png"));
	        // Set the window icon
	        primaryStage.getIcons().add(icon);
	        
			primaryStage.setWidth(973);
	        primaryStage.setHeight(711);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
