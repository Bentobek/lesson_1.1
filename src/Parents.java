public class Parents extends Person{
    private int age;

    public Parents(String name, Gender gender, House house , int age) {
        super(name, gender, house);
        this.age = age;
    }


    public int getAge() {
        return age;
    }

     public void printInfo() {
         System.out.println(getName() + " возраст: " + age);
     }

     public final void printInfo(String prefix) {
         System.out.println(prefix + ": " + getName());
    }
}
