public class rhino extends pachyderm {
    public rhino(String name, String animaln, boolean awakeORasleep){
        super(name, animaln, awakeORasleep);
    }

    public void makenoise(){
        System.out.println(name + " the " + animaln + " starts to 'MEEEEEERANKD'");
    }
}