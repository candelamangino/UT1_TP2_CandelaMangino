package uy.ucu.biblioteca;

public class Libro {
	//atributos
	private String titulo;
	private String autor;
	private int anoPublicacion;
	private boolean disponibilidad;

	//constructor
	public Libro(String titulo, String autor, int anoPublicacion) { //, boolean disponibilidad no va pq estoy haciendo que por defecto el libro esta disponible al ser agregado 
		this.titulo=titulo;
		this.autor= autor;
		this.anoPublicacion= anoPublicacion;
		this.disponibilidad= true;
	}
 
	//getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public boolean isDisponible() {
		return disponibilidad;
	}

	public void setDisponibile(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	

	
}
