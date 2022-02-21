package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int i, j;
        int producto = 1;
        int cesta = 1;
        List<Integer> conjuntoDeCestas = new ArrayList<>();
        int tamTotal = 0;

        System.out.println();
        for (i = 0; i < 100; i++) {

            for (j = 0; j < 100; j++) {
//              El producto p está en una cesta c si y sólo si p divide a c sin que quede ningun residuo
                if (cesta % producto == 0) {

                    conjuntoDeCestas.add(producto);
                    tamTotal++;
                }

                //continuando con el siguiente producto
                producto++;
            }

            //listando los productos
            System.out.print("Cesta #" + cesta + " | Productos: ");
            for (int prod : conjuntoDeCestas) {
                System.out.print(prod + " ");
            }
            System.out.print("- Tamaño de la Cesta: " + conjuntoDeCestas.size() + "\n");

            //reset
            //cambiando a una nueva cesta
            conjuntoDeCestas = new ArrayList<>();
            cesta++;
            //volviendo a revisar los productos
            producto = 1;
        }
        System.out.println("\n*********************************************\n");
        System.out.println("Tamaño total de todas las cestas: " + tamTotal);
    }
}
