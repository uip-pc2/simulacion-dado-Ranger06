package com.company;

import java.util.ArrayList;

/**
 * Created by José Pacheco on 12/4/17.
 */
public class Opciones_del_dado {
        double lanzar;
        int    B, t;
    ArrayList<String> resultant = new ArrayList<String>(1);


    public double getLanzar() {
        return lanzar;
    }

    public void Lanzar()
    {
        this.lanzar = Math.random() * 6;

        System.out.println(this.lanzar);

         return;
    }

    public void Resultados()
    {

       for (B=1; B <= 100; B++)
       {
           //resultant.add(this.lanzar);
       }
    }


}
