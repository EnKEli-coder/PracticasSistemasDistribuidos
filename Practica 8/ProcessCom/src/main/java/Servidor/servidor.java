/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import Objeto.Integrante;

/**
 *
 * @author OMAR
 */
public class servidor {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int port = 4321;

        ServerSocket server = new ServerSocket(port);
        Socket cliente  = server.accept();

        ObjectInputStream entradaDatos = new ObjectInputStream(cliente.getInputStream());

        Integrante ArrayIntegrantes[]= new Integrante[5];
        for (int i = 0; i < ArrayIntegrantes.length; i++) {
            Integrante datoIntegrante = (Integrante) entradaDatos.readObject();
            ArrayIntegrantes[i] = datoIntegrante;
        }

        for (Integrante datoIntegrante : ArrayIntegrantes){
            System.out.println(datoIntegrante.getNombre()+"\t"+datoIntegrante.getMatricula()+"\t"+datoIntegrante.getCorreo());
        }
    server.close();
    }
}
