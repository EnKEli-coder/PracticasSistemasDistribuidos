
import java.io.*;
import java.net.*;

public class EntradaRed {
    //Versión para red de la clase Entrada

    public static void main(String args[]) throws IOException {
        int byteLeido;
        InputStream entrada = (System.in);
        Socket socket = new Socket("localhost", 9000);
        OutputStream salida = socket.getOutputStream();

        while (true) {
            byteLeido = entrada.read();
            if (byteLeido == -1) {
                System.out.println("Sin recepcion de mensajes. Cierre del servidor....");
                System.exit(0);
            }
            salida.write(byteLeido);
        }
        
        
    }
}
