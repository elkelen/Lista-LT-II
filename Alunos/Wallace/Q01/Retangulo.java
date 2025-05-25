package lista.wallace.Q01;

public class Retangulo {
      double base;
    double altura;
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return (base +altura) * 2;
    } 
    
}
