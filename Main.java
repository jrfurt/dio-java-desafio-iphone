package com.estudos.desafios.iphone;

public class Main {
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		
		iPhone.adicionarNovaAba();
		iPhone.atualizarPagina();
		iPhone.exibirPagina("www.google.com");
		
		iPhone.atender();
		iPhone.iniciarCorreioVoz();
		iPhone.ligar("(98) 98788-9001");
		
		iPhone.tocar();
		iPhone.pausar();
		iPhone.selecionarMusica("Angra -  Rebirth");
	}
}
