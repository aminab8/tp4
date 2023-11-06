package serveur;
import service.CalculatriceWS;
import java.util.logging.ConsoleHandler;
import javax.xml.ws.Endpoint;

public class ServeurJWS {

    public static void main(String[] args) {

        //Instantiation du calculatriceWS
        CalculatriceWS calculatrice =new CalculatriceWS();

        //Publication du service web sur le port 8085
        String url ="http://localhost:8084/";
        Endpoint.publish( url, calculatrice);

        System.out.println("Server url:"+ url);

    }
}
