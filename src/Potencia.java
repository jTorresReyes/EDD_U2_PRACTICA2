/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corre
 */
public class Potencia {
    protected int pot(int base, int potencia){
        if(potencia==0){
            return 1; //TODO NUMERO A POTENCIA 0 ES IGUAL A 1
        }else{
            return base*pot(base,potencia-1); //Multiplicaciones sucesivas hasta que cumpla la cantidad de numeros
        }
    }
}
