package S2_2_4;
//门类
public abstract class Door {
    public abstract void open();
    public abstract void close();
}
//锁接口
interface Lock {
    String lockName="锁";
    void lockUp();
    void openLock();
}
//门铃接口
interface DoorBell {
    void takePictures();
}
//防盗门类
class TheftproofDoor extends Door implements Lock,DoorBell  {
    @Override
    public  void lockUp(){
        System.out.println("插入钥匙，向左旋转三圈，锁上了，拔出钥匙。");
    }
    @Override
    public void openLock(){
        System.out.println("插入钥匙，向右旋转三圈，锁打开了，拔出钥匙。");
    }
    @Override
    public void open(){
        System.out.println("用力推，门打开了。");
    }
    @Override
    public  void close(){
        System.out.println("轻轻拉门，门关上了。");
    }
    @Override
    public  void takePictures(){
        System.out.println("铃······咔嚓······照片已储存");
    }
}
//测试类
class DoorTest {
    public static void main(String[] args) {
        TheftproofDoor tfd=new TheftproofDoor();
        tfd.close();
        tfd.lockUp();
        tfd.takePictures();
        tfd.openLock();
        tfd.open();
    }
}
