
class MainLibro{
    // Clase principal para ejecutar el programa
    public static void main(String[] args) {
        Libro libro = new Libro(); // Crea una nueva instancia de la clase Libro
        libro.cargarLibro(); // Llama al método para cargar los datos del libro
        libro.mostrarLibro(); // Llama al método para mostrar los datos del libro
    }
}