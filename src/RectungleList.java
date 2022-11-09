import java.util.ArrayList;

public class RectungleList extends TriangleList {

    private ArrayList<Triangle> rectungleList = new ArrayList<>();

    public RectungleList() {
        for (Triangle triangle : super.sortTriangles) {
            if(triangle.getName().equalsIgnoreCase("rectangular")){
                rectungleList.add(triangle);
            }
        }
    }

    public void rectungleNumber() {
        System.out.println("rectungle number : " + Info.number(rectungleList));
    }

    public void rectungleMaxP() {
        System.out.println("rectungle Max P : " + Info.maxP(rectungleList));
    }

    public void rectungleMaxS() {
        System.out.println("rectungle Max S : " + Info.maxS(rectungleList));
    }

    public void rectungleMinP() {
        System.out.println("rectungle Min P : " + Info.minP(rectungleList));
    }

    public void rectungleMinS() {
        System.out.println("rectungle Min S : " + Info.minS(rectungleList));
    }

    public void info() {
        rectungleNumber();
        rectungleMaxP();
        rectungleMinP();
        rectungleMinS();
        rectungleMaxS();
    }
}
