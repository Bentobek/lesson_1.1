public class Person {
    private String name;
    private Gender gender;
    private House house;

    public Person(String name, Gender gender, House house) {
        this.name = name;
        this.gender = gender;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public House getHouse() {
        return house;
    }
}
