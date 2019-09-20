package S2_2_5;

import java.util.Scanner;

public class Three {
    public static void foo(){
        int[] app=new int[7];
        try {
            int num=10;

            for (int i=0;i<=num;i++){
                Scanner input=new Scanner(System.in);
                System.out.print("请输入第"+(i+1)+"个数:");
                app[i]=input.nextInt();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界！");
            for (int i=0;i<app.length;i++){
            System.out.println("第"+(i+1)+"个数是："+app[i]);
            }
        }
    }

    public static void main(String[] args) {
        foo();
    }
}
