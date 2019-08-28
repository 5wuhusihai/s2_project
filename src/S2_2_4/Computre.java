package S2_2_4;
//计算机类
public class Computre {
    CPU cpu;
    EMS ems;
    HardDisk hardDisk;

    public Computre(CPU cpu,EMS ems,HardDisk hardDisK){
        this.cpu=cpu;
        this.ems=ems;
        this.hardDisk=hardDisK;
    }
    public void showInfo(CPU cpu,EMS ems,HardDisk hardDisK){
        System.out.println("计算机信息如下：");
        System.out.println("CPU的品牌是："+cpu.gerCPUBrand()+"，主频是："+cpu.getFrequency());
        System.out.println("硬盘容量是："+hardDisK.getCapacity()+"GB\n内存容量是："+ems.getEMSType()+"GB");
    }
}
//CPU类
interface CPU {
    public String gerCPUBrand();
    public String getFrequency();
}
//内存类
interface EMS {
    public String getEMSType();
    public int getSize();
}
//硬盘类
interface HardDisk {
    public int getCapacity();
}
//CPU厂商类
class CPUManufacturer implements CPU {
    public String gerCPUBrand(){
        return "Inte1";
    }
    public String getFrequency(){
        return "3.8GHz";
    }
}
//内存厂商类
class EMSManufacturer implements EMS {
    public String getEMSType(){
        return "Inte1";
    }
    public int getSize(){
        return 4;
    }
}
//硬盘厂商类
class HDManufacturer implements HardDisk{
    public int getCapacity(){
        return 3000;
    }
}
//测试类
class ComputerTest {
    public static void main(String[] args) {
        CPUManufacturer cpu=null;
        EMSManufacturer ems=null;
        HDManufacturer hardDisk=null;
        Computre com=new Computre(cpu,ems,hardDisk);

        cpu=new CPUManufacturer();
        ems=new EMSManufacturer();
        hardDisk=new HDManufacturer();
        com.showInfo(cpu,ems,hardDisk);
    }
}
