public class Principal {
    public static void main(String[] args) {
        // Crear un nuevo objeto de tipo Estudiante
        //clase identificador new constructor
        Estudiante estudiante1 = new Estudiante();

        // Asignar valores a los atributos
        //identificador.atributo = valor
        estudiante1.nombre = "Paulina";
        estudiante1.edad = 23;
        // Llamar al método saludar() del objeto
        estudiante1.saludar();
    }
}