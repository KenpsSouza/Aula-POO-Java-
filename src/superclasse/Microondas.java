package superclasse;

	public class Microondas extends Eletrodomestico {
	    private double capacidade; 
	    private int nivelPotencia; 
	    private boolean temGrill;
	    private boolean temDescongelamento;
	    private int tempoRestante;
	    private boolean portaAberta;
	    private String tipoDisplay;
	    private boolean temRelogio;
	    private boolean temTimer;
	    private boolean funcionando;
	    
	    
	    public Microondas() {
	        super();
	        this.capacidade = 30.0;
	        this.nivelPotencia = 5;
	        this.temGrill = false;
	        this.temDescongelamento = true;
	        this.tempoRestante = 0;
	        this.portaAberta = false;
	        this.tipoDisplay = "Digital";
	        this.temRelogio = true;
	        this.temTimer = true;
	        this.funcionando = false;
	    }
	    
	    public Microondas(String marca, String modelo, String cor, double preco, int potencia, int voltagem) {
	        super(marca, modelo, cor, preco, potencia, voltagem);
	        this.capacidade = 30.0;
	        this.nivelPotencia = 5;
	        this.temGrill = false;
	        this.temDescongelamento = true;
	        this.tempoRestante = 0;
	        this.portaAberta = false;
	        this.tipoDisplay = "Digital";
	        this.temRelogio = true;
	        this.temTimer = true;
	        this.funcionando = false;
	    }
	    
	    public Microondas(String marca, String modelo, String cor, double preco, int potencia, int voltagem,
	                      double capacidade, boolean temGrill, boolean temDescongelamento, String tipoDisplay) {
	        super(marca, modelo, cor, preco, potencia, voltagem);
	        this.capacidade = capacidade;
	        this.nivelPotencia = 5;
	        this.temGrill = temGrill;
	        this.temDescongelamento = temDescongelamento;
	        this.tempoRestante = 0;
	        this.portaAberta = false;
	        this.tipoDisplay = tipoDisplay;
	        this.temRelogio = true;
	        this.temTimer = true;
	        this.funcionando = false;
	    }
	    
	    public void abrirPorta() {
	        if (funcionando) {
	            pararFuncionamento();
	            System.out.println("Microondas parado automaticamente - porta aberta");
	        }
	        portaAberta = true;
	        System.out.println("Porta do microondas aberta");
	    }
	    
	    public void fecharPorta() {
	        portaAberta = false;
	        System.out.println("Porta do microondas fechada");
	    }
	    
	    public void definirTempo(int minutos, int segundos) {
	        if (portaAberta) {
	            System.out.println("Feche a porta primeiro!");
	            return;
	        }
	        
	        tempoRestante = (minutos * 60) + segundos;
	        System.out.println("Tempo definido: " + minutos + ":" + 
	                         String.format("%02d", segundos));
	    }
	    
	    public void definirPotencia(int nivel) {
	        if (nivel >= 1 && nivel <= 10) {
	            this.nivelPotencia = nivel;
	            System.out.println("Potência definida para nível " + nivel);
	        } else {
	            System.out.println("Nível de potência deve estar entre 1 e 10!");
	        }
	    }
	    
	    public void iniciarAquecimento() {
	        if (!ligado) {
	            System.out.println("Ligue o microondas primeiro!");
	            return;
	        }
	        
	        if (portaAberta) {
	            System.out.println("Feche a porta para iniciar!");
	            return;
	        }
	        
	        if (tempoRestante <= 0) {
	            System.out.println("Defina um tempo primeiro!");
	            return;
	        }
	        
	        funcionando = true;
	        System.out.println("Microondas iniciado!");
	        System.out.println("Aquecendo por " + (tempoRestante / 60) + ":" + 
	                         String.format("%02d", tempoRestante % 60) + 
	                         " na potência nível " + nivelPotencia);
	        
	        executarCiclo();
	    }
	    
	    private void executarCiclo() {
	        try {
	            int tempoSimulacao = Math.min(tempoRestante, 3); 
	            
	            for (int i = tempoSimulacao; i > 0; i--) {
	                if (!funcionando) break; 
	                
	                System.out.println("Tempo restante: " + i + " segundos");
	                Thread.sleep(1000);
	                tempoRestante--;
	            }
	            
	            if (funcionando && tempoRestante <= 0) {
	                funcionando = false;
	                System.out.println("BEEP! BEEP! BEEP! - Aquecimento concluído!");
	                tempoRestante = 0;
	            }
	        } catch (InterruptedException e) {
	            System.out.println("Funcionamento interrompido!");
	        }
	    }
	    
	    public void pararFuncionamento() {
	        if (funcionando) {
	            funcionando = false;
	            System.out.println("Microondas parado");
	        } else {
	            System.out.println("Microondas não está funcionando");
	        }
	    }
	    
	    public void descongelar(int minutos) {
	        if (!temDescongelamento) {
	            System.out.println("Este microondas não possui função descongelamento!");
	            return;
	        }
	        
	        System.out.println("Modo descongelamento ativado por " + minutos + " minutos");
	        definirTempo(minutos, 0);
	        definirPotencia(3); 
	        iniciarAquecimento();
	    }
	    
	    public void ativarGrill(int minutos) {
	        if (!temGrill) {
	            System.out.println("Este microondas não possui grill!");
	            return;
	        }
	        
	        System.out.println("Modo grill ativado por " + minutos + " minutos");
	        definirTempo(minutos, 0);
	        definirPotencia(8); 
	        iniciarAquecimento();
	    }
	    
	    public void aquecimentoRapido(int segundos) {
	        System.out.println("Aquecimento rápido por " + segundos + " segundos");
	        definirTempo(0, segundos);
	        definirPotencia(10); // Potência máxima
	        iniciarAquecimento();
	    }
	    
	    @Override
	    public void ligar() {
	        super.ligar();
	        if (ligado) {
	            System.out.println("Display aceso - Microondas pronto para uso");
	            if (temRelogio) {
	                System.out.println("Relógio exibindo: 12:00");
	            }
	        }
	    }
	    
	    @Override
	    public void desligar() {
	        if (funcionando) {
	            pararFuncionamento();
	        }
	        super.desligar();
	        tempoRestante = 0;
	        nivelPotencia = 5;
	        System.out.println("Display apagado");
	    }
	    
	    @Override
	    public void exibirInformacoes() {
	        super.exibirInformacoes();
	        System.out.println("=== Informações Específicas do Microondas ===");
	        System.out.println("Capacidade: " + capacidade + "L");
	        System.out.println("Nível de potência: " + nivelPotencia + "/10");
	        System.out.println("Tem grill: " + (temGrill ? "Sim" : "Não"));
	        System.out.println("Tem descongelamento: " + (temDescongelamento ? "Sim" : "Não"));
	        System.out.println("Tipo de display: " + tipoDisplay);
	        System.out.println("Tem relógio: " + (temRelogio ? "Sim" : "Não"));
	        System.out.println("Tem timer: " + (temTimer ? "Sim" : "Não"));
	        System.out.println("Porta: " + (portaAberta ? "Aberta" : "Fechada"));
	        System.out.println("Status: " + (funcionando ? "Funcionando" : "Parado"));
	        if (tempoRestante > 0) {
	            System.out.println("Tempo restante: " + (tempoRestante / 60) + ":" + 
	                             String.format("%02d", tempoRestante % 60));
	        }
	    }
	    
	    public double getCapacidade() {
	        return capacidade;
	    }
	    
	    public void setCapacidade(double capacidade) {
	        if (capacidade > 0) {
	            this.capacidade = capacidade;
	        } else {
	            System.out.println("Capacidade deve ser positiva!");
	        }
	    }
	    
	    public int getNivelPotencia() {
	        return nivelPotencia;
	    }
	    
	    public void setNivelPotencia(int nivelPotencia) {
	        if (nivelPotencia >= 1 && nivelPotencia <= 10) {
	            this.nivelPotencia = nivelPotencia;
	        } else {
	            System.out.println("Nível de potência deve estar entre 1 e 10!");
	        }
	    }
	    
	    public boolean isTemGrill() {
	        return temGrill;
	    }
	    
	    public void setTemGrill(boolean temGrill) {
	        this.temGrill = temGrill;
	    }
	    
	    public boolean isTemDescongelamento() {
	        return temDescongelamento;
	    }
	    
	    public void setTemDescongelamento(boolean temDescongelamento) {
	        this.temDescongelamento = temDescongelamento;
	    }
	    
	    public int getTempoRestante() {
	        return tempoRestante;
	    }
	    
	    public boolean isPortaAberta() {
	        return portaAberta;
	    }
	    
	    public String getTipoDisplay() {
	        return tipoDisplay;
	    }
	    
	    public void setTipoDisplay(String tipoDisplay) {
	        this.tipoDisplay = tipoDisplay;
	    }
	    
	    public boolean isTemRelogio() {
	        return temRelogio;
	    }
	    
	    public void setTemRelogio(boolean temRelogio) {
	        this.temRelogio = temRelogio;
	    }
	    
	    public boolean isTemTimer() {
	        return temTimer;
	    }
	    
	    public void setTemTimer(boolean temTimer) {
	        this.temTimer = temTimer;
	    }
	    
	    public boolean isFuncionando() {
	        return funcionando;
	    }
	    
	    public String toString() {
	        return "Microondas{" +
	                "marca='" + marca + '\'' +
	                ", modelo='" + modelo + '\'' +
	                ", capacidade=" + capacidade + "L" +
	                ", nivelPotencia=" + nivelPotencia +
	                ", temGrill=" + temGrill +
	                ", temDescongelamento=" + temDescongelamento +
	                ", tipoDisplay='" + tipoDisplay + '\'' +
	                ", potencia=" + potencia + "W" +
	                ", portaAberta=" + portaAberta +
	                ", funcionando=" + funcionando +
	                '}';
	    }
	}


