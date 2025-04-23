# Verificador Maior Idade 🧑‍⚖️🎉

Este é um projeto simples em Java que verifica se uma pessoa é maior de idade (18 anos ou mais) ou não. O projeto também inclui testes unitários com JUnit para garantir que a lógica esteja funcionando direitinho! ✅

## Estrutura do Projeto 🗂️

A estrutura do projeto é a seguinte:

![image](https://github.com/user-attachments/assets/7dcdd98a-6f64-4a90-b3ef-477930b71dee)


- `VerificadorMaiorIdade.java`: Contém a lógica do programa, com o método `ehMaiorDeIdade(int idade)`. 📜
- `VerificadorMaiorIdadeTest.java`: Contém os testes unitários com JUnit para garantir que tudo esteja funcionando corretamente. 🧪

## Funcionalidade 🎯

O método `ehMaiorDeIdade(int idade)` deve:

- Retornar `true` se a idade for 18 ou mais. ✅
- Retornar `false` se a idade for menor que 18. ❌
- Lançar uma exceção se a idade for negativa. ⚠️

## Pré-requisitos 📦

Antes de rodar o projeto, você vai precisar de:

- [Java 14 ou superior](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) ☕
- [JUnit 5](https://junit.org/junit5/) para os testes 🧪

Se você estiver usando o IntelliJ IDEA, ele já tem o JUnit integrado, mas se não, você vai precisar configurar o JUnit no seu projeto manualmente.

## Como Rodar o Projeto 🚀

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/MarceloPlinio/Teste-com-JUnit.git
    ```

2. **Entre na pasta do projeto**:
    ```bash
    cd VerificarMaiorIdade
    ```

3. **Compile e execute o código**:
    - Se você estiver usando o IntelliJ, basta executar a classe `VerificadorMaiorIdade.java` diretamente.
    - Se preferir usar a linha de comando:
      ```bash
      javac src/main/java/VerificadorMaiorIdade.java
      java src.main.java.VerificadorMaiorIdade
      ```

## Como Rodar os Testes 🧪

Os testes estão na classe `VerificadorMaiorIdadeTest.java`, dentro de `src/test/java`.

### Usando IntelliJ IDEA

1. Abra o projeto no IntelliJ IDEA.
2. Clique com o botão direito na classe `VerificadorMaiorIdadeTest.java`.
3. Selecione **Run 'VerificadorMaiorIdadeTest'** para rodar os testes.

### Usando Linha de Comando

Se você quiser rodar os testes pela linha de comando, faça assim:

```bash
javac -cp .:path-to-junit/junit-5.x.jar src/test/java/VerificadorMaiorIdadeTest.java
java -cp .:path-to-junit/junit-5.x.jar org.junit.platform.console.ConsoleLauncher --select-class=VerificadorMaiorIdadeTest

