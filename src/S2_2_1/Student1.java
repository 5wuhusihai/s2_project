package S2_2_1;
import java.util.Scanner;
public class Student1 {
        private String name;
        private int age;

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            if (age>16) {
                this.age=age;
                print();
            }
            else
                System.out.println("年龄不符");
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void print(){
            System.out.println("我的名字叫："+ this.getName() +",今年："+ this.getAge() +"岁。");
        }
}
//测试类
class Student1Test {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=input.next();
        System.out.println("请输入年龄：");
        int age=input.nextInt();
        Student1 s1=new Student1();
        s1.setName(name);
        s1.setAge(age);

    }

}

