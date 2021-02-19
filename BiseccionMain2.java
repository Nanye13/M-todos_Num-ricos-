class BiseccionMain2{
	public static void main(String[] args){
		Biseccion2 c = new Biseccion2(0,1,1e-5,20);
		double raiz = c.calcularRaiz();
		System.out.println("La raíz es: "+raiz);
	}
}