package src.Models; // Define el paquete donde se encuentra la clase

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class Libro { // Clase para almacenar los datos del libro
    private String ISBN; // Almacena el ISBN del libro
    private String titulo; // Almacena el título del libro
    private String autor; // Almacena el autor del libro
    private int numPaginas; // Almacena el número de páginas del libro

    // Constructor vacío
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN; // Asigna el valor del ISBN
        this.titulo = titulo; // Asigna el valor del título
        this.autor = autor; // Asigna el valor del autor
        this.numPaginas = numPaginas; // Asigna el valor del número de páginas
    }

    // Método para cargar un libro pidiendo datos al usuario
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para la entrada de datos
        System.out.print("Ingrese el ISBN: "); // Pide al usuario ingresar el ISBN
        this.ISBN = scanner.nextLine(); // Captura y almacena el ISBN ingresado
        System.out.print("Ingrese el título: "); // Pide al usuario ingresar el título
        this.titulo = scanner.nextLine(); // Captura y almacena el título ingresado
        System.out.print("Ingrese el autor: "); // Pide al usuario ingresar el autor
        this.autor = scanner.nextLine(); // Captura y almacena el autor ingresado
        System.out.print("Ingrese el número de páginas: "); // Pide al usuario ingresar el número de páginas
        this.numPaginas = scanner.nextInt(); // Captura y almacena el número de páginas ingresado
    }

    // Método para mostrar los datos del libro
    public void mostrarLibro() {
        System.out.println("ISBN: " + this.ISBN); // Muestra el ISBN del libro
        System.out.println("Título: " + this.titulo); // Muestra el título del libro
        System.out.println("Autor: " + this.autor); // Muestra el autor del libro
        System.out.println("Número de páginas: " + this.numPaginas); // Muestra el número de páginas del libro
    }
}