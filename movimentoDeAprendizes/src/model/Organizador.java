package model;

import abstracts.Usuario;
import interfaces.AuxiliadorDeMentoresEAlunos;
import interfaces.CriadorDeEventos;

public class Organizador extends Usuario implements CriadorDeEventos, AuxiliadorDeMentoresEAlunos{

	@Override
	public String explicarRegra(String regra) {
		return regra;
	}

	@Override
	public String explicarProcesso(String processo) {
		return processo;
	}

	@Override
	public String criarEvento(String evento) {
		return "Eu, como organizador do movimento codar, estou criando o evento " + evento;
	}
}