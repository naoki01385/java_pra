public class Main {
    public static void main(String[] args){
        Hero h =new Hero();
        h.name="ミナト";
        h.hp=100;

        Matango m1 =new Matango();
        m1.hp =50;
        m1.suffix='A';

        Matango m2 =new Matango();
        m1.hp =100;
        m1.suffix='B';

        System.out.println("勇者"+h.name+"を生み出した");

        h.sit(5);
        h.slip();
        h.sit(25);
        m2.run();
        m1.run();
        h.run();
    }
}
