package model;

import abstracts.Professor;
import interfaces.AuxiliadorDeMentoresEAlunos;
import interfaces.CriadorDeEventos;

public class MentorOrganizador extends Professor implements CriadorDeEventos, AuxiliadorDeMentoresEAlunos{

	@Override
	public String explicarRegra(String regra) {
		return "Você deve " + regra;
	}

	@Override
	public String explicarProcesso(String processo) {
		return "Você deve " + processo + " para documentar seus dados";
	}

	@Override
	public String criarEvento(String evento) {
		return "Oi, sou mentor e organizaor. Estou criando o evento " + evento;
	}


	

}
