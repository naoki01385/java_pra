import java.util.concurrent.Flow.Publisher;

public class Item {
    // private int num=10;
    // public void setNum(int num){
    //     this.num=num;
    // }
    // public int getNum(){
    //     return this.num;
    // }
    public String name;
    public int price;
    public void printInfo(){
        System.out.println(name+","+price);
    }

}
