package device;

import components.AparelhoTelefonico;
import components.NavegadorInternet;
import components.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	public void tocar() {
		System.out.println("Reproduzindo música");
	}
	public void pausar() {
		System.out.println("Música pausada");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
	}
	
	public void ligar (String numero) {
		System.out.println("Ligando para " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo");
	}
	
	public void iniciarCorreioVoz () {
		System.out.println("Correio de voz iniciado");
	}
	
	public void exibirPagina (String url) {
		System.out.println("Exibindo página: " + url);
	}
	
	public void adicionarNovaAba () {
		System.out.println("Nova aba adicionada");
	}
	
	public void atualizarPagina () {
		System.out.println("Página atualizada");
	}
	
	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
	
	System.out.println("REPRODUTOR MUSICAL");
	meuIphone.tocar();
	meuIphone.pausar();
	meuIphone.selecionarMusica("Train Wreck - James Arthur");
	
	System.out.println();
	System.out.println("APARELHO TELEFONICO");
	meuIphone.ligar("4002-8922");
	meuIphone.atender();
	meuIphone.iniciarCorreioVoz();
	
	System.out.println();
	System.out.println("NAVEGADOR DA INTERNET");
	meuIphone.exibirPagina("https://apple.com.br");
	meuIphone.adicionarNovaAba();
	meuIphone.atualizarPagina();
	}
}
