package poo_examples.javafx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import poo_examples.javafx.model.Projeto;
import poo_examples.javafx.view.View;
import poo_examples.javafx.view.ViewSwitcher;

public class PrincipalController implements Initializable{
	
	@FXML private TableView<Projeto> tableView;
	@FXML private TableColumn<Projeto, String> nomeCol;
	@FXML private TableColumn<Projeto, String> descricaoCol;
	
	ObservableList<Projeto> listProjeto = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loadProjeto();
	}
	
	@FXML public void atualizar() {
		System.out.println("Atulizando lista...");
		listProjeto.add(new Projeto("Projeto 01", "meu primeiro projeto"));
		tableView.setItems(listProjeto);
		tableView.getItems().stream().forEach(item -> System.out.println(item.toString()));
	}
	
	@FXML public void deslogar() {
		System.out.println("Deslogando...");
		ViewSwitcher.switchTo(View.LOGIN);
	}
	
	private void loadProjeto() {
		nomeCol.setCellValueFactory(new PropertyValueFactory<>("nome"));
		descricaoCol.setCellValueFactory(new PropertyValueFactory<>("descricao"));
	}
}