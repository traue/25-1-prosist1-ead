## Agregação e Composição em Java

### Relembrando os conceitos:

- **Agregação**: Uma associação do tipo “tem um”, mas em que a parte pode existir sem o todo
    - ◇────
- **Composição**: Uma associação também do tipo “tem um”, mas em que a parte não existe sem o todo
    - ◆────

| **Aspecto** | **Agregação** | **Composição** |
| --- | --- | --- |
| Tipo de relação | “Tem um” | “É dono de um” |
| Vida do objeto parte | Independente | Dependente |
| Criação | Fora da classe principal | Dentro da classe principal |
| Exemplo real | Aluno e Curso | Coração e Corpo Humano |

Exemplos:

- **Agregação**: Pense em uma *universidade* que tem *professores*. Se a universidade fechar, os professores ainda existem
- **Composição**: Pense em uma *casa* que tem *cômodos*. Se a casa for demolida, os cômodos deixam de existir

### Exemplo de Implementação: Agregação:

Universidade ◇──── Professor

```java
// Classe Professor
public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Professor: " + nome);
    }
}
```

```java
// Classe Universidade (AGREGA os professores)
import java.util.List;

public class Universidade {
    private String nome;
    private List<Professor> professores;

    public Universidade(String nome, List<Professor> professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void exibirProfessores() {
        System.out.println("Universidade: " + nome);
        for (Professor p : professores) {
            p.exibirDados();
        }
    }
}
```

```java
// Classe principal
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Ana");
        Professor prof2 = new Professor("Carlos");

        Universidade u = new Universidade("Mackenzie", Arrays.asList(prof1, prof2));
        u.exibirProfessores();
    }
}
```

### Exemplo de implementação: Composição

Casa ◆──── Cômodo

```java
// Classe Comodo
public class Comodo {
    private String nome;

    public Comodo(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Cômodo: " + nome);
    }
}
```

```java
// Classe Casa (COMPÕE os cômodos)
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String endereco;
    private List<Comodo> comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();

        // Cria os cômodos internamente
        comodos.add(new Comodo("Sala"));
        comodos.add(new Comodo("Cozinha"));
        comodos.add(new Comodo("Quarto"));
    }

    public void exibirComodos() {
        System.out.println("Casa localizada em: " + endereco);
        for (Comodo c : comodos) {
            c.exibir();
        }
    }
}
```

```java
// Classe principal
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua das Flores, 123");
        casa.exibirComodos();
    }
}
```

## Exercício - Em aula

Construir um sistema simples para representar uma Escola, que possui Salas de Aula (composição) e Alunos (agregação). O sistema deve permitir:

1.	Criar uma escola com nome e endereço
2.	Adicionar salas de aula à escola (cada sala é criada internamente à escola)
3.	Adicionar alunos às salas (alunos são criados fora da sala)
4.	Exibir todos os dados da escola (nome, endereço, salas, e os alunos de cada sala)

![image.png](attachment:85d27dfa-469f-48fa-a78d-90b1a24fb6fc:image.png)

```
@startuml
left to right direction
class Escola {
  - nome: String
  - endereco: String
  - salas: List<Sala>
  + adicionarSala(sala: Sala): void
  + exibirEscola(): void
}

class Sala {
  - numero: String
  - alunos: List<Aluno>
  + adicionarAluno(aluno: Aluno): void
  + exibirAlunos(): void
}

class Aluno {
  - nome: String
  - matricula: String
  - idade: int
  + exibir(): void
}

Escola *-- Sala : composição
Sala o-- Aluno : agregação
@enduml
```

---

## Gabarito


Vide o projeto!