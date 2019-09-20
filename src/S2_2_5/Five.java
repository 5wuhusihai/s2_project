package S2_2_5;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Five {
    private static Logger logger=Logger.getLogger(Three.class);

        public static void foo(){
            int[] app=new int[5];
            try {
                int num=8;
                for (int i=0;i<=num;i++){
                    Scanner input=new Scanner(System.in);
                    System.out.print("请输入第"+(i+1)+"个数:");
                    app[i]=input.nextInt();
                    logger.debug("请输入第"+app[i]+"个数:");
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logger.fatal(e.getMessage());
                for (int i=0;i<app.length;i++){
                    System.out.println("第"+(i+1)+"个数是："+app[i]);
                }
            }
        }

        public static void main(String[] args) {
            foo();
    }
}
