package sistemtransporte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SIMULADOR DE TRANSPORTE ===");
        System.out.println("1 - Carro (80 km/h)");
        System.out.println("2 - Bicicleta (20 km/h)");
        System.out.println("3 - Ônibus (60 km/h + paradas)");
        System.out.print("Digite sua opção: ");
        int opcao = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Digite o modelo do veículo: ");
        String modelo = sc.nextLine();
        
        System.out.print("Digite a distância (km): ");
        float distancia = sc.nextFloat();
        
        Veiculo veiculo = null;
        
        if (opcao == 1) {
            veiculo = new Carro(modelo);
        } else if (opcao == 2) {
            veiculo = new Bicicleta(modelo);
        } else if (opcao == 3) {
            System.out.print("Digite o número de paradas: ");
            int paradas = sc.nextInt();
            veiculo = new Onibus(modelo, paradas);
        } else {
            System.out.println("Opção inválida!");
            sc.close();
            return;
        }
        
        float tempo = veiculo.calcularTempo(distancia);
        int horas = (int) tempo;
        int minutos = (int) ((tempo - horas) * 60);
        
        System.out.println("=== RESULTADO ===");
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Tempo estimado: " + horas + " h e " + minutos + " minutos");
        System.out.printf("Velocidade média: %.1f km/h%n", (distancia / tempo));
   
        sc.close();
    }
}
