package Progress_241230.poly.ex5;

public class Cow implements InterfaceAnimal{
    @Override
    public void move() {
        System.out.println(" -------------- ");
        System.out.println("소가 이동합니다!");
        System.out.println(" ================ ");
    }

    @Override
    public void sound() {
        System.out.println(" -------------- ");
        System.out.println("소가 웁니다!");
        System.out.println(" ================ ");
    }
}