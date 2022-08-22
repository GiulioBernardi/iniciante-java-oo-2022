package model;

import abstracts.Professor;
import interfaces.CriadorDeEventos;

public class Mentor extends Professor implements CriadorDeEventos{

	@Override
	public String criarEvento(Evento evento) {
		return "Evento " + evento.getNome() + " criado\nAssunto abordado: " + evento.getAssunto();
	}
}