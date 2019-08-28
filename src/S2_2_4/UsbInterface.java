package S2_2_4;
//USB接口
public interface UsbInterface {
    void service();
}
//U盘
class UDisk implements UsbInterface {
    public void service(){
        System.out.println("连接USB口，开始传输数据。");
    }
}
//USB风扇
class UsbFan implements UsbInterface {
    public void service(){
        System.out.println("连接USB口，获得电流，风扇开始转动。");
    }
}
//测试类
class Test1 {
    public static void main(String[] args) {
        UsbInterface uDick=new UDisk();
        uDick.service();
        UsbInterface usbFan=new UsbFan();
        usbFan.service();
    }
}

