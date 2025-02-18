package mx.unam.aragon.modelo;

import java.util.ArrayList;

public class CSV implements Formato{
    @Override
    public void generar(ArrayList<String> entrada) {
        for (String datos: entrada) {
            System.out.println(datos);
        }
    }
}
