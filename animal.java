public abstract class animal { //only commented on canine and cat because all of the other animals classes have the same function
    String name;
    String animaln;
    boolean asleepORawake;

    public animal(String name, String animaln, boolean asleepORawake){ //sets name of animal, the name of animal itself, and if it's asleep or awake
        this.name = name;
        this.animaln = animaln;
        this.asleepORawake = asleepORawake;
    }

    public abstract void roam(); //function that specifies where the animal goes
    public abstract void makenoise(); //function that specifies what noise the animal makes

    public void setname(String name){ //sets animal name
        this.name = name;
    }
    public String getname(){ //gets animal name
        return name;
    }

    public void setanimaln(String animaln){ //set name of animal
        this.animaln = animaln;
    }
    public String getanimaln(){ //get name of animal
        return animaln;
    }

    public void setSleeping(boolean asleepORawake){ //sets if the animal is sleeping
        this.asleepORawake = asleepORawake;
    }
    public boolean getasleepORawake(){ //checks to see if animal is sleeping or asleep
        return asleepORawake;
    }

    public void asleep(){ //prints out line if animal is sleeping
        System.out.println(name + " the " + animaln + " is sleeping.");
        this.asleepORawake = true;
    }

    public void wakeup(){ //prints out line if animal is awake
        System.out.println(name + " the " + animaln + " is waking up.");
        this.asleepORawake = false;
    }

    public void eat(){ //prints out if animal is eating
        System.out.println(name + " the " + animaln + " is eating peacefully.");
    }

    public void exercise(){ //prints out if animal is exercising
        System.out.println(name + " the " + animaln + " running around getting tired!");
    }

    public void action(String action_){
        switch(action_){
            case "Wake up": //prints out in the case that the animal is already awake
                if(this.asleepORawake) {
                    wakeup();
                } 
                else{
                    System.out.println(this.name + " the " + animaln +  " is already awake!");
                }
                break;
            case "Sleep": //prints out in the case that they're already sleeping
                if(this.asleepORawake) {
                    System.out.println(this.name + " the " + animaln +  " is already sleeping! 'zzz'");
                } 
                else{
                    asleep();
                }
                break;
            case "Make Noise": //animal makes noise
                makenoise();
                break;
            case "Roam": //animal roams around
                roam();
                break;
            case "Exercise": //animal running around
                exercise();
                break;
            case "Feed": //animal feeding
                eat();
                break;
            default: //animal default
                System.out.println(this.name + " the " + animaln + " is chilling like a villian.");

        }
    }
}