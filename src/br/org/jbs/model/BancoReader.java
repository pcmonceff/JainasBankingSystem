package br.org.jbs.model;

import br.org.jbs.controller.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by renan on 7/24/16.
 */
public class BancoReader {

    Banco banco;

    public BancoReader() {

    }

    public void readBanco(){
        try
        {
            FileInputStream fileInputStream = new FileInputStream("banco.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            this.banco = (Banco) objectInputStream.readObject();
            Main.banco = banco;
           /* System.out.println(this.banco.toString());*/

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
