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
public abstract class Nave {
    
    /**
     * @param country Pais de creacion
     * @param name nombre de la nave
     
     * @param weight Peso de la nave
     * @param speed Velocidad al despegar
     * @param motor estado de los motores
     */
    

   

    public String country;
    public String name;
    
    public float weight;
    public int speed;  // velocidad
    public boolean motor; // si los motores estan activos o no

    public abstract void despegar();
    public void detenerse(){
        this.motor = false;
        this.speed = 0;
    }
    
    
    

   
   
}
