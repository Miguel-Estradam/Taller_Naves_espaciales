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
public class Manned extends Nave{

    private int crew;
    private String task;
    
    
    public Manned (String country, String name, float weight,int crew ){
        this.country = country;
        this.name = name;
        this.weight = weight;
        this.crew = crew;
    }
    
    public void CreateTacks(String task){
        this.task = task;
        System.out.println("Nueva mision : "+this.task);
    }
    
    @Override
    public void despegar() {
        this.speed = speed;
        this.motor = true;
    }
    
}
