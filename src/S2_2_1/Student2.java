package S2_2_1;
import java.util.Scanner;

public class Student2 {
        private String name="王小明";
        private int age=20;
        private String sex="男";
        private String subject="帝骑";

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSubject() {
            return subject;
        }
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Student2(){}
        public Student2(String name,int age){
            this.setName(name);
            this.setAge(age);
            this.setSex("男");
            this.setSubject("ACCP");
        }
        public Student2(String name,int age,String sex,String subject){
            this.setName(name);
            this.setAge(age);
            this.setSex(sex);
            this.setSubject(subject);
        }
        public void print(){
            System.out.println("我的名字叫："+ this.getName() +"，性别："+ this.getSex() +",今年："+ this.getAge() +"岁,我的专业是"+ this.getSubject());
        }

}
//测试类
class Student2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入年龄：");
        int age = input.nextInt();
        System.out.println("请输入性别：");
        String sex = input.next();
        System.out.println("请输入专业：");
        String subject = input.next();
        Student2 s2=null;
        s2=new Student2();
        s2.print();
        s2=new Student2(name,age);
        s2.print();
        s2=new Student2(name,age,sex,subject);
        s2.print();
    }
}
