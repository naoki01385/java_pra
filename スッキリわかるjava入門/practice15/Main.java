import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args){
        // String s1="スッキリJava";
        // String s2="java";
        // String s3="java";
        // if(s2.equals(s3)){
        //     System.out.println("s2とs3は等しい");
        // }
        // if(s2.equalsIgnoreCase(s3)){
        //     System.out.println("ケースを区別しなければ等しい");
        // }
        // System.out.println("s1の長さは"+s1.length());
        // if(s1.isEmpty()){
        //     System.out.println("s1は空文字です");
        // }
        // long start =System.currentTimeMillis();
        // StringBuilder sb =new StringBuilder();
        // for (int i =0;i<10;i++){
        //     sb.append("Java");
        //     System.out.println(sb);
        // }
        // String s =sb.toString();

        // long end =System.currentTimeMillis();
        // System.out.println("処理にかかった時間は"+(end-start)+"ミリ秒でした");
        // Date now =new Date();
        // System.out.println(now);

        // StringBuilder sb =new StringBuilder();
        // for (int i=0;i<100;i++){
        //     sb.append(i+1).append(",");
        // }
        // String s=sb.toString();
        // String[]a=s.split(",");

        // public String concatPath(String folder,string file){
        //     if(!folder.endsWith("¥¥")){
        //         folder+="¥¥";
        //     }
        //     return folder+file;
        // }
        LocalDate now =LocalDate.now();
        LocalDate future  = now.plusDays(100);
        DateTimeFormatter fmt= DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(future.format(fmt));

 }
    
}
