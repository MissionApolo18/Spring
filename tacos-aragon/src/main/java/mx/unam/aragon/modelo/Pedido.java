package mx.unam.aragon.modelo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Pedido {
    private int cantidad;

    private ArrayList<Taco> tacos;

}