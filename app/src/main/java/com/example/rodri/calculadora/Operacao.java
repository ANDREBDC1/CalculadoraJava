package com.example.rodri.calculadora;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rodri on 07/05/2018.
 */

public class Operacao {

    private static final String EXPONECIACAO = "-?\\d[\\^]\\d+";
    private static final String SOMENTE_NUMEROS = "-?\\d?\\d+";
    public static String calcular(Object exp) {

        String resultado = exp.toString();
        resultado = calcularExpo(resultado);
        return resultado;
    }

    private static ArrayList<String> getExpressao(String texto, String regex) {
        ArrayList<String> expressoes = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher comparator = pattern.matcher(texto);
        while (comparator.find()) {
            expressoes.add(comparator.group());
        }
        return expressoes;
    }

    private static String calcularExpo(String exp) {
        String resFinal = "";
        if (!exp.contains("^")) {
            return exp;
        }

        ArrayList<String> expressoes = getExpressao(exp, EXPONECIACAO);
        exp = exp.replaceAll("\\^", "");
        String resultado ="";
        for (String expressao : expressoes) {

            ArrayList<String> numeros = getExpressao(expressao, SOMENTE_NUMEROS);
            resultado = String.valueOf(Math.pow(Double.valueOf(numeros.get(0)), Double.valueOf(numeros.get(1))));
            expressao = expressao.replaceAll("\\^", "");
            exp = exp.replaceAll(expressao, resultado);

        }

        return exp;

    }
}
