package S2_2_2;

//动物类
public abstract class Animals {
    public abstract void  huntinng();
    public abstract void bleat();
}
//狮子类
class Lion extends Animals {
    public void  huntinng(){
        System.out.println("狮子捕猎：锁定目标、用牙齿和利爪捕捉猎物。");
    }
    public void bleat(){
        System.out.println("狮子噢呜的叫。");
    }
}
//青蛙类
class Frog extends Animals {
    public void  huntinng(){
        System.out.println("青蛙捕猎：锁定目标，用舌头捕捉猎物");
    }
    public void bleat(){
        System.out.println("青蛙呱呱的叫。");
    }
}
//测试类
class TestAnimals{
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.huntinng();
        lion.bleat();
        Frog frog=new Frog();
        frog.huntinng();
        frog.bleat();
    }
}


