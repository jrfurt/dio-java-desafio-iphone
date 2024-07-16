package com.estudos.desafios.iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	// NAVEGADOR DE INTERNET
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

	// APARELHO TELEFONICO
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

	// REPRODUTOR MUSICAL
	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música: " + musica);
	}
	
}
