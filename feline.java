public abstract class feline extends animal {
    public feline(String name, String animaln, boolean awakeORasleep){
        super(name, animaln, awakeORasleep);
    }

    public void roam(){
        System.out.println(name + " the " + animaln + " roams around with a prowl.");
    }
}