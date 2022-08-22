package model;

import abstracts.Professor;
import interfaces.CriadorDeEventos;

public class Mentor extends Professor implements CriadorDeEventos{

	@Override
	public String criarEvento(String evento) {
		return "Oi, sou mentor e estou criando o evento " + evento;
	}
	
}
