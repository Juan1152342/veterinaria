
/**
 * Write a description of class Veterinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {
    private ArrayList<Mascota> mascotas;

    // Constructor
    public Veterinaria() {
        this.mascotas = new ArrayList<>();
    }

    // Método para agregar una mascota
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    // Método para mostrar todas las mascotas
    public void mostrarMascotas() {
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
    }
    
    public class Main {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Registrar nueva mascota");
            System.out.println("2. Mostrar todas las mascotas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            
            if (opcion == 1) {
                System.out.print("Nombre de la mascota: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Tipo de mascota (Perro, Gato, etc.): ");
                String tipo = scanner.nextLine();
                
                System.out.print("Edad de la mascota: ");
                int edad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                
                System.out.print("Nombre del dueño: ");
                String dueño = scanner.nextLine();
                
                Mascota nuevaMascota = new Mascota(nombre, tipo, edad, dueño);
                veterinaria.agregarMascota(nuevaMascota);
                
                System.out.println("Mascota registrada exitosamente!");
            } else if (opcion == 2) {
                veterinaria.mostrarMascotas();
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
        
        scanner.close();
    }
}

}



