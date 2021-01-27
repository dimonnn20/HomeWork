package eu.senla.task3;

public class Cat {
    private String name;
    private int age;

    public Cat () {
    int age =3;
    String name = "Bori";
    this.name = name;
    this.age = age;
}
public Cat (String name, int age) {
        this.name = name;
        this.age = age;
}

    @Override
    public String toString() {
    return "Сat { " + name +
            ", age = " + age + "}";
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge() {
        return age;
    }
}
