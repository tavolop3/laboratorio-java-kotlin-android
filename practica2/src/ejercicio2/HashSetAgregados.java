package ejercicio2;

import java.util.Collection;
import java.util.HashSet;

public class HashSetAgregados<E> {
	private HashSet<E> hs = new HashSet<E>();
	private int cantidadAgregados = 0;
	
	public HashSetAgregados() {}
	
	public boolean add(E e) {
		cantidadAgregados++;
		return hs.add(e);
	}
	
	public boolean addAll(Collection<? extends E> c) {
		cantidadAgregados += c.size();
		return hs.addAll(c);
	}
	
	public int getCantidadAgregados() {
		return cantidadAgregados;
	}
}
