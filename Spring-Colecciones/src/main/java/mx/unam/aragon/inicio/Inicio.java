package mx.unam.aragon;
import java.util.Iterator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import mx.unam.aragon.modelo.Actividades;
import mx.unam.aragon.modelo.Empleado;
import mx.unam.aragon.modelo.EmpleadoM;
import mx.unam.aragon.modelo.EmpleadoP;
public class Inicio {
    public static void main(String[] args) {
        ApplicationContext contexto = new ClassPathXmlApplicationContext(
                new String[] { "bean-configuration.xml" });
        Empleado emp = (Empleado) contexto.getBean("empleado");
        System.out.println(emp.toString());
        for (Actividades act : emp.getActividad()) {
            act.realiza();
        }
        System.out.println("-----");
        Empleado empDos = (Empleado) contexto.getBean("empleadoDos");
        System.out.println(empDos.toString());
        for (Actividades act : empDos.getActividad()) {
            act.realiza();
        }
        System.out.println("-----");
        EmpleadoM empTres = (EmpleadoM) contexto.getBean("empleadoTres");
        System.out.println(empTres.toString());
        for (String llave : empTres.getActividad().keySet()) {
            System.out.println("Llave: "+llave);
            empTres.getActividad().get(llave).realiza();
        }
        System.out.println("-----");
        EmpleadoP empCuatro = (EmpleadoP) contexto.getBean("empleadoCuatro");
        System.out.println(empCuatro.toString());
        for (Iterator<Object> iter=empCuatro.getActividad().keySet().iterator();

             iter.hasNext();) {
            String llave=(String) iter.next();
            System.out.println("Llave: "+llave);
            System.out.println(empCuatro.getActividad().get(llave));
        }
        ((ClassPathXmlApplicationContext) contexto).close();
    }
}