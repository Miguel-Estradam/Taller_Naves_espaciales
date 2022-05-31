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
public class Unmanned extends Nave{
    private String destiny;
    
    public Unmanned (String country, String name, float weight){
        this.country = country;
        this.name = name;
        this.weight = weight;
    }
    
    
    public void setDestiny(String destiny){
        this.destiny = destiny;
        System.out.println("Destino " + this.destiny);
    }
    public void changeDestiny(String destiny){
        this.destiny = destiny;
        System.out.println("Nuevo destino " + this.destiny);
    }
    

    @Override
    public void despegar() {
       this.speed = speed;
        this.motor = true;
        System.out.println("nave en movimiento a su destino");
    }
    public void despegar(int speed){
        this.speed = speed;
        this.motor = true;
        if(this.speed == 35){
            System.out.println("la nave a llegado a su orbita");
        }else if(this.speed >35){
            System.out.print("Te pasaste de la orbita deseada");
        }else{
            System.out.print("No llegaste a la orbita");
        }
    }
    
}
