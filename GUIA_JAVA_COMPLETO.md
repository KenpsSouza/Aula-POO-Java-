# 📚 GUIA COMPLETO DE JAVA - DOS CONCEITOS BÁSICOS AOS AVANÇADOS

> **Baseado no projeto Aula-POO-Java**  
> **Data:** 19 de agosto de 2025  
> **Autor:** Kenps Souza  
> **Objetivo:** Guia didático para iniciantes em Java

---

## 📖 ÍNDICE

1. [Conceitos Fundamentais](#1-conceitos-fundamentais)
2. [Estrutura Básica](#2-estrutura-básica)
3. [Tipos de Dados e Variáveis](#3-tipos-de-dados-e-variáveis)
4. [Operadores](#4-operadores)
5. [Estruturas de Controle](#5-estruturas-de-controle)
6. [Métodos](#6-métodos)
7. [Programação Orientada a Objetos](#7-programação-orientada-a-objetos)
8. [Encapsulamento](#8-encapsulamento)
9. [Construtores](#9-construtores)
10. [Arrays e Collections](#10-arrays-e-collections)
11. [Entrada e Saída de Dados](#11-entrada-e-saída-de-dados)
12. [Tratamento de Exceções](#12-tratamento-de-exceções)
13. [Conceitos Avançados](#13-conceitos-avançados)
14. [Boas Práticas](#14-boas-práticas)

---

## 1. CONCEITOS FUNDAMENTAIS

### 🔍 **O que é Java?**
- Linguagem de programação orientada a objetos
- "Write Once, Run Anywhere" (Escreva uma vez, execute em qualquer lugar)
- Multiplataforma (funciona em Windows, Linux, Mac)

### 🎯 **Características Principais:**
- **Orientada a Objetos:** Tudo é baseado em classes e objetos
- **Fortemente Tipada:** Cada variável tem um tipo específico
- **Gerenciamento Automático de Memória:** Garbage Collector
- **Segura:** Verificações de segurança em tempo de execução

### 📁 **Estrutura de Arquivos:**
```
src/
  └── pacote/
      ├── Classe1.java
      ├── Classe2.java
      └── Main.java
```

---

## 2. ESTRUTURA BÁSICA

### 📝 **Estrutura de um Arquivo Java:**

```java
// 1. Declaração do pacote (opcional)
package copiaconta;

// 2. Importações (opcional)
import java.util.Scanner;

// 3. Comentários de documentação
/**
 * Classe que representa uma conta bancária
 * @author Kenps Souza
 * @version 1.0
 */

// 4. Declaração da classe
public class ContaBancaria {
    
    // 5. Atributos da classe
    private double saldo;
    
    // 6. Métodos da classe
    public double getSaldo() {
        return saldo;
    }
    
    // 7. Método principal (apenas em classes executáveis)
    public static void main(String[] args) {
        // Código principal aqui
    }
}
```

### 🔧 **Elementos Essenciais:**

1. **Package:** Organiza classes em namespaces
2. **Import:** Importa classes de outros pacotes
3. **Class:** Define uma nova classe
4. **Public/Private:** Modificadores de acesso
5. **Static:** Pertence à classe, não ao objeto
6. **Main:** Ponto de entrada do programa

---

## 3. TIPOS DE DADOS E VARIÁVEIS

### 🔢 **Tipos Primitivos:**

```java
// Números inteiros
byte idade = 25;        // -128 a 127
short ano = 2025;       // -32,768 a 32,767
int populacao = 1000000; // -2 bilhões a 2 bilhões
long distancia = 150000000000L; // Muito grande

// Números decimais
float preco = 19.99F;   // Precisão simples
double salario = 5500.75; // Precisão dupla (mais usado)

// Caractere
char letra = 'A';       // Um único caractere

// Lógico
boolean ativo = true;   // true ou false
boolean inativo = false;
```

### 📝 **Tipos de Referência:**

```java
// String (texto)
String nome = "João Silva";
String frase = "Olá, mundo!";

// Arrays
int[] numeros = {1, 2, 3, 4, 5};
String[] nomes = {"Ana", "Bruno", "Carlos"};

// Objetos
Scanner sc = new Scanner(System.in);
ContaBancaria conta = new ContaBancaria();
```

### 🏷️ **Declaração de Variáveis:**

```java
// Padrão: tipo nome = valor;
int idade = 30;
String nome = "Maria";
double altura = 1.75;

// Múltiplas variáveis do mesmo tipo
int x = 10, y = 20, z = 30;

// Constantes (final)
final double PI = 3.14159;
final int IDADE_MAXIMA = 100;
```

---

## 4. OPERADORES

### ➕ **Operadores Aritméticos:**

```java
int a = 10, b = 3;

int soma = a + b;        // 13
int subtracao = a - b;   // 7
int multiplicacao = a * b; // 30
int divisao = a / b;     // 3 (divisão inteira)
int resto = a % b;       // 1 (módulo)

// Incremento e decremento
a++;  // a = a + 1
a--;  // a = a - 1
++a;  // Pré-incremento
--a;  // Pré-decremento
```

### 🔍 **Operadores de Comparação:**

```java
int x = 5, y = 10;

boolean igual = (x == y);      // false
boolean diferente = (x != y);  // true
boolean menor = (x < y);       // true
boolean maior = (x > y);       // false
boolean menorIgual = (x <= y); // true
boolean maiorIgual = (x >= y); // false
```

### 🔗 **Operadores Lógicos:**

```java
boolean a = true, b = false;

boolean e = a && b;      // false (AND)
boolean ou = a || b;     // true (OR)
boolean nao = !a;        // false (NOT)

// Exemplo prático
if (idade >= 18 && idade <= 65) {
    System.out.println("Pode trabalhar");
}
```

### 📝 **Operadores de Atribuição:**

```java
int x = 10;

x += 5;  // x = x + 5  (15)
x -= 3;  // x = x - 3  (12)
x *= 2;  // x = x * 2  (24)
x /= 4;  // x = x / 4  (6)
x %= 5;  // x = x % 5  (1)
```

---

## 5. ESTRUTURAS DE CONTROLE

### ❓ **Estrutura Condicional IF:**

```java
// IF simples
if (idade >= 18) {
    System.out.println("Maior de idade");
}

// IF-ELSE
if (nota >= 7.0) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}

// IF-ELSE-IF
if (nota >= 9.0) {
    System.out.println("Excelente");
} else if (nota >= 7.0) {
    System.out.println("Bom");
} else if (nota >= 5.0) {
    System.out.println("Regular");
} else {
    System.out.println("Insuficiente");
}
```

### 🔀 **Estrutura SWITCH:**

```java
int opcao = 2;

switch (opcao) {
    case 1:
        System.out.println("Opção 1 selecionada");
        break;
    case 2:
        System.out.println("Opção 2 selecionada");
        break;
    case 3:
        System.out.println("Opção 3 selecionada");
        break;
    default:
        System.out.println("Opção inválida");
        break;
}

// Switch com String (Java 7+)
String dia = "segunda";
switch (dia) {
    case "segunda":
    case "terca":
        System.out.println("Início da semana");
        break;
    case "sabado":
    case "domingo":
        System.out.println("Final de semana");
        break;
}
```

### 🔄 **Laços de Repetição:**

#### **FOR (quantidade conhecida):**
```java
// FOR básico
for (int i = 0; i < 10; i++) {
    System.out.println("Número: " + i);
}

// FOR-EACH (para arrays/collections)
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}

String[] nomes = {"Ana", "Bruno", "Carlos"};
for (String nome : nomes) {
    System.out.println("Nome: " + nome);
}
```

#### **WHILE (condição no início):**
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}

// Lendo entrada do usuário
Scanner sc = new Scanner(System.in);
int numero = 0;
while (numero != -1) {
    System.out.print("Digite um número (-1 para sair): ");
    numero = sc.nextInt();
}
```

#### **DO-WHILE (condição no final):**
```java
int opcao;
do {
    System.out.println("1 - Jogar");
    System.out.println("0 - Sair");
    opcao = sc.nextInt();
    
    if (opcao == 1) {
        System.out.println("Jogando...");
    }
} while (opcao != 0);
```

---

## 6. MÉTODOS

### 🔧 **Estrutura de um Método:**

```java
// modificador tipo nome(parâmetros) {
//     corpo do método
//     return valor; // se necessário
// }

public static int somar(int a, int b) {
    return a + b;
}
```

### 📋 **Tipos de Métodos:**

#### **Método sem retorno (void):**
```java
public void exibirMensagem() {
    System.out.println("Olá, mundo!");
}

public void exibirNome(String nome) {
    System.out.println("Nome: " + nome);
}
```

#### **Método com retorno:**
```java
public int calcularIdade(int anoNascimento) {
    int anoAtual = 2025;
    return anoAtual - anoNascimento;
}

public double calcularMedia(double nota1, double nota2) {
    return (nota1 + nota2) / 2.0;
}

public boolean ehMaiorDeIdade(int idade) {
    return idade >= 18;
}
```

#### **Método static (da classe):**
```java
public static void main(String[] args) {
    // Pode ser chamado sem criar objeto
}

public static int somar(int a, int b) {
    return a + b;
}

// Uso:
int resultado = MinhaClasse.somar(5, 3);
```

#### **Método de instância (do objeto):**
```java
public class Pessoa {
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

// Uso:
Pessoa p = new Pessoa();
p.setNome("João");
String nome = p.getNome();
```

---

## 7. PROGRAMAÇÃO ORIENTADA A OBJETOS

### 🎭 **Conceitos Fundamentais:**

#### **Classe:** Molde/modelo para criar objetos
```java
public class Pessoa {
    // Atributos (características)
    private String nome;
    private int idade;
    
    // Métodos (comportamentos)
    public void falar() {
        System.out.println(nome + " está falando");
    }
}
```

#### **Objeto:** Instância de uma classe
```java
// Criando objetos
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = new Pessoa();

// Cada objeto tem seus próprios valores
pessoa1.setNome("Ana");
pessoa2.setNome("Bruno");
```

### 🏗️ **Exemplo Completo de Classe:**

```java
public class ContaBancaria {
    // ATRIBUTOS (estado do objeto)
    private double saldo;
    private String titular;
    private int numero;
    
    // CONSTRUTOR
    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }
    
    // MÉTODOS (comportamentos)
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: " + valor);
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
            return true;
        }
        return false;
    }
    
    // GETTERS E SETTERS
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
}
```

### 🎯 **Princípios da POO:**

1. **Abstração:** Simplificar a realidade
2. **Encapsulamento:** Proteger dados internos
3. **Herança:** Reutilizar código
4. **Polimorfismo:** Múltiplas formas

---

## 8. ENCAPSULAMENTO

### 🔒 **Modificadores de Acesso:**

```java
public class Exemplo {
    public int publico;        // Acessível de qualquer lugar
    private int privado;       // Apenas dentro da classe
    protected int protegido;   // Classe e subclasses
    int pacote;               // Apenas no mesmo pacote
}
```

### 🛡️ **Getters e Setters:**

```java
public class Produto {
    private String nome;
    private double preco;
    
    // GETTER - para obter valor
    public String getNome() {
        return nome;
    }
    
    // SETTER - para definir valor
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
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
}
```

### ✅ **Vantagens do Encapsulamento:**

- **Segurança:** Dados protegidos
- **Validação:** Controle de entrada
- **Manutenibilidade:** Mudanças internas não afetam o uso
- **Flexibilidade:** Pode mudar implementação interna

---

## 9. CONSTRUTORES

### 🏗️ **O que são Construtores:**
- Métodos especiais para inicializar objetos
- Têm o mesmo nome da classe
- Não têm tipo de retorno
- Executados automaticamente ao criar objeto

### 📝 **Tipos de Construtores:**

#### **Construtor Padrão:**
```java
public class Pessoa {
    private String nome;
    private int idade;
    
    // Construtor padrão (sem parâmetros)
    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }
}

// Uso:
Pessoa p = new Pessoa(); // Chama construtor padrão
```

#### **Construtor com Parâmetros:**
```java
public class Pessoa {
    private String nome;
    private int idade;
    
    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

// Uso:
Pessoa p = new Pessoa("João", 25);
```

#### **Múltiplos Construtores (Sobrecarga):**
```java
public class ContaBancaria {
    private double saldo;
    private String titular;
    
    // Construtor 1: apenas titular
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    // Construtor 2: titular e saldo inicial
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    // Construtor 3: chamando outro construtor
    public ContaBancaria() {
        this("Titular Padrão", 0.0);
    }
}

// Uso:
ContaBancaria conta1 = new ContaBancaria("Ana");
ContaBancaria conta2 = new ContaBancaria("Bruno", 1000.0);
ContaBancaria conta3 = new ContaBancaria();
```

---

## 10. ARRAYS E COLLECTIONS

### 📊 **Arrays (Vetores):**

#### **Declaração e Inicialização:**
```java
// Declaração
int[] numeros;
String[] nomes;

// Inicialização com tamanho
numeros = new int[5];        // Array de 5 inteiros
nomes = new String[10];      // Array de 10 strings

// Declaração e inicialização juntas
int[] idades = new int[3];
String[] cidades = {"São Paulo", "Rio", "Brasília"};
double[] notas = {8.5, 7.2, 9.1, 6.8};
```

#### **Uso de Arrays:**
```java
int[] numeros = {10, 20, 30, 40, 50};

// Acessar elementos (índice começa em 0)
int primeiro = numeros[0];   // 10
int ultimo = numeros[4];     // 50

// Modificar elementos
numeros[1] = 25;            // {10, 25, 30, 40, 50}

// Tamanho do array
int tamanho = numeros.length; // 5

// Percorrer array
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Posição " + i + ": " + numeros[i]);
}

// For-each (mais simples)
for (int numero : numeros) {
    System.out.println(numero);
}
```

### 📋 **Collections (Listas):**

#### **ArrayList (Lista Dinâmica):**
```java
import java.util.ArrayList;
import java.util.List;

// Criação
ArrayList<String> nomes = new ArrayList<>();
List<Integer> numeros = new ArrayList<>();

// Adicionar elementos
nomes.add("Ana");
nomes.add("Bruno");
nomes.add("Carlos");

// Acessar elementos
String primeiro = nomes.get(0);     // "Ana"
int tamanho = nomes.size();         // 3

// Verificar se contém
boolean temAna = nomes.contains("Ana"); // true

// Remover elementos
nomes.remove("Bruno");              // Remove por valor
nomes.remove(0);                    // Remove por índice

// Percorrer lista
for (String nome : nomes) {
    System.out.println(nome);
}

// Com índice
for (int i = 0; i < nomes.size(); i++) {
    System.out.println(i + ": " + nomes.get(i));
}
```

#### **Exemplo Prático:**
```java
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private List<Produto> produtos;
    
    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
    }
    
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null; // Não encontrou
    }
}
```

---

## 11. ENTRADA E SAÍDA DE DADOS

### ⌨️ **Scanner (Entrada de Dados):**

```java
import java.util.Scanner;

public class ExemploEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ler String (linha inteira)
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        // Ler int
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        // Ler double
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        
        // Ler char (primeiro caractere)
        System.out.print("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        
        // Ler boolean
        System.out.print("Está estudando? (true/false): ");
        boolean estudando = sc.nextBoolean();
        
        // IMPORTANTE: Limpar buffer após nextInt(), nextDouble(), etc.
        sc.nextLine(); // Consome a quebra de linha pendente
        
        System.out.print("Digite um comentário: ");
        String comentario = sc.nextLine();
        
        // Fechar Scanner
        sc.close();
    }
}
```

### 🖥️ **System.out (Saída de Dados):**

```java
// Imprimir com quebra de linha
System.out.println("Olá, mundo!");

// Imprimir sem quebra de linha
System.out.print("Digite algo: ");

// Formatação com printf
String nome = "João";
int idade = 25;
double altura = 1.75;

System.out.printf("Nome: %s\n", nome);
System.out.printf("Idade: %d anos\n", idade);
System.out.printf("Altura: %.2f metros\n", altura);
System.out.printf("%s tem %d anos e %.2f de altura\n", nome, idade, altura);

// Concatenação de strings
System.out.println("Nome: " + nome + ", Idade: " + idade);

// String.format
String mensagem = String.format("Olá, %s! Você tem %d anos.", nome, idade);
System.out.println(mensagem);
```

### 📝 **Formatação de Texto:**

```java
// Especificadores de formato
%s  // String
%d  // Inteiro
%f  // Float/Double
%.2f // Double com 2 casas decimais
%c  // Caractere
%b  // Boolean

// Exemplos
double preco = 19.99;
System.out.printf("Preço: R$ %.2f\n", preco); // Preço: R$ 19,99

int quantidade = 5;
System.out.printf("Quantidade: %03d\n", quantidade); // Quantidade: 005
```

---

## 12. TRATAMENTO DE EXCEÇÕES

### ⚠️ **O que são Exceções:**
- Erros que podem ocorrer durante a execução
- Interrompem o fluxo normal do programa
- Podem ser tratadas para evitar crashes

### 🛡️ **Try-Catch:**

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Código que pode gerar exceção
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            
            System.out.print("Digite outro número: ");
            int divisor = sc.nextInt();
            
            int resultado = numero / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (InputMismatchException e) {
            // Trata entrada inválida
            System.out.println("Erro: Digite apenas números!");
            
        } catch (ArithmeticException e) {
            // Trata divisão por zero
            System.out.println("Erro: Não é possível dividir por zero!");
            
        } catch (Exception e) {
            // Trata qualquer outra exceção
            System.out.println("Erro inesperado: " + e.getMessage());
            
        } finally {
            // Sempre executa
            sc.close();
            System.out.println("Scanner fechado.");
        }
    }
}
```

### 🔧 **Exemplo Prático de Validação:**

```java
public static int lerInteiroComValidacao(Scanner sc, String mensagem) {
    int valor;
    while (true) {
        try {
            System.out.print(mensagem);
            valor = sc.nextInt();
            sc.nextLine(); // Limpa buffer
            return valor;
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas números inteiros!");
            sc.nextLine(); // Limpa entrada inválida
        }
    }
}

public static double lerDoubleComValidacao(Scanner sc, String mensagem) {
    double valor;
    while (true) {
        try {
            System.out.print(mensagem);
            valor = sc.nextDouble();
            sc.nextLine(); // Limpa buffer
            
            if (valor < 0) {
                System.out.println("Valor não pode ser negativo!");
                continue;
            }
            
            return valor;
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas números!");
            sc.nextLine(); // Limpa entrada inválida
        }
    }
}
```

### 📋 **Exceções Comuns:**

```java
// NumberFormatException
try {
    int numero = Integer.parseInt("abc"); // Erro!
} catch (NumberFormatException e) {
    System.out.println("Não é um número válido!");
}

// NullPointerException
String texto = null;
try {
    int tamanho = texto.length(); // Erro!
} catch (NullPointerException e) {
    System.out.println("String é nula!");
}

// ArrayIndexOutOfBoundsException
int[] array = {1, 2, 3};
try {
    int valor = array[5]; // Erro!
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice inválido!");
}
```

---

## 13. CONCEITOS AVANÇADOS

### 🔄 **Métodos Estáticos vs Instância:**

```java
public class Calculadora {
    private String nome; // Atributo de instância
    
    // Método estático - pertence à classe
    public static int somar(int a, int b) {
        return a + b;
    }
    
    // Método de instância - pertence ao objeto
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibirInfo() {
        System.out.println("Calculadora: " + nome);
    }
}

// Uso:
// Método estático - não precisa criar objeto
int resultado = Calculadora.somar(5, 3);

// Método de instância - precisa criar objeto
Calculadora calc = new Calculadora();
calc.setNome("Calc Pro");
calc.exibirInfo();
```

### 🔧 **Sobrecarga de Métodos:**

```java
public class Calculadora {
    
    // Método para somar 2 inteiros
    public int somar(int a, int b) {
        return a + b;
    }
    
    // Método para somar 3 inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Método para somar doubles
    public double somar(double a, double b) {
        return a + b;
    }
    
    // Método para somar array
    public int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
```

### 📝 **Palavra-chave THIS:**

```java
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;    // this.nome refere-se ao atributo
        this.idade = idade;  // idade refere-se ao parâmetro
    }
    
    public void setNome(String nome) {
        this.nome = nome; // Distingue atributo do parâmetro
    }
    
    public Pessoa criarCopia() {
        return new Pessoa(this.nome, this.idade); // this opcional aqui
    }
    
    public void compararIdade(Pessoa outra) {
        if (this.idade > outra.idade) {
            System.out.println(this.nome + " é mais velho");
        }
    }
}
```

### 🏗️ **Construtores Encadeados:**

```java
public class ContaBancaria {
    private String titular;
    private double saldo;
    private String agencia;
    
    // Construtor mais completo
    public ContaBancaria(String titular, double saldo, String agencia) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    
    // Construtor que chama o primeiro
    public ContaBancaria(String titular, double saldo) {
        this(titular, saldo, "0001"); // Chama o construtor acima
    }
    
    // Construtor que chama o segundo
    public ContaBancaria(String titular) {
        this(titular, 0.0); // Chama o construtor acima
    }
}
```

### 📊 **Métodos de Collections:**

```java
import java.util.*;

List<String> nomes = new ArrayList<>();

// Adicionar
nomes.add("Ana");
nomes.add("Bruno");
nomes.addAll(Arrays.asList("Carlos", "Diana"));

// Verificar
boolean vazio = nomes.isEmpty();
boolean temAna = nomes.contains("Ana");
int tamanho = nomes.size();

// Buscar
int indice = nomes.indexOf("Bruno");
String primeiro = nomes.get(0);

// Modificar
nomes.set(0, "Ana Paula"); // Substitui
Collections.sort(nomes);   // Ordena

// Remover
nomes.remove("Bruno");     // Por valor
nomes.remove(0);          // Por índice
nomes.clear();            // Remove todos

// Converter para array
String[] array = nomes.toArray(new String[0]);
```

---

## 14. BOAS PRÁTICAS

### 📝 **Convenções de Nomenclatura:**

```java
// Classes: PascalCase
public class ContaBancaria { }
public class GerenciadorProdutos { }

// Métodos e variáveis: camelCase
public void calcularSaldo() { }
private String nomeCompleto;
private int idadeAtual;

// Constantes: UPPER_SNAKE_CASE
public static final double PI = 3.14159;
public static final int IDADE_MAXIMA = 100;
private static final String MENSAGEM_ERRO = "Erro!";

// Pacotes: lowercase
package com.empresa.projeto;
package br.com.loja.produtos;
```

### 🔒 **Encapsulamento Correto:**

```java
public class Produto {
    // Atributos SEMPRE privados
    private String nome;
    private double preco;
    
    // Getters e Setters públicos com validação
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
    }
}
```

### 📋 **Documentação JavaDoc:**

```java
/**
 * Classe que representa um produto em uma loja
 * 
 * @author Kenps Souza
 * @version 1.0
 * @since 2025
 */
public class Produto {
    
    /**
     * Nome do produto
     */
    private String nome;
    
    /**
     * Aplica desconto no produto
     * 
     * @param percentual Percentual de desconto (0-100)
     * @return true se aplicou o desconto, false caso contrário
     * @throws IllegalArgumentException se percentual for inválido
     */
    public boolean aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual deve estar entre 0 e 100");
        }
        
        double desconto = preco * (percentual / 100);
        this.preco -= desconto;
        return true;
    }
}
```

### 🧹 **Código Limpo:**

```java
// ❌ RUIM
public class P {
    private String n;
    private int i;
    
    public void m1() {
        if (i > 18) {
            System.out.println("ok");
        }
    }
}

// ✅ BOM
public class Pessoa {
    private String nome;
    private int idade;
    
    public void verificarMaioridade() {
        if (idade >= 18) {
            System.out.println("Pessoa é maior de idade");
        } else {
            System.out.println("Pessoa é menor de idade");
        }
    }
}
```

### 🔧 **Tratamento de Erros:**

```java
public class ValidadorIdade {
    
    public static boolean validarIdade(int idade) {
        if (idade < 0) {
            System.err.println("Erro: Idade não pode ser negativa");
            return false;
        }
        
        if (idade > 150) {
            System.err.println("Aviso: Idade muito alta (" + idade + ")");
        }
        
        return true;
    }
    
    public static int lerIdadeSegura(Scanner sc) {
        while (true) {
            try {
                System.out.print("Digite a idade: ");
                int idade = sc.nextInt();
                
                if (validarIdade(idade)) {
                    return idade;
                }
                
            } catch (InputMismatchException e) {
                System.err.println("Erro: Digite apenas números!");
                sc.nextLine(); // Limpa entrada inválida
            }
        }
    }
}
```

### 📊 **Organização de Código:**

```java
public class ContaBancaria {
    
    // 1. CONSTANTES
    private static final double SALDO_MINIMO = 0.0;
    private static final double LIMITE_SAQUE = 1000.0;
    
    // 2. ATRIBUTOS
    private String titular;
    private double saldo;
    private int numero;
    
    // 3. CONSTRUTORES
    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = SALDO_MINIMO;
    }
    
    // 4. MÉTODOS PÚBLICOS
    public void depositar(double valor) {
        // implementação
    }
    
    public boolean sacar(double valor) {
        // implementação
        return true;
    }
    
    // 5. GETTERS E SETTERS
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // 6. MÉTODOS PRIVADOS (AUXILIARES)
    private boolean validarValor(double valor) {
        return valor > 0;
    }
    
    private void registrarOperacao(String tipo, double valor) {
        // implementação
    }
}
```

---

## 🎯 RESUMO DOS CONCEITOS PRINCIPAIS

### 🔤 **Sintaxe Básica:**
- Variáveis e tipos de dados
- Operadores (aritméticos, lógicos, comparação)
- Estruturas de controle (if, switch, loops)

### 🏗️ **Orientação a Objetos:**
- Classes e objetos
- Atributos e métodos
- Construtores
- Encapsulamento (getters/setters)

### 📚 **Estruturas de Dados:**
- Arrays (vetores)
- ArrayList (listas dinâmicas)
- Métodos de manipulação

### 🛡️ **Robustez:**
- Tratamento de exceções (try-catch)
- Validação de entrada
- Métodos seguros

### 📝 **Boas Práticas:**
- Nomenclatura clara
- Código organizado
- Documentação
- Tratamento de erros

---

## 🚀 PRÓXIMOS PASSOS NO APRENDIZADO

1. **Herança e Polimorfismo**
2. **Interfaces e Classes Abstratas**
3. **Manipulação de Arquivos**
4. **Threads e Programação Concorrente**
5. **Conexão com Banco de Dados**
6. **Frameworks (Spring, Hibernate)**

---

> **💡 Dica:** Pratique cada conceito criando pequenos projetos. A programação se aprende fazendo!

> **📚 Lembre-se:** Este guia é baseado nos conceitos presentes no seu projeto. Use-o como referência durante seus estudos!

---

**🎓 Bons estudos e sucesso na sua jornada Java!**
