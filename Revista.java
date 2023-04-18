package es.maestredam;

public class Revista extends Publicaciones {

	private int numEpoca;
	private int numRevista;
	
	
	public Revista (String codigo, String titulo, int numRevista) {
		super (codigo, titulo);
		this.numRevista = numRevista;
		this.numEpoca =1;
		
	}
	
	public void setNumEpoca (int numEpoca) {
		this.numEpoca=numEpoca;
	}
	
	public int getNumEpoca() {
		return numEpoca;
	}
	
	public int getNumRevista() {
		return numRevista;
	}
	
	public String toString() {
		
	}
	
}
