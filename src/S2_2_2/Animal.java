package S2_2_2;

//动物类
public abstract class Animal {
    private int age;
    public abstract int info(int age);
    public int getAge() {
        return age;
    }
}
//鸟类
class Bird extends Animal {
    private String color;

    public Bird(String color){
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
//鱼类
class Fish extends Animal {
    private int weight;

    public Fish(int weight){
//        super(age);
        this.setWeight(weight);
    }
    public int info(int age){
        System.out.println("我是一只"+ this.getWeight() +"几斤重的鱼！"+"\n今年"+age+"岁了！\n");
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
//测试类
class TestAnimal {
    public static void main(String[] args) {
        Bird bird=new Bird("红色的");
        bird.info(4);
        Fish fish=new Fish(5);
        fish.info(2);
    }
}

