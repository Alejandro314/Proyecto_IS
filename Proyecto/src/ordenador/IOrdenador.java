package ordenador;

import java.util.Calendar;


/**
 *
 * @author Alberto García Gonzalez,Juan Moreno Galvarro,Alejandro Román Caballero
 */

// Revisar que estos metodos esta igual al diagrama de clases y a los DSS
public interface IOrdenador {

    public int addMiembro(String nombre, String apellidos, String dni, String direccion, String telefono, String email);

    public Miembro introducirDni(String dni);

    public void confirmarBaja();

    public void cambiarMiembro(String nombre, String apellidos, String direccion, String telefono, String email);

    public int addComision(String nombre, String descripcion);

    public Comision introducirComision(String nombre);

    public void introducirMiembro(String dni, String puesto);

    public void confirmarEliminacionMiembro();

    public void listarComisiones();

    public void addReunion(String titulo, Calendar fecha, Calendar horaInicio, Calendar horaFin, String lugar);

    public void addPuntoDia(String url, String titulo, String descripcion);

    public void confirmarReunion();

    public Reunion introducirReunionAnual(String titulo, int anyo);

    public Reunion introducirReunion(String titulo);

    public void introducirFechaConvocatoria(Calendar fecha_convocatoria);

    public void modificarHoraFin(Calendar horaFin);

    public PuntoOrdenDia introduceUrl(String url);

    public void modificaResolucion(String resolucion);

}
