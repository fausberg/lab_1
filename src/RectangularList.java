import java.util.ArrayList;

public class RectangularList extends TriangleList {

    private final ArrayList<Triangle> rectangularList = new ArrayList<>();

    public RectangularList() {
        for (Triangle triangle : super.sortTriangles) {
            if(triangle.getName().equalsIgnoreCase("rectangular")){
                rectangularList.add(triangle);
            }
        }
    }

    public void rectangularNumber() {
        System.out.println("rectangular number : " + Info.number(rectangularList));
    }

    public void rectangularMaxP() {
        System.out.println("rectangular Max P : " + Info.maxP(rectangularList));
    }

    public void rectangularMaxS() {
        System.out.println("rectangular Max S : " + Info.maxS(rectangularList));
    }

    public void rectangularMinP() {
        System.out.println("rectangular Min P : " + Info.minP(rectangularList));
    }

    public void rectangularMinS() {
        System.out.println("rectangular Min S : " + Info.minS(rectangularList));
    }

    public void info() {
        rectangularNumber();
        rectangularMaxP();
        rectangularMinP();
        rectangularMinS();
        rectangularMaxS();
    }
}
