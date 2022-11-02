public class Main {
    public static void main(String[] args){
        String str ="hoge, world";
        hello(str);
        System.out.println(str);
    }
    public static  String hello(String msg){
       return  msg.replaceAll("hoge", "hello");
    }
}
