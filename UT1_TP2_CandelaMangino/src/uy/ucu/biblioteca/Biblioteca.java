package uy.ucu.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	//atributos
	private List<Libro> librosDisponibles; //es <libro> pq lo que va dentro de la lista son libros
	private List<Prestamo> prestamos; //lista para lograr registrar y mostrar las fechas de clase prestamo
	
	
	//constructor
	public Biblioteca() {
		this.librosDisponibles= new ArrayList<>();
		this.prestamos = new ArrayList<>();

	}
	
	//getters y setters
	public List<Libro> getlibrosDisponibles(){
		return librosDisponibles;
	}
	public void setlibrosDisponibles(List<Libro> librosDisponibles) {
		this.librosDisponibles=librosDisponibles;
	}
	
	public List<Prestamo> getPrestamos() {
	    return prestamos;
	}

	
	//metodo para agregar un libro a la biblioteca por ende a la lista de libros
	public void agregarLibro(Libro item) {
		librosDisponibles.add(item);
	}
	
	//metodo que primero verifica si el usuario esta habilitado a pedir prestado un libro (si ya tiene 3 libros no podra) y luego, si efectivamente es apto se agrega ese libro a la lista de libros que tiene el usuario y se quita de la lista de libros disponibles de la biblioteca
	public boolean prestarLibro(Usuario usuario, String tituloLibro) {
		
		for(Libro item : librosDisponibles) {
			if (item.getTitulo().equalsIgnoreCase(tituloLibro)) {
				
				if (item.isDisponible()) {
					if (usuario.puedePedirPrestamo()) {
						usuario.agregarLibroPrestado(item);
						item.setDisponible(false);
						System.out.println("el prestamo de "+ tituloLibro+ " se realizo con exito a " + usuario.getNombre()+" "+ usuario.getApellido());
						Prestamo prestamo = new Prestamo(item, usuario, LocalDate.now(), LocalDate.now().plusWeeks(2));
						prestamos.add(prestamo);
						return true;
					} else {
						System.out.println(usuario.getNombre() + usuario.getApellido() +" no puede solicitar mas libros porque ya tiene 3 libros prestados.");
						return false;
					}
				} else {
					System.out.println("el libro "+ tituloLibro+" NO esta disponible para prestamo");
					return false;
				}
				
				
			}
		
		}
		
		System.out.println("el libro no existe en la biblioteca ");
		return false;
		
	}
	//metodo para devolver libros ( van de la lista de libros del usuario y vuelven a la lista de libros disponibles de la biblioteca )
	public void devolverLibro(Libro item, Usuario usuario) {
		if (usuario.getLibrosPrestados().contains(item)) {
		usuario.removerLibroPrestado(item);
        item.setDisponible(true);
        System.out.println("se ha devuelto exitosamente el libro a la biblioteca");
        
		}else {
    	 System.out.println("el usuario no tiene ese libro");
    	}
    }
	
	//metodo para mostrar la info de los prestamos
	public void mostrarPrestamos() {
	    System.out.println("\nPréstamos realizados:");

	    for (int i = 0; i < prestamos.size(); i++) {
	        Prestamo p = prestamos.get(i);
	        System.out.println(p.getUsuario().getNombre() + " tiene prestado \"" + p.getLibro().getTitulo() + "\"");
	        System.out.println("→ Fecha del préstamo = " + p.getFechaPrestamo());
	        System.out.println("→ Fecha de devolución = " + p.getFechaDevolucion());
	        System.out.println();
	    }
	}


	
}
