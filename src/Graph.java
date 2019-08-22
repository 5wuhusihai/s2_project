//图形类
public abstract class Graph {
    private double S;//面积
   public final double π=3.14;//π

   public abstract void Count();

    public double getS() {
        return S;
    }
    public void setS(double s) {
        S = s;
    }
}
//圆类
class Circle extends Graph {
    private int r;//半径

    public Circle(int r){
        this.setR(r);
    }
    public void Count(){
        super.setS(getR() * getR() *super.π);
        System.out.println("面积为："+getS());
    }

    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
}
//梯形类
class Trapezoid extends Graph {
    private int b;//底长
    private int a;//顶长
    private int h;//高
    public Trapezoid(int b,int a,int h){
        this.setB(b);
        this.setA(a);
        this.setH(h);
    }
    public void Count(){
        super.setS((getA() + this.getB())/2* getH());
        System.out.println("面积为："+getS());
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
            this.b = b;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
}
//三角形类
class Triangle extends Graph {
    private int a;//底长
    private int h;//高
    public Triangle(int a,int h){
        this.setA(a);
        this.setH(h);
    }
    public void Count(){
        super.setS(getA() * getH() /2);
        System.out.println("面积为："+getS());
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
}
//测试类
class TestGraph {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.Count();
        Trapezoid trapezoid=new Trapezoid(7,4,7);
        trapezoid.Count();
        Triangle triangle=new Triangle(2,5);
        triangle.Count();
    }
}


