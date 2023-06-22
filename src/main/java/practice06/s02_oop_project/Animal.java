package practice06.s02_oop_project;

public abstract class Animal {
    private String name;
    private int age;
    private String type;

    public Animal(String name, int yas, String tur) {
        this.name = name;
        this.age = yas;
        this.type = tur;
    }

    public abstract void eat();
    public abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "ad='" + name + '\'' +
                ", yas=" + age +
                ", tur='" + type + '\'' +
                '}';
    }
}
