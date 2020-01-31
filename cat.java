import java.util.Random;

public class cat extends feline { //extends to feline class as well
    public cat(String name, String animaln, boolean awakeORasleep) {
        super(name, animaln, awakeORasleep); //sets up info of animal
    }


    public void makenoise() {
        System.out.println(this.name + " the " + animaln + " MEEEEEOOWS!"); //noise of animal
    }

    public void action(String action_){
        Random rand = new Random(); //does random action
        int choice = rand.nextInt(6); //chooses action

        switch(choice){
            case 1:
                if(true){ //wake up or sleep
                    wakeup();
                } else{
                    asleep();
                }
                break;
            case 2: //roaming
                roam();
                break;
            case 3: //makes noise
                makenoise();
                break;
            case 4: //exercises
                exercise();
                break;
            case 5: //prints out noise of animal
                System.out.println(this.name + " the " + animaln + " puuuuuuurs!");
                break;
            case 6: //print out action of animal
                System.out.println(this.name + " the " + animaln + " sits up!");
                break;
            default: //prints out state of animal
                System.out.println(this.name + " the " + animaln + " is confusion!");
        }
    }
}

