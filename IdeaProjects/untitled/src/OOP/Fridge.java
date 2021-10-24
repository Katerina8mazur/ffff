package OOP;

public class Fridge {
    double ves;
    boolean sos;

    public Fridge(double ves, boolean sos) {
        this.ves = ves;
        this.sos = true;
    }

    public static void main(String[] args) {

        Food vegetables = new Food(500);
        Food fruits = new Food(400);
        Food dishes = new Food(800);

        Maximum vegetables1 = new Maximum(400);
        Maximum fruits1 = new Maximum(400);
        Maximum dishes1 = new Maximum(400);

        Fridge vegetables2 = new Fridge(0, true);
        Fridge fruits2 = new Fridge(0, true);
        Fridge dishes2 = new Fridge(0, true);

        if ((vegetables2.ves < vegetables1.ves) | (fruits2.ves < fruits1.ves) | (dishes2.ves < dishes1.ves)) {
            System.out.println("Не полностью полный");
        } else {
            System.out.println("Я полон");
        }
        System.out.println();

        if (vegetables2.ves < vegetables1.ves) {
            //double a = vegetables.ves - vegetables1.ves;
            vegetables2.ves = vegetables1.ves;
        }
        if (fruits2.ves < fruits1.ves) {
            //double b = fruits.ves - fruits1.ves;
            fruits2.ves = fruits1.ves;
        }
        if (dishes2.ves < dishes1.ves) {
            //double c = dishes.ves - dishes1.ves;
            dishes2.ves = dishes1.ves;
        }
        System.out.println("Теперь я полон");
    }
}