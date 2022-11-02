import java.time.Period;

//1b 2c 3e 4a 5b 6a 7d 8a 9c 10 a 11b 12b 13d 14c 15d 16a 17b
//an 1a 2c 3e 4c 5e 6b 7d 8a 9c 10abd 11a 12b 13 e 14a 15b 16f 17b
public class Main {
    // public static void main(String[] args){
    //     int a=0;
    //     while(a<5)
    //       do 
    //         a++;
    //         System.out.println(a);
    //     while(true);
    // }

    public static void main(String[] args){
        // int array[][]=new int[][]{{1,2},{2,3,4}};
        // System.out.println(array);
        // int total=0;
        // for (int i=0;i<array.length;i++){
        //     System.out.println(array[i]);
        //     for(int j=i;j<array[i].length;j++){
        //         // total+=array[i][j];
        //         System.out.println(array[i][j]);
        //     }
        // }
        // System.out.println(total);
        //  String[] array = {"A","B","C"};
        //  for (String str :array){
        //      str="D";
        //  }
        //  for (String str:array){
        //      System.out.println(str);
        //  }
        // int num=10;
        // do{
        //     num++;
        // }while(++num<10);
        // System.out.println(num);
        int[] array ={1,2,3,4,5};
        int total=0;
        for (int i:array){
            if(i%2==0)
                continue;
                total+=i;
            
            System.out.println(total);
        }
        // int total =0;
        // a: for(int i=0;i<5;i++){
        //     b:for (int j=0;j<5;j++){
        //         if(i%2==0)continue a;
        //         if(3<j)break b;
        //         System.out.println(j);
        //         total+=j;
        //     }
        // }
        // System.out.println(total);
}
}
