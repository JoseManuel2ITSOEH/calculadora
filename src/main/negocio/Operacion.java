package main;

public enum Operacion {
	SUMA {
		@Override
		public Aritmetica obtenerOperacionAritmetica() {
			return new Suma();
		}
	};
	
	public abstract Aritmetica obtenerOperacionAritmetica();
}