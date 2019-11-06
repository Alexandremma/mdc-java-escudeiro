package com.db1.escudeiro.basico.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {

    public static void main(String[] args) {
        String texto = "texto";

        List<String> listaString = new ArrayList<>();

        for (int i = 0; true; i++) {
            String textoFinal = texto + i;

            listaString.add(textoFinal);
        }
    }
}
