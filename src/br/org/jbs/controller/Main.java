package br.org.jbs.controller;

import br.org.jbs.model.Banco;
import br.org.jbs.model.BancoReader;
import br.org.jbs.view.MenuFrame;

import javax.swing.*;

public class Main {
	public static Banco banco = new Banco();

	public static void main(String[] args) {

		/* Lê o banco caso exista */
		BancoReader bancoReader = new BancoReader();
		bancoReader.readBanco();

		MenuFrame menu = new MenuFrame();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
