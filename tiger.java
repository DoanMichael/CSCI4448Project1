public class tiger extends feline {
    public tiger(String name, String animaln, boolean awakeORasleep){
        super(name, animaln, awakeORasleep);
    }

    public void makenoise(){
        System.out.println(name + " the " + animaln + " starts to 'ROOOOOOOAR'");
    }
}
