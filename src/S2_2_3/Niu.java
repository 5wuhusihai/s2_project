package S2_2_3;

import java.util.Scanner;

//牛犇类
public abstract class Niu {
    String name;
    String state;
    String food;
    public Niu(String name,String state,String food){
        this.name=name;
        this.state=state;
        this.food=food;
    }
    public abstract void print();

    public abstract void exercise();
}

//约翰类
class John extends Niu {
    public John(String name,String state,String food){
        super(name,state,food);
    }
    public void print(){
        System.out.println("我准备了你爱吃的"+super.food+"！");
        System.out.println("朋友的自我介绍：\n我叫"+super.name+"，来自"+super.state);
    }
    public void exercise(){
        System.out.println("我爱打橄榄球");
    }
}


//王小强类
class Wang extends Niu {
    public Wang(String name,String state,String food){
        super(name,state,food);
    }
    public void print(){
        System.out.println("我准备了你爱吃的"+super.food+"！");
        System.out.println("朋友的自我介绍：\n我叫"+super.name+"，来自"+super.state);
    }
    public void exercise(){
        System.out.println("我爱打太极");
    }
}


//招待类
class Entertain {
    public void feed(Niu niu){
        niu.print();
    }
    public Niu getNiu(int user){
        Niu niu=null;
        if (user==1)
            niu=new Wang("王小强","中国","四川菜");
        else if (user==2)
            niu=new John("约翰","美国","披萨");
        return niu;
    }
    public Niu hobby(Niu niu){
        if(niu instanceof Wang){
            Wang w=(Wang) niu;
            niu.exercise();
        }
        else if (niu instanceof John){
            John j=(John) niu;
            niu.exercise();
        }
        return niu;
    }
}

class TextEntertain{
    public static void main(String[] args) {
        Entertain e=new Entertain();
        Scanner input =new Scanner(System.in);
        System.out.print("请选择要来的朋友：（1.王小强 2.约翰 ）");
        int user=input.nextInt();
        if (user==1) {
            System.out.println("王小强，欢迎来你我家玩！");
        }
        else if (user==2){
            System.out.println("约翰，欢迎来你我家玩！");
        }
        Niu niu=e.getNiu(user);
        if (niu!=null){
            e.feed(niu);
            e.hobby(niu);
        }else {
            System.out.println("对不起，我不认识你。");
        }


    }
}