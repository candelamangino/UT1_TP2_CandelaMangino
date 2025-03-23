package uy.ucu.biblioteca;

public class Usuario {
	private String nombre;
	private String apellido;
	private int cedula;
	//tengo que ajustar la lista para que tenga los libros que tiene el usuario 
	private ArrayList<Prestamos> librosPrestados;
	
	public Usuario(String nombre, String apellido, int cedula ) {
		this.nombre= nombre;
		this.apellido= apellido ;
		this.cedula= cedula;
		this.librosPrestados= new ArrayList<>();
	}
	
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
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula= cedula;
	}
	public ArratList<Prestamos> getLibrosPrestados(){
		return librosPrestados;
	}
	public void setLibrosPrestados(ArrayList<Prestamos> librosPrestados) {
		this.librosPrestados=librosPrestados;
	}

}
