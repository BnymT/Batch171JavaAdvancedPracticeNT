package practice06.s02_oop_project;

public class Guests {
    private String name;
    private int age;
    private String gender;
    private String guestDate;

    public Guests(String name, int age, String gender, String guestDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.guestDate = guestDate;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGuestDate() {
        return guestDate;
    }

    public void setGuestDate(String guestDate) {
        this.guestDate = guestDate;
    }

    @Override
    public String toString() {
        return "Guests{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", guestDate='" + guestDate + '\'' +
                '}';
    }
}
