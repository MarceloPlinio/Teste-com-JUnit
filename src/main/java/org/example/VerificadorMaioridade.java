package org.example;

public class VerificadorMaioridade {

    public static boolean ehMaiorDeIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        return idade >= 18;
    }
}
