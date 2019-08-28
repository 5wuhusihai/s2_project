package S2_2_4;
//手机类
public abstract class Handset {
    String name;
    String brand;
    public Handset(String name,String brand){
        this.name=name;
        this.brand=brand;
    }
    public abstract void show();
    public abstract void faXiaoxi();
    public abstract void tongHua();
}
//上网接口
interface Network {
    void shangWang();
}
//播放接口
interface PlayWiring {
    void boFang();
}
//拍照接口
interface TheakePictures {
    void paiZhano();
}
//普通手机类
class CommonHandest extends Handset implements PlayWiring {
    public CommonHandest(String name,String brand){
        super(name,brand);
    }
    public void show(){
        System.out.println("这是一款型号为"+super.name+"的"+super.brand+"手机");
    }
    public void boFang(){
        System.out.println("开始播放音乐《热雪》······");
    }
    public void faXiaoxi(){
        System.out.println("发送文字信息······");
    }
    public void tongHua(){
        System.out.println("开始语音通话······");

    }
}
//智能手机类
class AptitudeHandset extends Handset implements PlayWiring,Network,TheakePictures {
    public AptitudeHandset(String name,String brand){
        super(name,brand);
    }
    public void show(){
        System.out.println("\n这是一款型号为"+super.name+"的"+super.brand+"手机");
    }
    public void boFang(){
        System.out.println("开始播放音乐《小时代》······");
    }
    public void paiZhano(){
        System.out.println("咔嚓·····拍照成功······");
    }
    public void shangWang(){
        System.out.println("已经启动移动网络······");
    }
    public void faXiaoxi(){
        System.out.println("发送带图片和文字的信息······");
    }
    public void tongHua(){
        System.out.println("开始视频通话······");

    }
}
//测试类
class HandsetTest {
    public static void main(String[] args) {
        CommonHandest ch=new CommonHandest("G502c","索尼爱立信");
        ch.show();
        ch.boFang();
        ch.faXiaoxi();
        ch.tongHua();
        AptitudeHandset ah=new AptitudeHandset("HTC","I9100");
        ah.show();
        ah.shangWang();
        ah.boFang();
        ah.paiZhano();
        ah.faXiaoxi();
        ah.tongHua();
    }
}
