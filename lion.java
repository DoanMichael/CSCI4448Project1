public class lion extends feline {
    public lion(String name, String animaln, boolean awakeORasleep){
        super(name, animaln, awakeORasleep);
    }

    public void makenoise() {
        System.out.println(name + " the " + animaln + " 'ROOOOOOOOARSSS'");
    }
}