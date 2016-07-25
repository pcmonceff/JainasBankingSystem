package br.org.jbs.model;

import java.io.Serializable;

public class Conta implements Serializable {
	private int codigo;
	private int senha; 
	private float saldo;
	
	
	public Conta(int codigo, int senha, float saldo) {
		this.codigo = codigo;
		this.senha = senha;
		
		 /* Tratando o Saldo Negativo */ 
		if(saldo > 0)
		{
			this.saldo = saldo;
		}
		else
		{
			saldo = 0;
		}
		
	}

	@Override
	public String toString() {
		return "Conta{" +
				"codigo=" + codigo +
				", senha=" + senha +
				", saldo=" + saldo +
				'}';
	}

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
	
	
}
