//   1e 2f 3b 4bdf 5e 6c 7ade 8e 9c 10b
//an 1e 2g 3e 4abf 5e 6c 7bcd 8 e9 d10b
public class Main {
    public static void main(String[] args){
        // Item[] items =new Item[3];
        // int total =0;
        // for (int i=0;i<items.length;i++){
        //     total+=items[i].price;
        // }
        // System.out.println(total);

        // String[] array ={"a","b","c","d"};
        // array[0]=null;
        // for(String str:array){
        //     System.out.println(str);
        // }

        // String[][]array={{"a","b"},null,{"c","d","e"}};
        // int total=0;
        // for(String[]tmp:array){
        //     total+=tmp.length;
        // }
        // System.out.println(total);

        int[][]arrayA={{1,2},{1,2},{1,2,3}};
        int[][]arrayB=arrayA.clone();
        int total =0;
        for(int[]tmp:arrayB){
            System.out.println("tmp="+tmp);
            for (int val:tmp){
                System.out.println("val="+val);
                total+=val;
            }
        }
        System.out.println(total);
    
    }
}
