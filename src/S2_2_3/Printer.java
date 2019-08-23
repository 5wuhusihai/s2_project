package S2_2_3;
//打印机类
public abstract class Printer {
    public abstract void print();
}
//针式打印机类
class DotMatrixPrinter extends Printer {
    public void print(){
        System.out.println("使用针式打印机类");
    }
}
//喷墨打印机类
class InkpetPrinter extends Printer {
    public void print(){
        System.out.println("使用针式打印机类");
    }
}
//激光打印机类
class LaserPrinter extends Printer {
    public void print(){
        System.out.println("使用激光打印机类");
    }
}
//测试类
class TestPrinter {
    public static void main(String[] args) {
        DotMatrixPrinter dp=new DotMatrixPrinter();
        dp.print();
        InkpetPrinter ip=new InkpetPrinter();
        ip.print();
        Printer p= new LaserPrinter();
        p.print();
    }


}

