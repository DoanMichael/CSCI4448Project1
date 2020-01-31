public abstract class pachyderm extends animal {
    public pachyderm(String name, String animaln, boolean asleepORawake){
        super(name, animaln, asleepORawake);
    }

    public void roam(){
        System.out.println(name + " the " + animaln + " is stomping madly!!");
    }
}
