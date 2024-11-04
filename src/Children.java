public final class Children extends Parents {

    public Children(String name, Gender gender, House house, int age) {
        super(name, gender, house, age);

    }

    @Override
    public void printInfo() {
        if (getGender() == Gender.MALE) {
            System.out.println("Мальчик");
        }else
            System.out.println("Девочка");
            super.printInfo();

    }
}
