public class Paciente {
    // Declaracion de atributos a utilizar
    String paciente;
    int edad;
    String expediente;

    //Creación de metodo publico para mostrar la informacion
    public void mostrarInformacion(){
        System.out.println("Nombre del Paciente: "+ paciente);
        System.out.println("Edad del Paciente: "+ edad);
        System.out.println("Numero de Expediente: "+ expediente);
    }
}
