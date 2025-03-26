package uy.ucu.biblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro3 = new Libro("1984", "George Orwell", 1949);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Crear usuario
        Usuario usuario = new Usuario("Candela", "Mangino", "12345678");

        // Pedir préstamo de libros
        biblioteca.prestarLibro(usuario, "1984"); // debería prestarse
        biblioteca.prestarLibro(usuario, "El Principito"); // debería prestarse
        biblioteca.prestarLibro(usuario, "Cien años de soledad"); // debería prestarse

        // Intentar pedir un cuarto libro
        Libro libroExtra = new Libro("Rayuela", "Julio Cortázar", 1963);
        biblioteca.agregarLibro(libroExtra);
        biblioteca.prestarLibro(usuario, "Rayuela"); // debería fallar (ya tiene 3 libros)

        // Devolver un libro
        biblioteca.devolverLibro(libro2, usuario); // devuelve "El Principito"

        // Intentar pedir nuevamente "Rayuela"
        biblioteca.prestarLibro(usuario, "Rayuela"); // ahora debería funcionar

        // Intentar devolver un libro que no tiene
        biblioteca.devolverLibro(libro2, usuario); // ya lo devolvió, así que debería fallar
    }
}
