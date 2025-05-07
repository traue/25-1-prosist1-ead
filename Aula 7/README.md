### **🎯 Objetivo da Aula**

Entender o conceito de herança em programação orientada a objetos usando Java, abordando seus benefícios, limitações e aplicabilidade prática.

---

## **📝 Roteiro**

### **1. Abertura e Contextualização**

- breve introdução
- Contextualização rápida: O que é reutilização de código? Por que é importante?

---

### **2. Conceitos Fundamentais da Herança → é um**

**Explicação teórica:**

- Herança é um mecanismo que permite criar novas classes a partir de classes existentes, herdando seus atributos e métodos.
- Classe Pai (Superclasse ou Base): Classe original.
- Classe Filha (Subclasse ou Derivada): Classe que herda propriedades e métodos da classe Pai.
- A classe filha É exatamente igual a classe pai, com suas próprias características e comportamentos extras

### Importante:

- **Propriedade da transitividade**: Se C herda de B e, por sua vez B herda de A, então C também possui todas as características e comportamentos de A
- **Propriedade da assimetria:** Não existe herança “em loop”, ou seja, se A herda de B, B não pode herdar de A

**Exemplo simplificado:**

- Uma classe Veiculo pode ser herdada por classes Carro e Moto.

---

### **3. Vantagens da Herança**

- Reutilização do código.
- Organização clara e hierárquica das classes.
- Facilidade na manutenção e expansão do código.

---

### **4. Sintaxe básica em Java**

Exemplo Java simples com herança:

```java
public class Veiculo {
    String marca;
    
    public void ligar() {
        System.out.println("Veículo ligado!");
    }
}

public class Carro extends Veiculo {
    int numeroDePortas;

    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto!");
    }
}
```

```java
Carro c1 = new Carro();
c1.marca = "Ford";
c1.numeroDePortas = 4;
c1.ligar();  // método herdado
c1.abrirPortaMalas();  // método próprio
```

**5. Diagrama UML com Herança**

```java
@startuml
class Veiculo {
  - marca: String
  + ligar(): void
}

class Carro {
  - numeroDePortas: int
  + abrirPortaMalas(): void
}

class Moto {
 - cilindradas: int
 + partidaElétrica(): void
}

Veiculo <|-- Carro
Veiculo <|-- Moto
@enduml
```

Gere o diagrama em: https://www.plantuml.com/plantuml/uml

### **6. Conceitos adicionais (Polimorfismo rápido)**

- O polimorfismo ocorre quando uma referência do tipo Pai aponta para um objeto do tipo Filho.

Exemplo rápido:

```java
Veiculo meuVeiculo = new Carro();
meuVeiculo.ligar();  // funciona normalmente!
// meuVeiculo.abrirPortaMalas();  // Erro de compilação, método específico de Carro
```

### **7. Exercício prático para aula**

**Enunciado:**

Considere um cenário para uma aplicação simples que envolva empregados em uma empresa.

- Crie uma classe abstrata chamada Funcionario com os atributos: nome, salario.
- Crie dois tipos de funcionários: Gerente (com um atributo adicional departamento) e Desenvolvedor (com um atributo adicional linguagemProgramacao).
- Os funcionários têm um método abstrato chamado exibirDetalhes(), que deverá ser implementado nas subclasses.


Gere o diagrama em: https://www.plantuml.com/plantuml/uml


```java
@startuml
abstract class Funcionario {
    # nome: String
    # salario: double
    + exibirDetalhes(): void {abstract}
}

class Gerente {
    - departamento: String
    + exibirDetalhes(): void
}

class Desenvolvedor {
    - linguagemProgramacao: String
    + exibirDetalhes(): void
}

Funcionario <|-- Gerente
Funcionario <|-- Desenvolvedor
@enduml
```

**8. Resolução:**

```java
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void exibirDetalhes();
}
//-------------------------------------------------
public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Gerente: " + nome + ", Salário: " + salario + ", Departamento: " + departamento);
    }
}
//-------------------------------------------------
public class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

    public Desenvolvedor(String nome, double salario, String linguagemProgramacao) {
        super(nome, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Desenvolvedor: " + nome + ", Salário: " + salario + ", Linguagem: " + linguagemProgramacao);
    }
}
```

```java
public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Mariana", 8500, "TI");
        Funcionario dev = new Desenvolvedor("João", 6500, "Java");

        gerente.exibirDetalhes();
        dev.exibirDetalhes();
    }
}
```

### **9. Discussão rápida sobre boas práticas em herança**

- Não abusar da profundidade da hierarquia na herança
- Preferir composição sobre herança em casos de múltiplas responsabilidades

---

### **10. Recapitulando a Aula**

- Revisar rapidamente os conceitos abordados:
    - Herança básica.
    - Uso do extends.
    - Métodos abstratos e polimorfismo (extra).

---

### **11. Exercício proposto para casa**

Para reforçar:

- Crie outra subclasse chamada **Estagiario** com atributos próprios e implemente o método abstrato