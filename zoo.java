import java.io.File;  
import java.io.IOException;  

public class zoo {
    public static void main(String args[]){
    
        animal cliffton = new cat("Cliffton", "Cat", false);

        animal tyreek = new tiger("Tyreek", "Tiger", true);
        
        animal larry = new lion("Larry", "Lion", true);

        animal dick = new dog("Dick", "Dog", true);

        animal wakanda = new wolf("Wakanda", "Wolf", true);
        
        animal elric = new elephant("Elric", "Elephant", true);

        animal hohenheim = new hippo("Hohenheim", "Hippo", true);

        animal rhydon = new rhino("Rhydon", "Rhino", true);

        zookeeper Zachary = new zookeeper();

        animal[] animals = new animal[8];

        animals[0] = cliffton;
        animals[1] = tyreek;
        animals[2] = larry;
        animals[3] = dick;
        animals[4] = wakanda;
        animals[5] = elric;
        animals[6] = hohenheim;
        animals[7] = rhydon;

        for(animal a : animals){
            Zachary.wake(a);
        }

        for(animal a : animals){
            Zachary.rollcall(a);
            Zachary.exercisea(a);
        }

        for(animal a : animals){
            Zachary.shut_down(a);
        }
    }
}
