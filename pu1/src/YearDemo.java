import java.util.Scanner;
public class YearDemo {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("请输入需要判断的年份:");
        int s = c.nextInt();

        if (s%4==0 && s%100!=0 || s%400==0){
            System.out.println(s+"年是闰年");
        }else{
            System.out.println(s+"年是平年");
        }
    }
}
