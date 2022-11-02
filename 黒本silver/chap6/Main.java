//  1c 2b 3e 4a 5d 6de 7e 8d 9ab 10b 11a 12ad 13c 14f 15c 
//  16ae 17a 18a 19a 20a 21b 22a 23d 24b 25e 26d 27c 28d 29a 30b
//an1b 2b b3f 4b 5c 6de 7e 8d 9ab 10e 11a 12bc 13c 14g 15c 16bd
// 17a 18e 19d 20a 21b 22a 23d 24b 25e 26d 27 28 29 30
public class Main {
    public static void main(String[] args){
        // Item a=new Item();
        // Item b=new Item();
        // a.name="apple";
        // a.price=200;
        // b.price=100;
        // b.name="banana";
        // a=b;
        // a.printInfo();

        // Sample.num=10;
        // Sample s=new Sample();
        // Sample s2= new Sample();
        // s.num+=10;
        // s2.num=30;
        // System.out.println(Sample.num);
        // Sample sample=new Sample();
        // sample.hello();
        // String val =s.setValue("hello");
        // s.getValue();
        // System.out.println(val);
    //     Sample s =new Sample();

    //     int result =s.method(2,2);
    //     System.out.println(result);
        

    // Main m = new Main();
    // System.out.println(m.calc(2,3));
    // }
    // private double calc(double a,int b){
    //     return (a+b)/2;
    // }
    // private double calc(int a,double b){
    //     return (a+b)/2;

    Sample s = new Sample(10);
    modify(s);
    System.out.println(s.num);
    }
    private static void modify(Sample s){
        s.num*=2;
    }

}
