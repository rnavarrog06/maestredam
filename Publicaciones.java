package es.maestredam;

public class Publicaciones {

	protected String codigo;
	protected String titulo;
	protected String editorial;
	protected int numpag;
	protected int añopub;
	
	public Publicaciones (String cod, String titulo) {
		this(cod,titulo,0);
		
	}
	
	public Publicaciones (String cod, String titulo, int numpag) {
		this.codigo=cod;
		this.titulo=titulo;
		this.editorial="SIN DEFINIR";
		this.numpag=numpag;
		this.añopub=2023;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public void setNumPag (int num) {
		if (num < 5) {
			throw new IllegalArgumentException ("No puede tener menos de 5 paginas");
		}
		this.numpag=num;
	}
	
	public String toString() {
		return "Publicacion con codigo "+this.codigo+" y titulo "+this.titulo;
	}
	
	
	
}
