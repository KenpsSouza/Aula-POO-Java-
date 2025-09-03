package superclasse;

public class Eletrodomestico {
    // Atributos protegidos para serem acessados pelas subclasses
    protected String marca;
    protected String modelo;
    protected String cor;
    protected double preco;
    protected int potencia; // em watts
    protected boolean ligado;
    protected int voltagem; // 110 ou 220
    
    // Construtor padrão
    public Eletrodomestico() {
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.preco = 0.0;
        this.potencia = 0;
        this.ligado = false;
        this.voltagem = 110;
    }
    
    // Construtor com parâmetros
    public Eletrodomestico(String marca, String modelo, String cor, double preco, int potencia, int voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.potencia = potencia;
        this.ligado = false;
        this.voltagem = voltagem;
    }
    
    // Métodos principais
    public void ligar() {
        if (!ligado) {
            this.ligado = true;
            System.out.println(marca + " " + modelo + " foi ligado(a).");
        } else {
            System.out.println(marca + " " + modelo + " já está ligado(a).");
        }
    }
    
    public void desligar() {
        if (ligado) {
            this.ligado = false;
            System.out.println(marca + " " + modelo + " foi desligado(a).");
        } else {
            System.out.println(marca + " " + modelo + " já está desligado(a).");
        }
    }
    
    public double calcularConsumoEnergia(double horasUso) {
        // Consumo em kWh = (Potência em watts / 1000) * horas de uso
        return (potencia / 1000.0) * horasUso;
    }
    
    public double calcularCustoEnergia(double horasUso, double tarifaKwh) {
        return calcularConsumoEnergia(horasUso) * tarifaKwh;
    }
    
    // Método para exibir informações básicas
    public void exibirInformacoes() {
        System.out.println("=== Informações do Eletrodoméstico ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Voltagem: " + voltagem + "V");
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
    
    // Getters e Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo!");
        }
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void setPotencia(int potencia) {
        if (potencia >= 0) {
            this.potencia = potencia;
        } else {
            System.out.println("Potência não pode ser negativa!");
        }
    }
    
    public boolean isLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public int getVoltagem() {
        return voltagem;
    }
    
    public void setVoltagem(int voltagem) {
        if (voltagem == 110 || voltagem == 220) {
            this.voltagem = voltagem;
        } else {
            System.out.println("Voltagem deve ser 110V ou 220V!");
        }
    }
    
    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                ", potencia=" + potencia +
                ", ligado=" + ligado +
                ", voltagem=" + voltagem +
                '}';
    }
}