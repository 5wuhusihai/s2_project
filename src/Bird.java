public class Bird extends Animal {
    private String color;

    public Bird(String color){
//        super(age);
        this.setColor(color);
    }
    public int info(int age){
        System.out.println("我是一只"+ this.getColor() +"的鸟！"+"\n今年"+age+"岁了！\n");
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
