package poo_examples.javafx.view;

public enum View {
	LOGIN("login.fxml"),
	PRINCIPAL("principal.fxml");
	
	private String fileName;
	
	View(String fileName){
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
}
