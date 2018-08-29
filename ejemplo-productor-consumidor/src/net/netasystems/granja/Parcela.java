package net.netasystems.granja;

import java.util.ArrayDeque;
import java.util.Queue;

// TODO: Auto-generated Javadoc
/**
 * The Class Parcela.
 */
public class Parcela {

	/** The parcela. */
	private static Queue<Maiz> parcela = new ArrayDeque<>(); //inicializacion de singletons
	
	/**
	 * Adds the maiz.
	 *
	 * @param maiz the maiz
	 */
	public synchronized static void addMaiz(Maiz maiz) {
		parcela.add(maiz);
	}
	
	/**
	 * Gets the maiz.
	 *
	 * @return the maiz
	 */
	public synchronized static Maiz getMaiz() {
		if(parcela.isEmpty()) {
			return null;
		}
		return parcela.poll();
	}
	
	
}
