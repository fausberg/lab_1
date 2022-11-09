import java.util.ArrayList;

public class EquilateralList extends TriangleList {

    private final ArrayList<Triangle> equilateralList = new ArrayList<>();

    public EquilateralList() {
        for (Triangle triangle : super.sortTriangles) {
            if(triangle.getName().equalsIgnoreCase("equilateral")){
                equilateralList.add(triangle);
            }
        }
    }

    public void numberEquilateral() {
        System.out.println("equilateral number : " + Info.number(equilateralList));
    }

    public void equilateralMinS() {
        System.out.println("equilateral Min S : " + Info.minS(equilateralList));
    }

    public void equilateralMinP() {
        System.out.println("equilateral Min P : " + Info.minP(equilateralList));
    }


    public void equilateralMaxS() {
        System.out.println("equilateral Max S : " + Info.maxS(this.equilateralList));
    }

    public void equilateralMaxP() {
        System.out.println("equilateral Max P : " + Info.maxP(equilateralList));
    }

    public void info() {
        numberEquilateral();
        equilateralMaxP();
        equilateralMinP();
        equilateralMinS();
        equilateralMaxS();
    }
}
