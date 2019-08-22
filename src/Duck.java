public class Duck extends Poultry {
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
