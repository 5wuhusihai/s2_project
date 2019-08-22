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
