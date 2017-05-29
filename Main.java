import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage mainStage) throws Exception {
		/*
		GridPane aPane = new GridPane();
		aPane.setVgap(10);
		aPane.setHgap(10);
		aPane.setPadding(new Insets(10));
		
		Label versionLbl = new Label("Ticket Man v1.0.0");
		versionLbl.setAlignment(Pos.CENTER);
		versionLbl.setMinWidth(300);
		
		Label nameLbl = new Label("Name:");
		Label passLbl = new Label("Password:");
		
		TextField nameTxt = new TextField();
		nameTxt.setPromptText("Enter your name");
		
		
		PasswordField passTxt = new PasswordField();
		passTxt.setPromptText("Enter your password");
		
		HBox buttonPane = new HBox();
		
		Button loginBtn = new Button("Login");
		loginBtn.setAlignment(Pos.CENTER);
		
		loginBtn.setMinWidth(100);
		
		buttonPane.getChildren().add(loginBtn);
		buttonPane.setAlignment(Pos.BASELINE_RIGHT);
		
		aPane.add(versionLbl, 0, 0,2,1);
		aPane.add(nameLbl, 0, 1);
		aPane.add(passLbl, 0, 2);
		aPane.add(nameTxt, 1, 1);
		aPane.add(passTxt, 1, 2);
		aPane.add(buttonPane, 0, 3,2,1);
		//*/
		mainStage.setTitle("Ticket System");
		
		mainStage.setScene(new Scene(new AdminPane()));
		mainStage.show();
	}
	
	public void update(){
		
	}
}
