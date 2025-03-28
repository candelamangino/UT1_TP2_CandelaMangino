package uy.ucu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	//atributos
	private String nombre;
	private String apellido;
	private String cedula;
	//tengo que ajustar la lista para que tenga los libros que tiene el usuario 
	private List<Libro> librosPrestados;
	
	//constructor
	public Usuario(String nombre, String apellido, String cedula ) {
		this.nombre= nombre;
		this.apellido= apellido ;
		this.cedula= cedula;
		this.librosPrestados= new ArrayList<>();
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido= apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula= cedula;
	}
	public List<Libro> getLibrosPrestados(){
		return librosPrestados;
	}
	public void setLibrosPrestados(List<Libro> librosPrestados) {
		this.librosPrestados=librosPrestados;
	}
	
	//metodo para que se agregue el libro que le fue prestado al usuario a su lista de libros
	public void agregarLibroPrestado(Libro item) {
		librosPrestados.add(item);
	}
	//metodo para quitar el libro de lista de libros que tiene el usuario 
	public void removerLibroPrestado(Libro item) {
		librosPrestados.remove(item);
	}
	
	//metodo para verificar si el usuario tiene 3 o menos libros que pidio prestados,si tiene 3 no pued
	public boolean puedePedirPrestamo() {
		return librosPrestados.size()<3;
	}
}
