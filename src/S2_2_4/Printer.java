package S2_2_4;
//打印机类
public class Printer {
    InkBox inkBox;
    Paper paper;
    public void setInkBox(InkBox inkBox){
        this.inkBox=inkBox;
    }
    public void setPaper(Paper paper){
        this.paper=paper;
    }
    public void print(){
        System.out.println("使用"+inkBox.getColor()+"墨盒在"+paper.getSize()+"纸张上打印。");
    }
}
//墨盒接口
interface InkBox {
    public String getColor();
}
//纸张接口
interface Paper {
    public String getSize();
}
//彩色墨盒类
class ColorInkBox implements InkBox{
    public String getColor(){
        return "彩色";
    }
}
//黑白墨盒类
class GrayInkBox implements InkBox {
    public String getColor(){
        return "黑白";
    }
}
//A4试纸类
class A4Paper implements Paper{
    public String getSize(){
        return "A4";
    }
}
//B5试纸类
class B5Paper implements Paper {
    public String getSize(){
        return "B5";
    }
}
//测试类
class TestPrinter{
    public static void main(String[] args) {
        InkBox inkBox=null;
        Paper paper=null;
        Printer printer=new Printer();

        inkBox=new GrayInkBox();
        paper=new A4Paper();
        printer.setInkBox(inkBox);
        printer.setPaper(paper);
        printer.print();

        paper=new B5Paper();
        printer.setPaper(paper);
        printer.print();

        inkBox=new ColorInkBox();
        paper=new B5Paper();
        printer.setInkBox(inkBox);
        printer.setPaper(paper);
        printer.print();

        paper=new A4Paper();
        printer.setPaper(paper);
        printer.print();
    }
}