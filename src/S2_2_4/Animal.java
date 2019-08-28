package S2_2_4;

public interface Animal {
    void shout();
}
class Dog implements Animal{
    public void shout(){
        System.out.println("D D!");
    }
}
class Cat implements Animal{
    public void shout(){
        System.out.println("C C!");
    }
}
class Pig implements Animal{
    public void shout(){
        System.out.println("P P!");
    }
}
class Store{
    public static Animal get(String choice){
        if(choice.equalsIgnoreCase("dog")){
            return new Dog();
        }else if (choice.equalsIgnoreCase("pig")){
            return new Pig();
        }else {
            return new Cat();
        }
    }
}
class AnimalTset{
    public static void main(String[] args) {
        Animal a1=Store.get("dog");
        a1.shout();
        Animal a2=Store.get("pig");
        a2.shout();
    }
}
