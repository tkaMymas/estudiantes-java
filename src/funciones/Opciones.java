package funciones;
import java.util.*;

public class Opciones {
    static ArrayList<String> listadoEstudiantes = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);

    public static void ingreso(){
        System.out.println("\nSistema Ingreso Estudiantes");
        System.out.print("Ingreso: ");
        String nombre = input.nextLine();
        listadoEstudiantes.add(nombre);

        System.out.println();
        Menu.menu();
    }
    public static void expulsar(){
        System.out.println("\nSistema Expulsión Estudiantes");
        System.out.println("¡Ingrese el Index del estudiante!");
        System.out.print("Ingreso: ");
        try{
            int eleccion = input.nextInt();
            listadoEstudiantes.remove(eleccion);
        }
        catch (Exception e){
            System.out.println("Ingrese un Index valido.\n");
        }

        System.out.println();
        Menu.menu();
    }
    public static void listado(){
        System.out.println("\n¡Estudiantes de BullWorth!");
        for (String i : listadoEstudiantes){
            System.out.println("- " + i);
        }
        System.out.println("====================");

        System.out.println();
        Menu.menu();
    }
}
