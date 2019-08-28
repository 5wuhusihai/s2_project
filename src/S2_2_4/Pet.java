package S2_2_4;

import java.util.Scanner;
//宠物类
public abstract class Pet {
    private String name;
    private int health;
    private int love;
    public Pet(String name,int health,int love){
        this.setName(name);
        this.setHealth(health);
        this.setLove(love);
    }
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
//吃饭接口
interface Eatable {
    void eat();
}
//接飞盘接口
interface FlyingDiscCatchable {
    void catchingFlyDisc();
}
//游泳接口
interface Swimmable {
    void swim();
}
//狗狗类
class Doggie extends Pet implements Eatable,FlyingDiscCatchable {
    private String strain;
    public Doggie(String name,int health,int love,String strain){
        super(name,health,love);
        this.setStrain(strain);
    }
    public void eat(){
        super.setHealth(super.getHealth() +3);
        System.out.println("狗狗"+ super.getName() +"吃饱了！健康值加3。");
    }
    public void catchingFlyDisc(){
        System.out.println("狗狗"+ super.getName() +"正在接飞盘。");
        super.setHealth(super.getHealth() -10);
        super.setLove(super.getLove() +5);
        System.out.println(super.getName()+"玩累了，健康值减10"+"，亲密度加5");
    }
    public void print(){
        System.out.println("我叫"+ super.getName() +"我是一条"+ this.getStrain());
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
//企鹅类
class Penguin extends Pet implements Eatable,Swimmable {
    private String sex;
    public Penguin(String name,int health,int love,String sex){
        super(name,health,love);
        this.setSex(sex);
    }
    public void eat(){
        super.setHealth(super.getHealth() +3);
        System.out.println("企鹅"+ super.getName() +"吃饱了！健康值加3。");
    }
    public void swim(){
        System.out.println("企鹅"+ super.getName() +"正在游泳。");
        super.setHealth(super.getHealth() -10);
        super.setLove(super.getLove() +5);
        System.out.println(super.getName()+"玩累了，健康值减10"+"，亲密度加5");
    }
    public void print(){
        System.out.println("我叫"+ super.getName() +"性别为"+ this.getSex());
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
//测试类
class PetTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎您来到宠物店！");
        System.out.print("请选择要领养宠物的类型：（1.狗狗 2.企鹅 ）");
        int typeId=input.nextInt();
        switch (typeId) {
            case 1:
                System.out.println("领养成功！");
                Doggie dog=new Doggie("旺旺",100,0,"雪纳瑞");
                dog.print();
                dog.eat();
                dog.catchingFlyDisc();
                break;
            case 2:
                System.out.println("领养成功！");
                Penguin pen=new Penguin("欧欧",100,0,"雌");
                pen.print();
                pen.eat();
                pen.swim();
                break;
            default:
                System.out.println("对不起，没有此类型的宠物，领养失败。");
        }
    }
}
