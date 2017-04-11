package alumno;

import java.awt.Color;

import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
 
@SuppressWarnings("serial")
public class AlumnoVista extends MainWindow<Alumno> {
 
    public Window() {
        super(new Alumno());
    }
 
    @Override
    public void createContents(Panel mainPanel) {
        this.setTitle("Info Alumno");
        mainPanel.setLayout(new VerticalLayout());
 
        new Label(mainPanel).setText("Ingrese Token"); // se podria hacer un
                                                        // boton que valide el
                                                        // token
 
        new TextBox(mainPanel).bindValueToProperty("token");
       
        new Label(mainPanel); //Espacio entre objetos de la interfaz
       
        new Button(mainPanel).setCaption("Obtener Datos").onClick(() ->this.getModelObject().llenarDatos());
        //ver comentario de llenarDatos() en Alumno
       
        new Label(mainPanel); // Espacio entre objetos de la interfaz
       
        new Label(mainPanel).setText("Legajo");
       
        new Label(mainPanel).bindValueToProperty("legajo"); //llenarDatos() lo llena
       
        new Label(mainPanel); // Espacio entre objetos de la interfaz
       
        new Label(mainPanel).setText("Nombre");
       
        new Label(mainPanel).bindValueToProperty("nombre"); //llenarDatos() lo llena
       
        new Label(mainPanel); // Espacio entre objetos de la interfaz
       
        new Label(mainPanel).setText("Apellido");
       
        new Label(mainPanel).bindValueToProperty("apellido"); //llenarDatos() lo llena
       
        new Label(mainPanel); // Espacio entre objetos de la interfaz
       
        new Label(mainPanel).setText("Usuario Github");
       
        new Label(mainPanel).bindValueToProperty("ghu"); //llenarDatos() lo llena
       
        new Label(mainPanel); // Espacio entre objetos de la interfaz
 
        new Label(mainPanel).setText("Seleccione Asignaci�n");
 
        Selector<Alumno> selectorAlumno = new Selector<Alumno>(mainPanel);
        selectorAlumno.bindValueToProperty("asignacion");
        selectorAlumno.items(); // Aca hay que bindearlo con las asignaciones
                                // que van a aparecer en el desplegable
                                // Se debe reemplazar items() por bindItems(),
                                // el problema es que no entiendo sus argumentos
       
        new Label(mainPanel); // Espacio entre objetos de la interfaz
 
        new Button(mainPanel).setCaption("Obtener Notas").onClick(() -> this.getModelObject().nothing()); // ver
                                                                                                            // comentario
                                                                                                            // de
                                                                                                            // nothing
                                                                                                            // en
                                                                                                            // Alumno
 
        new Label(mainPanel).setBackground(Color.GREEN).bindValueToProperty("notasDeAsignacion");
 
       
       
    }
 
 
    public static void main(String[] args) {
        new Window().startApplication();
    }
}