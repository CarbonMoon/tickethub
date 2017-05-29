import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class LoginPane extends GridPane{
	private TextField 		nameTxt;
	private PasswordField	passTxt;
	private Button			loginBtn;
	
	
	public LoginPane(){
		this.setVgap(10);
		this.setHgap(10);
		this.setPadding(new Insets(10));
		
		Label versionLbl = new Label("Ticket Man v1.0.0");
		versionLbl.setAlignment(Pos.CENTER);
		versionLbl.setMinWidth(300);
		
		Label nameLbl = new Label("Name:");
		Label passLbl = new Label("Password:");
		
		nameTxt = new TextField();
		nameTxt.setPromptText("Enter your name");
		
		
		passTxt = new PasswordField();
		passTxt.setPromptText("Enter your password");
		
		HBox buttonPane = new HBox();
		
		loginBtn = new Button("Login");
		loginBtn.setAlignment(Pos.CENTER);
		
		loginBtn.setMinWidth(100);
		
		buttonPane.getChildren().add(loginBtn);
		buttonPane.setAlignment(Pos.BASELINE_RIGHT);
		
		this.add(versionLbl, 0, 0,2,1);
		this.add(nameLbl, 0, 1);
		this.add(passLbl, 0, 2);
		this.add(nameTxt, 1, 1);
		this.add(passTxt, 1, 2);
		this.add(buttonPane, 0, 3,2,1);
	}
	
	public Button getLoginBtn(){
		return this.getLoginBtn();
	}
	
	public String getName(){
		return nameTxt.getText();
	}
	
	public char[] getPassword(){
		return passTxt.getText().toCharArray();
	}
	
	
}
