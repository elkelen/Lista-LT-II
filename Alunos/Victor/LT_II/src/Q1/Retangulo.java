package Q1;

class Retangulo {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para exibir os dados
    public void exibirInformacoes() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
