package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a;

        System.out.println("¡Bienevenido!");


        while (true) {
            System.out.println("A continuancion se te mostrara tus opciones para el dado: " +
                    " \n 1. Lanza el dado." +
                    " \n 2. Ver los resultados. " +
                    "\n 3. Salir");

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Escribe el numero de tu eleccion: ");
            try {
                a = Integer.parseInt(teclado.readLine());
                switch (a) {
                    case 1:
                        Opciones_del_dado lanzar = new Opciones_del_dado();


                        lanzar.Lanzar();

                        break;

                    case 2:

                        break;

                    case 3:
                          System.exit(1);
                        break;
                }
            } catch (Exception e) {
                System.err.println("ERROR: Opción inválida.");
            }

        }
    }
}
