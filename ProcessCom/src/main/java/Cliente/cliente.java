/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import Objeto.Integrante;

/**
 *
 * @author OMAR
 */
public class cliente {
    public static void main(String[] args) throws IOException {
        int port = 4321;
        String host = "localhost";

        Socket cliente = new Socket(host, port);

        ObjectOutputStream salidaDatos = new ObjectOutputStream(cliente.getOutputStream());

        Integrante ArrayIntegrantes[] = new Integrante[5];

        ArrayIntegrantes[0] = new Integrante("Erick Medina Reyes","51988","al051988@uacam.mx");
        ArrayIntegrantes[1] = new Integrante("Dulce Yadira Cruz Gonzalez","62157","al062157@uacam.mx");
        ArrayIntegrantes[2] = new Integrante("Abimael Garcia Diaz","60875","al060875@uacam.mx");
        ArrayIntegrantes[3] = new Integrante("Johan Oliver Chan Chi","60888","al060888@uacam.mx");
        ArrayIntegrantes[4] = new Integrante("Omar Enrique Romero Gomez","54081","al054081@uacam.mx");

        for (Integrante objIntegrante:ArrayIntegrantes) {
            salidaDatos.writeObject(objIntegrante);
        }

        cliente.close();
    }
    
}
