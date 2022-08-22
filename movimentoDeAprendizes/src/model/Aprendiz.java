package model;

import java.util.HashMap;

import abstracts.Usuario;

public class Aprendiz extends Usuario{
	
	private HashMap<String, Integer> habilidades = new HashMap<String, Integer>();

	public HashMap<String, Integer> getHabilidades() {
		return habilidades;
	}
	
	public String compartilharConhecimento(String conhecimento) {
		return "Eu, " + this.getNome() + " gostaria de compartilhar conhecimento com vocês: " + conhecimento;
	}
	
	public String trazerDuvida(String duvida) {
		return "Dúvida: " + duvida;
	}
	
	public String participarDeEvento(String evento) {
		return "Você está cadastrado no evento: " + evento;
	}

	public void aprenderHabilidade(String nome, Integer nivel) {
		this.habilidades.put(nome, nivel);
	}
	
	public void evoluirHabilidade(String nome, Integer acrescimo) {
		Integer valorAtual = habilidades.get(nome);
		Integer novoValor = valorAtual + acrescimo;
		
		habilidades.replace(nome, novoValor);
	}
	
	public void exibirHabilidades() {
		for (HashMap.Entry<String,Integer> pair : habilidades.entrySet()) {
			String nomeDaHabilidade = pair.getKey();
			Integer nivelDaHabilidade = pair.getValue();
		    System.out.println("Habilidade: " + nomeDaHabilidade + " - Nível: " + nivelDaHabilidade);
		}
	}
	
	
}
