package S2_2_5;

public class Person {
   private String name="";
   private int age=0;
   private String sex="男";
   public void setSex(String sex) throws Exception{
       if ("男".equals(sex)||"女".equals(sex)){
           this.sex=sex;
       }
       else {
           throw new Exception("性别必须是\"男\"或者\"女\"！");
       }
   }
    public void setAge(int age) throws Exception{
        if (age>=1&&age<=100){
            this.age=age;
        }
        else {
            throw new Exception("年龄必须在\"1\"到\"100\"之间！");
        }
    }
   public void print(){
       System.out.println(this.name+"("+this.sex+","+this.age+"岁)");
   }
}
class Test9{
    public static void main(String[] args) {
        Person person=new Person();
        try {
            person.setSex("男");
            person.setAge(32);
            person.print();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}