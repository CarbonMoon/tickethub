import java.awt.Button;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class AdminPane extends GridPane{
	Label		userLbl;
	Label		ticketLbl;
	Label		adminLbl;
	Button		logoutBtn;
	Button		addTicketBtn;	
	Button		editTicketBtn;
	Ticket[]	ticketBin;
	User		currentUser;
	
	public AdminPane(){
		this.setVgap(10);
		this.setHgap(10);
		this.setPadding(new Insets(10));
		
		userLbl = new Label("user:" + currentUser.getName());
		adminLbl = new Label("admin");
		adminLbl.setFont(Font.font(Font.getDefault().getFamily(), FontPosture.ITALIC, Font.getDefault().getSize()));
		ticketLbl = new Label("Submitted Tickets");
		
		logoutBtn = new Button("Logout");
		addTicketBtn = new Button("Add Ticket");
		editTicketBtn = new Button("Edit Ticket");
	}
}
