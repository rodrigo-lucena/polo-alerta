package viii.integrador.projeto.modelo;

public class Aviso {
	private int index;
	private String empresa;
	private String aviso;
	private int estado;
	public Aviso(int index, String empresa, String aviso, int estado) {
		super();
		this.index = index;
		this.empresa = empresa;
		this.aviso = aviso;
		this.estado = estado;
	}
	public int getIndex() {
		return index;
	}
	public String getEmpresa() {
		return empresa;
	}
	public String getAviso() {
		return aviso;
	}
	public int getEstado() {
		return estado;
	}	
}
