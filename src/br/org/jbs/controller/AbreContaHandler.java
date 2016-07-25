package br.org.jbs.controller;

import br.org.jbs.model.BancoWriter;
import br.org.jbs.model.Conta;

/**
 * Created by renan on 7/23/16.
 */
public class AbreContaHandler {


    public AbreContaHandler() {

    }

    public void criaConta(String codigo, String senha, String saldo)
    {
        int codigoInt, senhaInt, saldoInt;

        if((codigo != null) && (senha != null) && (saldo != null))
        {
            try {
                /* Convertendo valores para criar conta */
                codigoInt = Integer.valueOf(codigo);
                senhaInt = Integer.valueOf(senha);
                saldoInt = Integer.valueOf(saldo);

                /* Criando Objeto conta, adicionando ao banco e salvando com bancoWriter (serializable) */
                Conta conta = new Conta(codigoInt, senhaInt, saldoInt);

                Main.banco.insereConta(conta);
                
                BancoWriter bancoWriter = new BancoWriter(Main.banco);
                bancoWriter.writeBanco();

                /* Testando o reader*/
             /*   BancoReader bancoReader = new BancoReader();
                bancoReader.readBanco();*/


            }catch (Exception e){
                System.out.println("Erro nas conversões ao criar conta;");
            }
        }

    }


}
