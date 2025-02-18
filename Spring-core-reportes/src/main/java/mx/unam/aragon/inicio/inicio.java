package mx.unam.aragon.inicio;
import mx.unam.aragon.modelo.Conexion;
import mx.unam.aragon.modelo.Formato;
import mx.unam.aragon.modelo.Reportes;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.builder.ParentContextCloserApplicationListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.ArrayList;

public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean-configuration.xml"
                }
        );

        Conexion con = context.getBean("mariadb", Conexion.class);
        con.conectar();
        System.out.println(con.consultar("Demo"));
        System.out.println("----------------------");
        Formato formato = context.getBean("csv", Formato.class);
        ArrayList<String> d = new ArrayList<>();
        d.add("1");
        d.add("2");
        d.add("3");
        formato.generar(d);

        Reportes r = context.getBean("reportes", Reportes.class);
        r.getConexion().conectar();
        r.getFormato().generar(d);

        ((ClassPathXmlApplicationContext) context).close();
    }
}