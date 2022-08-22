package movimentoDeAprendizes;

import model.Aprendiz;
import model.Desafio;
import model.Evento;
import model.Mentor;
import model.MentorOrganizador;
import model.Organizador;

public class ClasseMain {
	public static void main(String args[]) {
		System.out.println("------APRENDIZ------");
		
		Aprendiz aprendiz = new Aprendiz();
		
		aprendiz.setNome("Giulio");
		aprendiz.setSobrenome("Bernardi");
		aprendiz.aprenderHabilidade("Programação", 10);
		aprendiz.aprenderHabilidade("Modelagem", 15);
		
		
		System.out.println("Olá, sou o aprendiz " + aprendiz.getNome() + " " + aprendiz.getSobrenome());
		executar(aprendiz.compartilharConhecimento("No desafio de orientação a objetos, eu fiz uma classe abstrata herdar de outra classe abstrata. Sabia que da pra fazer uma interfaçe 'extends' outra interface?!"));
		executar(aprendiz.trazerDuvida("Como usar HashMap no java?"));
		executar(aprendiz.participarDeEvento("Solução do desafio Iniciante em Porgramação 2022"));
		
		System.out.println();
		aprendiz.exibirHabilidades();
		System.out.println();
		System.out.println("Evoluindo habilidade de programação em 10 pontos");
		aprendiz.evoluirHabilidade("Programação", 10);
		aprendiz.exibirHabilidades();
		
		
		System.out.println();
		System.out.println("------MENTOR------");
		
		Mentor mentor = new Mentor();
		mentor.setNome("Eduardo");
		mentor.setSobrenome("Branquinho");
		mentor.setStack("Backend");

		Evento evento1 = new Evento();
		evento1.setNome("Explicação do desafio de Java");
		evento1.setAssunto("desafio");
		
		Desafio desafio1 = new Desafio();
		desafio1.setNome("Desafio Orientação a objetos 2022");
		desafio1.setTema("Escola");
		
		
		System.out.println("Olá, sou o mentor " + mentor.getNome() + " " + mentor.getSobrenome() + " eu trabalho com " + mentor.getStack());;
		executar(mentor.criarEvento(evento1));
		executar(mentor.criarDesafio(desafio1));
		executar(mentor.revisarDesafio(desafio1));
		executar(mentor.solucionarDesafio(desafio1));
		executar(mentor.ministrarEvento(evento1));
		executar(mentor.auxiliarAprendizado("Evite deixar código comentado na versão final do seu proejto"));
		executar(mentor.compartilharExperiencia("Ao revisar um código, tive que fazer uma reunião com o responsável. Foi tranquilo, mas é sempre importante manter a comunicação em dia"));

		System.out.println();
		System.out.println("------MENTOR E ORGANIZADOR------");
		
		MentorOrganizador mentorOrganizador = new MentorOrganizador();
		mentorOrganizador.setNome("Vinicius");
		mentorOrganizador.setSobrenome("Ueda");
		mentorOrganizador.setStack("frontend");
		
		Evento evento2 = new Evento();
		evento2.setNome("Review de java e orientação a objetos");
		evento2.setAssunto("Orientação a objetos");
		
		Desafio desafio2 = new Desafio();
		desafio2.setNome("Iniciante em programação 2022");
		desafio2.setTema("Jogo da velha");
		
		System.out.println("Olá, sou o mentor e organizador " + mentorOrganizador.getNome() + " " + mentorOrganizador.getSobrenome() + " trabalho principalmente com " + mentorOrganizador.getStack());;
		executar(mentorOrganizador.criarEvento(evento2));	
		executar(mentorOrganizador.criarDesafio(desafio2));
		executar(mentorOrganizador.revisarDesafio(desafio2));
		executar(mentorOrganizador.solucionarDesafio(desafio2));
		executar(mentorOrganizador.ministrarEvento(evento2));
		executar(mentorOrganizador.auxiliarAprendizado("que a iteração do for começa em 0 em java"));
		executar(mentorOrganizador.compartilharExperiencia("erro em produção é crítico, você tem que parar tudo para resolver"));
		//funções de organizador abaixo
		executar(mentorOrganizador.explicarRegra("usar o canal de dúvidas para fazer perguntas sobre os desafios"));
		executar(mentorOrganizador.explicarProcesso("informar seu nome"));


		System.out.println();
		System.out.println("------ORGANIZADOR------");
		Organizador organizador = new Organizador();
		organizador.setNome("Jessica");
		organizador.setSobrenome("Cestaro");
		System.out.println("Olá, sou a organizadora " + organizador.getNome() + " " + organizador.getSobrenome());

		Evento evento3 = new Evento();
		evento3.setNome("Como responder objetivamente as perguntas em uma entrevista de emprego");
		evento3.setAssunto("Dicas profissionais");
		executar(organizador.criarEvento(evento3));
		executar(organizador.explicarRegra("evitar chamar os organizadores e mentores no privado"));
		executar(organizador.explicarProcesso("compartilhar seu linkedin e github no discord"));
		
	}
	
	public static void executar(String metodoQueRetornaString) {
		System.out.println(metodoQueRetornaString);
	}
}