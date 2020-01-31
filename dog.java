public class dog extends canine {
    public dog(String name, String animaln, boolean asleepORawake){
        super(name, animaln, asleepORawake);
    }

    public void makenoise(){
        System.out.println(name + " the " + animaln + " starts to 'WOOF WOOF'");
    }
}