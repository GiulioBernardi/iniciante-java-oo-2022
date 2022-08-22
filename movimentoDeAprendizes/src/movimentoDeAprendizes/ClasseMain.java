package movimentoDeAprendizes;

import model.Aprendiz;
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

		System.out.println("Olá, sou o mentor " + mentor.getNome() + " " + mentor.getSobrenome() + " eu trabalho com " + mentor.getStack());;
		executar(mentor.criarEvento("Explicação do desafio de Java"));
		executar(mentor.criarDesafio("Desafio Orientação a objetos 2022"));
		executar(mentor.revisarDesafio("Iniciante em programação 2022"));
		executar(mentor.solucionarDesafio("Orientação a objetos 2022"));
		executar(mentor.ministrarEvento("Como utilizar java em uma empresa inovadora"));
		executar(mentor.auxiliarAprendizado("Evite deixar código comentado na versão final do seu proejto"));
		executar(mentor.compartilharExperiencia("Ao revisar um código, tive que fazer uma reunião com o responsável. Foi tranquilo, mas é sempre importante manter a comunicação em dia"));

		System.out.println();
		System.out.println("------MENTOR E ORGANIZADOR------");
		
		MentorOrganizador mentorOrganizador = new MentorOrganizador();
		mentorOrganizador.setNome("Vinicius");
		mentorOrganizador.setSobrenome("Ueda");
		mentorOrganizador.setStack("frontend");
		
		System.out.println("Olá, sou o mentor e organizador " + mentorOrganizador.getNome() + " " + mentorOrganizador.getSobrenome() + " trabalho principalmente com " + mentorOrganizador.getStack());;
		executar(mentorOrganizador.criarEvento("Review de java e orientação a objetos"));	
		executar(mentorOrganizador.criarDesafio("Iniciante em programação 2022"));
		executar(mentorOrganizador.revisarDesafio("Desafio de orientação a objetos"));
		executar(mentorOrganizador.solucionarDesafio("Iniciante em programação 2022"));
		executar(mentorOrganizador.ministrarEvento("o que um dev backend deve saber sobre frontend"));
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

		executar(organizador.criarEvento("Como responder objetivamente as perguntas em uma entrevista de emprego"));
		executar(organizador.explicarRegra("evitar chamar os organizadores e mentores no privado"));
		executar(organizador.explicarProcesso("compartilhar seu linkedin e github no discord"));
		
	}
	
	public static void executar(String metodoQueRetornaString) {
		System.out.println(metodoQueRetornaString);
	}
}