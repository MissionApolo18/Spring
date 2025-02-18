package mx.unam.aragon.modelo;

public class Reportes {
    private Conexion conexion;
    private Formato formato;

    public Reportes(){
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
}
