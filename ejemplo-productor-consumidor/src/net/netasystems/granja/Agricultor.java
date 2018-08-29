package net.netasystems.granja;

// TODO: Auto-generated Javadoc
/**
 * The Class Agricultor.
 */
public class Agricultor implements Runnable{

	/**
	 * Siembra ocosecha.
	 */
	public void siembraOcosecha() {
		Parcela.addMaiz(new Maiz(getCantidadRandom(), getMaizDescripcion()));
	}
	
	/**
	 * Gets the cantidad random.
	 *
	 * @return the cantidad random
	 */
	public int getCantidadRandom() {
		return (int) Math.random() * 100;
	}
	
	/**
	 * Gets the maiz descripcion.
	 *
	 * @return the maiz descripcion
	 */
	public String getMaizDescripcion() {
		String tiposMaiz[] = {"TRANSGENICO", "NORMAL", "SIN GLUTEN", "ORGANICO", "BLANCO", "NEGRO", "CON HUITLACOCHE", "PREPARADO", "EN QUESADILLA", "EN QUESADILLA CON QUESO", "MOLIDO"};
		int index = (int) Math.random() * 10;
		return tiposMaiz[index];
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while(true) {
			siembraOcosecha();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Excepcion de intrerrupcion");
			}
		}
	}
	
}
