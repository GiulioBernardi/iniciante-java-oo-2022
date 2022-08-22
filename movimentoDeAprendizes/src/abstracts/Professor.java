package abstracts;

public abstract class Professor extends Usuario{
	
	private String stack;
	
	public String criarDesafio(String desafio) {
		return "Criando desafio " + desafio + "...";
	}
	
	public String revisarDesafio(String desafio) {
		return "Revisando desafio " + desafio + "...";
	}
	
	public String solucionarDesafio(String desafio) {
		return "Solucionando desafio " + desafio + "...";
	}
	
	public String ministrarEvento(String assuntoAbordado) {
		return "Olá aprendizes, hoje vou falar sobre " + assuntoAbordado;
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