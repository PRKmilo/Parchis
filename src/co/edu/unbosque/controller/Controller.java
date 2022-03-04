package co.edu.unbosque.controller;

import co.edu.unbosque.model.LogicaJuego;

public class Controller {
	private LogicaJuego log;
	public Controller() {
		log=new LogicaJuego();
		log.dados();
	}

}
