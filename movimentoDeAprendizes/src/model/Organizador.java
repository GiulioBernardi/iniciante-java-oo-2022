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
	public String criarEvento(Evento evento) {
		return "Evento " + evento.getNome() + " criado\nAssunto abordado: " + evento.getAssunto();
	}
}