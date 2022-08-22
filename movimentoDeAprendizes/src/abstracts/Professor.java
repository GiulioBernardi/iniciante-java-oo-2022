package abstracts;

import model.Desafio;
import model.Evento;

public abstract class Professor extends Usuario{
	
	private String stack;
	
	public String criarDesafio(Desafio desafio) {
		return "Desafio " + desafio.getNome() + " criado\nTema do desafio: " + desafio.getTema();
	}
	
	public String revisarDesafio(Desafio desafio) {
		return "Revisando desafio " + desafio.getNome() + "...";
	}
	
	public String solucionarDesafio(Desafio desafio) {
		return "Solucionando desafio " + desafio.getNome() + "...";
	}
	
	public String ministrarEvento(Evento evento) {
		return "Olá aprendizes, hoje vou falar sobre " + evento.getAssunto();
	}
	
	public String auxiliarAprendizado(String auxilio) {
		return "Oi aprendiz, o auxílio que eu tenho para te dar é " + auxilio;
	}
	
	public String compartilharExperiencia(String experiencia) {
		return "Experiência: " + experiencia;

	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}
}