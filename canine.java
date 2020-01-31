public abstract class canine extends animal { //part of animal class
    public canine(String name, String animaln, boolean asleepORawake){
        super(name, animaln, asleepORawake); //sets up info of animal
    }

    public void roam(){
        System.out.println(name + " the " + animaln + " is roaming around strutting."); //prints out when animal is roaming
    }
}
