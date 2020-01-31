public class zookeeper {

    public void wake(animal a){
        System.out.println("Wake UP AND PARTY " + a.getname() + " the " + a.getanimaln());
        a.action("Wake up");
    }

    public void rollcall(animal a){
        System.out.println("LETS GIVE IT UP FOR "+ a.getname() + " the " + a.getanimaln());
        a.action("Make Noise");
    }

    public void exercisea(animal a){
        System.out.println("TIME TO EXCERCISE " + a.getname() + " the " + a.getanimaln());
        a.action("Exercise");
    }

    public void shut_down(animal a){
        System.out.println("EVERYBODY TIME TO GO NIGHT NIGHT " + a.getname() + " the "
                + a.getanimaln() + " to sleep");
        a.action("Sleep");
    }
}
