package mx.unam.aragon.modelo;

import java.util.ArrayList;

public interface Conexion {
    public void conectar();

    public ArrayList<String> consultar(String query);

}
