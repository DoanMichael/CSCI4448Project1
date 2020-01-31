public class hippo extends pachyderm {
    public hippo(String name, String animaln, boolean awakeORasleep){
        super(name, animaln, awakeORasleep);
    }

    public void makenoise(){
        System.out.println(name + " the " + animaln + " starts to 'AWOOOOOOO'");
    }
}