package br.com.victorrocha95;

public class SingletonLazy {
	private static SingletonLazy instancia;

	SingletonLazy() {
		super();
	}

	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
