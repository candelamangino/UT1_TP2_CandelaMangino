package uy.ucu.biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private int anoPublicacion;
	private boolean disponibilidad;

	public Libro(String titulo, String autor, int anoPublicacion, boolean disponibilidad) {
		this.titulo=titulo;
		this.autor= autor;
		this.anoPublicacion= anoPublicacion;
		this.disponibilidad= disponibilidad;
	}

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

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
}
