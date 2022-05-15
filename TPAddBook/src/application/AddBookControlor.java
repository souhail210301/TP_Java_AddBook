package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddBookControlor implements Initializable {
	 @FXML
	 private TextField tfLastName;
	 @FXML
	 private TextField tfFirstName;
	 @FXML
	 private TextField tfEmail;
	 @FXML
	 private Button addBtn;
	 @FXML
	 private Button exportBtn;
	 @FXML
	 private Button importBtn;
	 @FXML
	 private Button removeBtn;
	 @FXML
	 private Button quitBtn;
	 @FXML
	 private TableView<Person> table;
	 @FXML
	 private TableColumn<Person, String> emailCol;
	 @FXML
	 private TableColumn<Person, String> firstNameCol;
	 @FXML
	 private TableColumn<Person, String> lastNameCol;
	 private DataClass data;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 this.data=new DataClass(); 
		 firstNameCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));
		 lastNameCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
		 emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
		
	}
	public void importer() {
		table.getItems().addAll(data.getImportList());
	}
	
	public void add(){
		Person p=new Person(tfLastName.getText(),tfFirstName.getText(),tfEmail.getText());
		data.getImportList().add(p);
		}
	
	public void supprimer(){
		table.getItems().remove(table.getSelectionModel().getSelectedItem());
		
		}
	public void exporter(){
		data.setExportList(table.getItems());
		}
	public void quitter(){
		System.exit(0);
		}

}