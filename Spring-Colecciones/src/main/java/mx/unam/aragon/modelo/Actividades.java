package mx.unam.aragon.modelo;

public interface Actividades {

    public String getActividad();
    public void setActividad(String actividad);

    public default void realiza() {}
}
