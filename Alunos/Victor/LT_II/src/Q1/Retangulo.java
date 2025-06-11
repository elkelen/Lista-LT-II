package Q1;

class Retangulo {
    private double largura;
    private double altura;

    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

   
    public double calcularArea() {
        return largura * altura;
    }

    
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    
    public void exibirInformacoes() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
