package mx.unam.aragon.modelo;

import java.util.ArrayList;

public class MariaDB implements Conexion{

    @Override
    public void conectar() {
        System.out.println("Conectado a la base de datos");
    }

    @Override
    public ArrayList<String> consultar(String query) {
        return null;
    }
}
