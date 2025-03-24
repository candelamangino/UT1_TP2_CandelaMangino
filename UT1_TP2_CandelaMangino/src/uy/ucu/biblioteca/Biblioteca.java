package uy.ucu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
//tengo que hacer una lista de los libros que hay disponibles  (hecho)
	//hacer tmb metodo para prestar y devolver libros 
	//si el libro no esta disponible no se puede prestar
	//usuario no puede tener mas de 3 libros prestados al mismo tiempo 
	private ArrayList<Libro> librosDisponibles; //es <libro> pq lo que va dentro de la lista son libros
	
	public Biblioteca() {
		this.librosDisponibles= new ArrayList<>();
	}
	

	public ArrayList<Libro> getlibrosDisponibles(){
		return librosDisponibles;
	}
	public void setlibrosDisponibles(ArrayList<Libro> librosDisponibles) {
		this.librosDisponibles=librosDisponibles;
	}
	
	public void buscarLibro(String tituloBuscado) {
		
		for(Libro item : librosDisponibles) {
			if (item.getTitulo().equalsIgnoreCase(tituloBuscado)) {
				System.out.println("¡Libro encontrado!");
				return;
			}
		
		}
		System.out.println("este libro NO esta disponible para prestamo");
	}
}
