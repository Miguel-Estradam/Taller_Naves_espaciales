/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_nave;

/**
 *
 * @author HP
 */
public class Shuttel extends Nave{
    
    /**
     * @param fuel tipo de combustible
     */
    private String fuel;
    
    /**
     * nave de lanvamiento
     * @param country pais de creacion
     * @param name nombre de la nave
     * @param fuel tipo de combustible
     * @param weight peso
     */
    public Shuttel (String country, String name, String fuel, float weight){
        this.country = country;
        this.name = name;
        this.fuel = fuel;
        this.weight = weight;
    }
    

    public void separarse(){ // se refiere a cuando el la nave lanzadera se separa de la nave principal
        if(motor == false){
            System.out.println("Iniciando separacion");
        }else {
            System.out.println("Debes apagar el motor para separar la nave");
        }
        
    }

    @Override
    public void despegar(){
        this.motor = true;
        this.speed = 100;
    }

    
    
}
