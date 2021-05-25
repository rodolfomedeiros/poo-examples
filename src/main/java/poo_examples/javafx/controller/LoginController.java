package poo_examples.javafx.controller;

import javafx.fxml.FXML;
import poo_examples.javafx.view.View;
import poo_examples.javafx.view.ViewSwitcher;

public class LoginController {

	@FXML public void buttonLogin() {
		//Verificação de Login e Senha
		ViewSwitcher.switchTo(View.PRINCIPAL);
	}
	
}
