package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacoesController opController = new OperacoesController();
//		opController.operacaoString();
//		opController.operacaoBuffer();
		String frase="Bem-vindo de volta à FATEC Zona Leste.";
		opController.operacaoFrase(frase);
	}

}
