package superclasse;

public class Batedeira extends Eletrodomestico {

	private int numeroVelocidades;
    private String tipoFuncao; // Bater, misturar, amassar
    private double capacidadeTigela; // em litros
    private boolean temTigela;
    private String materialTigela; // Inox, plástico, vidro
    private int velocidadeAtual;
    private boolean turboAtivo;
    
    // Construtor padrão
    public Batedeira() {
        super();
        this.numeroVelocidades = 5;
        this.tipoFuncao = "Bater";
        this.capacidadeTigela = 3.0;
        this.temTigela = true;
        this.materialTigela = "Inox";
        this.velocidadeAtual = 0;
        this.turboAtivo = false;
    }
    
    // Construtor com parâmetros básicos
    public Batedeira(String marca, String modelo, String cor, double preco, int potencia, int voltagem) {
        super(marca, modelo, cor, preco, potencia, voltagem);
        this.numeroVelocidades = 5;
        this.tipoFuncao = "Bater";
        this.capacidadeTigela = 3.0;
        this.temTigela = true;
        this.materialTigela = "Inox";
        this.velocidadeAtual = 0;
        this.turboAtivo = false;
    }
    
    // Construtor completo
    public Batedeira(String marca, String modelo, String cor, double preco, int potencia, int voltagem,
                     int numeroVelocidades, String tipoFuncao, double capacidadeTigela, 
                     boolean temTigela, String materialTigela) {
        super(marca, modelo, cor, preco, potencia, voltagem);
        this.numeroVelocidades = numeroVelocidades;
        this.tipoFuncao = tipoFuncao;
        this.capacidadeTigela = capacidadeTigela;
        this.temTigela = temTigela;
        this.materialTigela = materialTigela;
        this.velocidadeAtual = 0;
        this.turboAtivo = false;
    }
    
    // Métodos específicos da batedeira
    public void aumentarVelocidade() {
        if (!ligado) {
            System.out.println("Ligue a batedeira primeiro!");
            return;
        }
        
        if (velocidadeAtual < numeroVelocidades) {
            velocidadeAtual++;
            System.out.println("Velocidade aumentada para: " + velocidadeAtual);
        } else {
            System.out.println("Velocidade já está no máximo!");
        }
    }
    
    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("A batedeira está desligada!");
            return;
        }
        
        if (velocidadeAtual > 0) {
            velocidadeAtual--;
            System.out.println("Velocidade diminuída para: " + velocidadeAtual);
        } else {
            System.out.println("Velocidade já está no mínimo!");
        }
    }
    
    public void definirVelocidade(int velocidade) {
        if (!ligado) {
            System.out.println("Ligue a batedeira primeiro!");
            return;
        }
        
        if (velocidade >= 0 && velocidade <= numeroVelocidades) {
            this.velocidadeAtual = velocidade;
            System.out.println("Velocidade definida para: " + velocidadeAtual);
        } else {
            System.out.println("Velocidade inválida! Use valores entre 0 e " + numeroVelocidades);
        }
    }
    
    public void ativarTurbo() {
        if (!ligado) {
            System.out.println("Ligue a batedeira primeiro!");
            return;
        }
        
        if (!turboAtivo) {
            turboAtivo = true;
            System.out.println("Modo Turbo ativado!");
        } else {
            System.out.println("Modo Turbo já está ativo!");
        }
    }
    
    public void desativarTurbo() {
        if (turboAtivo) {
            turboAtivo = false;
            System.out.println("Modo Turbo desativado!");
        } else {
            System.out.println("Modo Turbo já está desativado!");
        }
    }
    
    public void bater(int minutos) {
        if (!ligado) {
            System.out.println("Ligue a batedeira primeiro!");
            return;
        }
        
        System.out.println("Batendo na velocidade " + velocidadeAtual + 
                         (turboAtivo ? " com Turbo" : "") + " por " + minutos + " minutos...");
        
        // Simula o tempo de funcionamento
        try {
            Thread.sleep(1000); // Simula 1 segundo = 1 minuto
            System.out.println("Processo de bater concluído!");
        } catch (InterruptedException e) {
            System.out.println("Processo interrompido!");
        }
    }
    
    public void misturar(int minutos) {
        if (!ligado) {
            System.out.println("Ligue a batedeira primeiro!");
            return;
        }
        
        System.out.println("Misturando na velocidade " + velocidadeAtual + " por " + minutos + " minutos...");
        
        try {
            Thread.sleep(1000);
            System.out.println("Processo de misturar concluído!");
        } catch (InterruptedException e) {
            System.out.println("Processo interrompido!");
        }
    }
    
    @Override
    public void ligar() {
        super.ligar();
        if (ligado) {
            velocidadeAtual = 1; // Inicia na velocidade mínima
            System.out.println("Batedeira iniciada na velocidade 1");
        }
    }
    
    @Override
    public void desligar() {
        super.desligar();
        velocidadeAtual = 0;
        turboAtivo = false;
        System.out.println("Velocidade resetada e Turbo desativado");
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("=== Informações Específicas da Batedeira ===");
        System.out.println("Número de velocidades: " + numeroVelocidades);
        System.out.println("Tipo de função: " + tipoFuncao);
        System.out.println("Capacidade da tigela: " + capacidadeTigela + "L");
        System.out.println("Tem tigela: " + (temTigela ? "Sim" : "Não"));
        System.out.println("Material da tigela: " + materialTigela);
        System.out.println("Velocidade atual: " + velocidadeAtual);
        System.out.println("Turbo ativo: " + (turboAtivo ? "Sim" : "Não"));
    }
    
    // Getters e Setters específicos
    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }
    
    public void setNumeroVelocidades(int numeroVelocidades) {
        if (numeroVelocidades > 0) {
            this.numeroVelocidades = numeroVelocidades;
        } else {
            System.out.println("Número de velocidades deve ser positivo!");
        }
    }
    
    public String getTipoFuncao() {
        return tipoFuncao;
    }
    
    public void setTipoFuncao(String tipoFuncao) {
        this.tipoFuncao = tipoFuncao;
    }
    
    public double getCapacidadeTigela() {
        return capacidadeTigela;
    }
    
    public void setCapacidadeTigela(double capacidadeTigela) {
        if (capacidadeTigela > 0) {
            this.capacidadeTigela = capacidadeTigela;
        } else {
            System.out.println("Capacidade da tigela deve ser positiva!");
        }
    }
    
    public boolean isTemTigela() {
        return temTigela;
    }
    
    public void setTemTigela(boolean temTigela) {
        this.temTigela = temTigela;
    }
    
    public String getMaterialTigela() {
        return materialTigela;
    }
    
    public void setMaterialTigela(String materialTigela) {
        this.materialTigela = materialTigela;
    }
    
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public boolean isTurboAtivo() {
        return turboAtivo;
    }
    
    @Override
    public String toString() {
        return "Batedeira{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroVelocidades=" + numeroVelocidades +
                ", tipoFuncao='" + tipoFuncao + '\'' +
                ", capacidadeTigela=" + capacidadeTigela +
                ", temTigela=" + temTigela +
                ", materialTigela='" + materialTigela + '\'' +
                ", velocidadeAtual=" + velocidadeAtual +
                ", turboAtivo=" + turboAtivo +
                ", potencia=" + potencia + "W" +
                ", ligado=" + ligado +
                '}';
    }
}