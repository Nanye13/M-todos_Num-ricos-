class PuntoFijoMain{
	public static void main(String[] args){
		PuntoFijo c = new PuntoFijo(1.5,1e-10,15);
		double raiz = c.calcularRaiz();
		System.out.println("La raíz es: "+raiz);
	}
}