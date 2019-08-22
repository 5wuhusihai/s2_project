public class Chicken extends Poultry {
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
