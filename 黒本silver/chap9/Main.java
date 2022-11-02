import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // ArrayList<String> list =new ArrayList<>();
        // list.add("a");
        // list.set(0, "b");
        // list.add("c");
        // list.set(1,"d");
        // for (String str:list){
        //     System.out.println(str);
        // }
        // List<String> list=List.of("a","b","c");
        // list.forEach(str->System.out.println(st
        // ArrayList<String> list=new ArrayList<>();
        // list.add("A");
        // list.add("B");
        // list.add("C");
        // list.add("D");
        // // list.add("E");
        // for (String str :list){
        //     if("C".equals(str)){
        //         list.remove(str);
        //     }else{
        //         System.out.println(str);
        //     }
        // }
        // for(String str:list){
        //     System.out.println(str);
        // }


        int array[][] = new int[][]{{1,2},{2,3,4}};
        int total =0;
        for (int i=0;i<array.length;i++){
            for(int j=i;j<array[i].length;j++){
                total+=array[i][j];
            }
        }
        System.out.println(total);
      


    }
}
