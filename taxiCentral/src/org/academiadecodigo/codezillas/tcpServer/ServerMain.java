package org.academiadecodigo.codezillas.tcpServer;

//Class used to test server
public class ServerMain {
    public static void main(String[] args) {

        Server server = new Server(9000);
        server.initialize();

        while(true){
            server.listen();
        }

    }
}
