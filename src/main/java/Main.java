
import clases_nave.Manned;
import clases_nave.Nave;
import clases_nave.Shuttel;
import clases_nave.Unmanned;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
        Nave Cohete1 = new Shuttel("EEUU","RTK-32","nomal",21);
        Nave Cohete2 = new Unmanned("EEUU","RTK-32",21);
        Nave Cohete3 = new Shuttel("EEUU","RTK-32","nomal",21);
        Nave Cohete4 = new Manned("EEUU","RTK-32",21,2);
    
       
        
        
        int opp = 1;
        do{
            if(opp == 1){
                opp = CreateNave();
            }else{
                System.out.println("¿ Deseas crear otra nave  No = 0 o Si = 1 ?\n");
                opp = sc.nextInt();
            
            }
        
        }while(opp !=0);
        
    }
    
        
     static int CreateNave(){
        String country;
        String name;
        float weight;
        int speed;  // velocidad
        boolean motor; // si los motores estan activos o no
        int crew;
        String task;
        String fuel;
        String destiny;
        String espacio = " ";
        
        Scanner sc = new Scanner(System.in);
        int opt=0,opp=10;
        System.out.println("       Crea tu nave espacial         \n");
        System.out.println(" Que tipo de nave deseas");
        System.out.println("1. Nave lanzadera ");
        System.out.println("2. Nave no tripulada ");
        System.out.println("3. Nave tripulada ");
        System.out.println(" Elige tu opcion: ");
        opt = sc.nextInt();
        
        if(opt == 1){
            
            System.out.println(" Nave lanzadera");
            System.out.println("Pais : ");
            country = sc.nextLine();
            System.out.println("Nombre : ");
            name = sc.nextLine();
            System.out.println("Combustible : ");
            fuel = sc.nextLine();
            System.out.println("Peso en toneladas : ");
            weight = sc.nextFloat();
            System.out.println("\n Presiona Enter para despegar ");
            espacio = sc.nextLine();
        }
        else if(opt ==2){}
        else if (opt == 3){}
        else {
            //System.out.print("\033[H\033[2J");
            System.out.println("Opcion no valida");
            
        }
        return opp;
    }   
    
    
    
}

