package S2_2_1;

import java.util.Scanner;

public class Penguin {
        String name="无名氏";
        int health=100;
        int love=0;
        final String SEX_MALE="Q仔";
        final String SEX_FEMALE="Q妹";
        String sex=SEX_MALE;
        public Penguin(String name,String sex){
            this.name=name;
            this.sex=sex;
        }

        public void print() {
            System.out.println("宠物的自白：\n我的名字叫"+this.name+"，健康值是"+this.health+"，和主人的亲密度是"+this.love+
                    "，性别是:"+this.sex+"。");
        }
}
//测试类
class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎您来到宠物店！");
        System.out.print("请输入要领养宠物的名字：");
        String name=input.next();
        System.out.print("请选择要领养宠物的类型：（1.狗狗 2.企鹅）");
        switch (input.nextInt()){
            case 1:
                System.out.print("抱歉狗狗暂无，请重新选择或者稍后再来！");

                break;
            case 2:
                System.out.print("请选择企鹅的性别：（1.Q仔 2.Q妹）");
                String sex=null;
                if(input.nextInt()==1){
                    sex="Q仔";
                    Penguin pgn=null;
                    pgn=new Penguin(name,"雄");
                    pgn.print();
                }
                else{
                    sex="Q妹";
                    Penguin pgn=null;
                    pgn=new Penguin(name,"雌");
                    pgn.print();
                }
        }
    }
}