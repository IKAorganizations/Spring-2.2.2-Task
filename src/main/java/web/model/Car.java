package web.model;


public class Car {

    private String name;

    private int model;

    private int age;


    public Car(String name, int model, int age) {
        this.name = name;
        this.model = model;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name +
                ", model - " + model +
                ", age - " + age;
    }
}
