import java.util.ArrayList;

public class IsoscelesList extends TriangleList {

    private ArrayList<Triangle> isoscelesList = new ArrayList<>();

    public IsoscelesList() {
        for (Triangle triangle : super.sortTriangles) {
            if(triangle.getName().equalsIgnoreCase("isosceles")) {
                this.isoscelesList.add(triangle);
            }
        }
    }

    public void isoscelesNumber() {
        System.out.println("isosceles number : " + Info.number(isoscelesList));
    }

    public void isoscelesMaxP() {
        System.out.println("isosceles Max P : " + Info.maxP(isoscelesList));
    }

    public void isoscelesMaxS() {
        System.out.println("isosceles Max S : " + Info.maxS(isoscelesList));
    }

    public void isoscelesMinP() {
        System.out.println("isosceles Min P : " + Info.minP(isoscelesList));
    }

    public void isoscelesMinS() {
        System.out.println("isosceles Min S : " + Info.minS(isoscelesList));
    }

    public void info() {
        isoscelesNumber();
        isoscelesMaxP();
        isoscelesMinP();
        isoscelesMinS();
        isoscelesMaxS();
    }
}
