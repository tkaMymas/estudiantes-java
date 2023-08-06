package funciones;
import java.util.*;

public class Menu {
    public static void menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n¡Escuela BullWorth!");
        System.out.println("(1)Ingresar Estudiantes\n(2)Expulsar Estudiantes\n(3)Lista Estudiantes\n(4)Salir\n");
        System.out.print("Ingreso: ");
        String accion = input.next();

        switch (accion){
            case "1":
                Opciones.ingreso();
                break;
            case "2":
                Opciones.expulsar();
                break;
            case "3":
                Opciones.listado();
                break;
            case "4":
                System.out.println("¡Adios Escuela BullWorth!");
                break;
            default:
                System.out.println("\nIngrese una opción valida.\n");
        }
    }
}
