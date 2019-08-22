//家禽类
public abstract class Poultry {
    private String name;
    private String food;
    private String speciality;

    public Poultry(String name,String food,String speciality){
        this.setName(name);
        this.setFood(food);
        this.setSpeciality(speciality);
    }
    public abstract void show();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
//鸭类
class Duck extends Poultry {
    private String duck;
    public Duck(String name,String food,String speciality,String duck){
        super(name,food,speciality);
        this.setDuck(duck);
    }
    public void show(){
        System.out.println("我叫"+ getName() +"，我是一只"+ getDuck() +"！");
        System.out.println("我喜欢吃"+ getFood() +"！");
        System.out.println("我会"+ getSpeciality() +"！");
        System.out.println();
    }

    public String getDuck() {
        return duck;
    }

    public void setDuck(String duck) {
        this.duck = duck;
    }
}
//鸡类
class Chicken extends Poultry {
    private String chicken;

    public Chicken(String name,String food,String speciality,String chicken){
        super(name,food,speciality);
        this.setChicken(chicken);
    }
    public void show(){
        System.out.println("我叫"+ getName() +"，我是一只"+ getChicken() +"！");
        System.out.println("我喜欢吃"+ getFood() +"！");
        System.out.println("我会"+ getSpeciality() +"！");
        System.out.println();
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }
}
//测试类
class TestPoultry {
    public static void main(String[] args) {
        Chicken c=new Chicken("喔喔","虫子","打鸣","芦花鸡");
        c.show();
        Duck d=new Duck("嘎嘎","小鱼虾","游泳","斑嘴鸭");
        d.show();
    }
}
