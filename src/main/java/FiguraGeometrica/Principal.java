
package FiguraGeometrica;


public class Principal {
    public static void main(String[] args) {
        
   Triangulo triangulo = new Triangulo();
   triangulo.leitura();
   System.out.println("area do triângulo:" + triangulo.getArea());
   
   Circulo circulo = new Circulo();
   circulo.leitura();
   System.out.println(circulo.paraString());
   System.out.println("area do círculo:" + circulo.getArea());
}

}
