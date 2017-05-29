import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Ticket implements Serializable{
	private String submitterName;
	private String descriptionSmall;
	private String descriptionLarge;
	private ArrayList<File> attachedFiles;
	private int priority;
	private Date dateSumitted;
	private Date dateCompleted;
	
	public Ticket(String submitterName, String descriptionSmall, int priority){
		this.submitterName = submitterName;
		this.descriptionSmall = descriptionSmall;
		this.priority = priority;
		this.descriptionLarge = "";
		this.attachedFiles = new ArrayList<File>();
		this.dateSumitted = new Date();
		this.dateCompleted = null;
	}
	public Ticket(String submitterName, String descriptionSmall, String descriptionLarge, ArrayList<File> attachedFiles, int priority){
		this(submitterName, descriptionSmall, priority);
		this.descriptionLarge = descriptionLarge;
		this.attachedFiles = attachedFiles;
		this.dateSumitted = new Date();
		this.dateCompleted = null;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public String getDescriptionSmall() {
		return descriptionSmall;
	}
	public void setDescriptionSmall(String descriptionSmall) {
		this.descriptionSmall = descriptionSmall;
	}
	public String getDescriptionLarge() {
		return descriptionLarge;
	}
	public void setDescriptionLarge(String descriptionLarge) {
		this.descriptionLarge = descriptionLarge;
	}
	public ArrayList<File> getAttachedFiles() {
		return attachedFiles;
	}
	public void setAttachedFiles(ArrayList<File> attachedFiles) {
		this.attachedFiles = attachedFiles;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getDateSumitted() {
		return dateSumitted;
	}
	public void setDateSumitted(Date dateSumitted) {
		this.dateSumitted = dateSumitted;
	}
	public Date getDateCompleted() {
		return dateCompleted;
	}
	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	
	public void completeTicket(){
		this.dateCompleted = new Date();
	}
	
	
	
}
