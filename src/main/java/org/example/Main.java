package org.example;

public class Main {

    public static void main(String[] args) {
        int i, j;
        int producto = 1;
        int cesta = 1;
        int tamCesta = 0;
        int tamTotal = 0;

        System.out.println();
        for (i = 0; i < 100; i++) {

            System.out.print("Cesta #" + cesta + " | Productos: ");
            for (j = 0; j < 100; j++) {

//              listando los productos
//              El producto p está en una cesta c si y sólo si p divide a c sin que quede ningun residuo
                if (cesta % producto == 0) {

                    System.out.print(producto + " ");
                    tamCesta++;
                }

                //continuando con el siguiente producto
                producto++;
            }

            System.out.print("- Tamaño de la Cesta: " + tamCesta + "\n");

            //reset
            //volviendo a revisar los productos
            producto = 1;
            //sumando al total de productos
            tamTotal += tamCesta;
            //cambiando a una nueva cesta
            cesta++;
            tamCesta = 0;
        }
        System.out.println("\n*********************************************\n");
        System.out.println("Tamaño total de todas las cestas: " + tamTotal);
    }
}
