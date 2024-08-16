package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, }; //T(n) = 1
        List<String> combinaciones = new ArrayList<>(); //T(n) = 1

        for (int i = 0; i < numeros.length; i++) { //T(n) = n^2
            for (int j = i + 1; j < numeros.length; j++) {
                combinaciones.add("(" + numeros[i] + ", " + numeros[j] + ")"); //T(n) =1
            }
        }

        for (int i = 0; i < combinaciones.size(); i++) { //T(n) = n
            System.out.println(combinaciones.get(i)); //T(n) = 1
        }

        System.out.println("Total de combinaciones: " + combinaciones.size()); //T(n) =1
    }
    }

    // Total T(n)= n^2 + 5n
