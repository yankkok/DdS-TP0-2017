package alumno;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {

        final String TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
        Alumno alu = RequestService.obtenerDatosDeAlumno(TOKEN);
        /*List <Tarea> tareas = new ArrayList<Tarea>();
        tareas = lista.getAssignments();
        Tarea t1 = tareas.get(0);
        String title = t1.getTitle();*/
        System.out.println(alu.getNombre());

    }
}
