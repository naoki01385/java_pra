//   1a 2d 3c 4a 5a 6a 7c 8acd 9a 10a 11c 12a 13A 14b 15h 16f 17d 18ad 19a 20c 21a
//an 1d 2c 3ae 4a 5a 6e 7c 8acd 9a 10a 11c12b 13c 14a 15e 16f 17d 18ad 19b 20c 21a
public class Main {
    public static void main(String[] args){
        // A a =new A();
        // B b=new B();
        // System.out.print(a.val);
        // System.out.print(b.val);
        // a.print();
        // b.print();

        A a = new A();
        B b =(B) a;
        b.hello();
    }
}
