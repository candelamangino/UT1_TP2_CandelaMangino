package uy.ucu.biblioteca;

import java.time.LocalDate;

//seria el prestamo de un libro a un usuario 
public class Prestamo {
	//atributos
	private Libro libro;
    private Usuario usuario;
    private LocalDate  fechaPrestamo;
    private LocalDate  fechaDevolucion;
	
  //constructor
	public Prestamo (Libro libro, Usuario usuario, LocalDate  fechaPrestamo, LocalDate  fechaDevolucion) {
		this.libro=libro;
		this.usuario=usuario;
		this.fechaPrestamo=fechaPrestamo;
		this.fechaDevolucion =fechaDevolucion;
		
	}
	
	//getters y setters
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro=libro;
	}
	public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
