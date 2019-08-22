public class Fish extends Animal {
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
