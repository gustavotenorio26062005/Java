# Java — Exercícios de Orientação a Objetos e Threads

Exercícios em Java feitos durante o curso de Análise e Desenvolvimento de Sistemas (IFSP), praticando conceitos de POO, arquitetura em camadas e programação concorrente.

## Conteúdo

| Pasta | Tema | Classe principal |
|-------|------|------------------|
| `Heranca/Heranca/src` | Herança, classes abstratas, interfaces e polimorfismo (`Funcionario`, `Gerente`, `Analista`, `Autenticado`, `SysPedido`...) | `Main` |
| `Camadas/Camadas/src` | Separação em camadas **entidade / controle / fronteira** com um cadastro de doações | `fronteira.FronteiraDoacao` |
| `Threads` | Criação de threads estendendo `Thread` e implementando `Runnable` | `Paralelo`, `ExemploRunnable`, `ThreadsConcorrentes` |

## Tecnologias

- Java (JDK 9+ por causa do `module-info.java` no projeto Camadas)
- Projetos originalmente criados no Eclipse

## Como rodar

Com o JDK instalado, a partir da raiz do repositório:

```bash
# Herança
javac -d out/heranca Heranca/Heranca/src/*.java
java -cp out/heranca Main

# Camadas
javac -d out/camadas $(find Camadas/Camadas/src -name "*.java")
java -cp out/camadas fronteira.FronteiraDoacao

# Threads
javac -d out/threads Threads/*.java
java -cp out/threads Paralelo
java -cp out/threads ExemploRunnable
java -cp out/threads ThreadsConcorrentes
```

Também é possível importar as pastas `Heranca/Heranca` e `Camadas/Camadas` como projetos no Eclipse/IntelliJ.

## Aprendizados

- Herança, sobrescrita de métodos (`bonus()`) e classes abstratas
- Interfaces como contrato (`Autenticado`, `Doador`) e polimorfismo
- Encapsulamento com getters/setters e validação simples (salário não negativo)
- Organização de código em pacotes por responsabilidade
- Criação e execução de threads concorrentes
