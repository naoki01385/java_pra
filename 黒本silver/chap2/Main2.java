import javax.swing.undo.StateEdit;

//   1b 2e 3cdefh 4a 5de 6a 7a 8e 9ab 10a 11e 12e 13d 14c 15f 16c 17a 18c 19b 20b 21d 22c
//an 1c 2e 3cdefi 4c 5de 6e 7c 8a 9ab 10a 11f 12e 13d 14c 15f 16a 17a 18c 19b 20d 21d 22a
public class Main2 {
    public static void main(String[] args){
        String str ="hoge,world";
        hello(str);
        System.out.println(str);
    }
    private static void hello(String msg){
        msg.replaceAll("hoge","hello");
    }
}
