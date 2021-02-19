/** esta clase implementa la solucion de ecuaciones no lineales por el método
 * del punto fijo
 * @autor fulanito
 * @fecha 10/09/04
 */

class PuntoFijo{
/*****
  Miembros datos
*/
double p0, tol;
int ni;

/******
 Constructor
*/
public PuntoFijo(double p1, double tol1, int ni1)
{
  p0 = p1; tol = tol1; ni = ni1;
}

/******
  Función de la que se calculará la raíz
*/
private double f(double x){
//  double r = x - x*x*x - 4d*x*x + 10;
//  double r = Math.sqrt(10/(4+x));
//	double r = Math.sqrt(10-x*x*x)/2;
  double r = x - (x*x*x + 4d*x*x - 10)/(3d*x*x+8d*x);
  	return r;
}

public double calcularRaiz(){
  int i=1;
  double p = p0; 
  
  while(i<=ni){
    p = f(p0);
    if(Math.abs(p0-p)<tol)
      return p;
    i = i + 1;
	 p0 = p;
  }
  System.out.println("Fracaso despues de: "+i+" pasos");
  return p;
}


}
