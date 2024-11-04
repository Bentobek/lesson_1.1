//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        House house = new House("Bishkek" , "Ibraimova");
        Parents parents1 = new Parents("Monica" , Gender.FEMALE  , house , 34);
        Children children = new Children("Beto" , Gender.MALE , house , 12);
        Children children1 = new Children("Atai" , Gender.FEMALE , house , 5);
        parents1.printInfo();
        parents1.printInfo("Родитель");
        children.printInfo();
        children1.printInfo();
        }
    }
