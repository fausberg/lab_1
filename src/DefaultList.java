import java.util.ArrayList;

public class DefaultList extends TriangleList {

    private ArrayList<Triangle> defaultList = new ArrayList<>();

    public DefaultList() {
        for (Triangle triangle : super.sortTriangles) {
            if(triangle.getName().equalsIgnoreCase("default")){
                this.defaultList.add(triangle);
            }
        }
    }

    public void defaultNumber() {
        System.out.println("default number : " + Info.number(defaultList));
    }

    public void defaultMinS() {
        System.out.println("default Min S : " + Info.minS(defaultList));
    }

    public void defaultMinP() {
        System.out.println("default Min P : " + Info.minP(defaultList));
    }

    public void defaultMaxS() {
        System.out.println("default Max S : " + Info.maxS(defaultList));
    }

    public void defaultMaxP() {
        System.out.println("default Max P" + Info.maxP(defaultList));
    }

    public void info() {
        defaultNumber();
        defaultMaxP();
        defaultMinP();
        defaultMinS();
        defaultMaxS();
    }
}
