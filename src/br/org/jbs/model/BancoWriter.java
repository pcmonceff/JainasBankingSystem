package br.org.jbs.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by renan on 7/24/16.
 */
public class BancoWriter {

    Banco banco;

    public BancoWriter(Banco banco) {
        this.banco = banco;
    }

    public void writeBanco(){

        try {
            FileOutputStream fOut = new FileOutputStream("banco.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            objOut.writeObject(this.banco);
            objOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
