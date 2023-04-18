package es.maestredam;

public class Libro extends Publicaciones implements Prestable,Comparable<Libro>{

	private int numEj;
	private boolean prestado;
	private int vecesprestado;
	private int unidadesprestadas;
	
	
	public Libro (String codigo, String titulo, int numEj) {
		super(codigo,titulo);
		this.numEj=numEj;
		this.prestado=false;
		this.vecesprestado=0;
		this.unidadesprestadas=0;
		
	}
	
	public void prestar() {
		if(this.numEj>this.unidadesprestadas) {
		this.vecesprestado++;
		this.unidadesprestadas++;
		this.prestado = true;
		System.out.println("El libro ha sido prestado");
		} else {		
			System.out.println("El libro no puede prestarse, no hay ejemplares");
		}
		
		
	}
	
	public void devolver() {
		if (this.unidadesprestadas==0) {
			System.out.println("No se puede devolver ya que no hay ninguno prestado");
			this.prestado = false;
		}else {
			this.unidadesprestadas--;
			
		}
		
	}
	
	public boolean isPrestable() {
		return prestado;
	}
	
	private int getUnidadesPrestadas() {
		return this.unidadesprestadas;
	}
	
	@Override
	public int compareTo(Libro o) {
		return this.añopub-o.añopub;
			
	
		
	}

	
	
	
	
}
