
import java.io.*;
import java.net.*;

public class ServidorRed {
    //Servidor para la aplicación EntradaRed 

    public static void main(String args[]) throws IOException {
        int byteLeido;
        ServerSocket socketServidor = new ServerSocket(9000);
        Socket socketCliente = socketServidor.accept();
        System.out.println("Inicio de servidor...");
        InputStream entrada = socketCliente.getInputStream();
          System.out.println("Mensajes recibido:");
        while (true) {
            byteLeido = entrada.read();
             if (byteLeido == -1) {
                System.out.println("No se recibio ninguna mensaje");
                System.out.println("Cierre del servidor...");

                System.exit(0);
            }
            char caracter = (char) byteLeido;          
            System.out.print(caracter);
            System.out.print(" ");        
           
        }
       
        
    }

}
