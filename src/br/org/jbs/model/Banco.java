package br.org.jbs.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by renan on 7/24/16.
 */
public class Banco implements Serializable  {
    private ArrayList<Conta> contas;




    public Banco(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }


    public void insereConta(Conta conta){
        this.contas.add(conta);
    }

    public String toString(){
        String contasString = "";

        for(Conta conta : this.contas)
        {
            contasString += ("Codigo: " + conta.getCodigo() + " Senha: " + conta.getSenha() + " Saldo: " + conta.getSaldo() + "\n");
        }

        return contasString;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
}
