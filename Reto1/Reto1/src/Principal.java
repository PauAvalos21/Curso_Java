import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente p1 = new Paciente(); //Llamando clase Paciente

        //Solicitud de Datos
        System.out.println("Ingresa el nombre del Paciente: ");
        p1.paciente= sc.nextLine(); //scaner del nombre ingresado

        System.out.println("Ingresa la edad del Paciente: ");
        p1.edad = sc.nextInt(); //scaner de edad

        System.out.println("Ingresa el número de expediente: ");
        sc.nextLine(); // Limpiar el buffer
        p1.expediente = sc.nextLine(); //scaner no de expediente

        System.out.println("La informacion del Paciente es la siguiente: ");
        p1.mostrarInformacion(); //Metodo llamado para imprimirlo
    }
}
