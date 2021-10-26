package viii.integrador.projeto.modelo;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(aviso, empresa, estado, index);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aviso other = (Aviso) obj;
		return Objects.equals(aviso, other.aviso) && Objects.equals(empresa, other.empresa) && estado == other.estado
				&& index == other.index;
	}
	
	
}
