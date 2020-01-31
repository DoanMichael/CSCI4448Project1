public class wolf extends canine {
    public wolf(String name, String animaln, boolean asleepORawake){
        super(name, animaln, asleepORawake);
    }

    public void makenoise(){
        System.out.println(name + " the " + animaln + " starts to 'WOOOOOOOOOOOOO'");
    }
}