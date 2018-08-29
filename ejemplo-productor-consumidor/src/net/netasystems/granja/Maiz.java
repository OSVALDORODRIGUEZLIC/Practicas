package net.netasystems.granja;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Maiz.
 */
public class Maiz implements Serializable {

	/** The cantidad. */
	private Integer cantidad;
	
	/** The descripcion. */
	private String descripcion;

	/**
	 * Instantiates a new maiz.
	 *
	 * @param cantidad the cantidad
	 * @param descripcion the descripcion
	 */
	public Maiz(Integer cantidad, String descripcion) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	/**
	 * Gets the cantidad.
	 *
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * Sets the cantidad.
	 *
	 * @param cantidad the new cantidad
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Maiz [cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maiz other = (Maiz) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}

}
