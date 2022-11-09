import java.util.ArrayList;

public class Info {

    public static int number(ArrayList<Triangle> arrayList) {
        int n = 0;
        for (Triangle triangle : arrayList) {
            n++;
        }
        return n;
    }

    public static Triangle maxS(ArrayList<Triangle> arrayList){
        double saveNumber = 0;
        Triangle triangleMaxS = null;
        for (Triangle triangle : arrayList) {
            if(triangle.getS() > saveNumber){
                saveNumber = triangle.getS();
                triangleMaxS = triangle;
            }
        }
        return triangleMaxS;
    }

    public static Triangle minS(ArrayList<Triangle> arrayList){
        double saveNumber = 1000000000;
        Triangle triangleMinS = null;
        for (Triangle triangle : arrayList) {
            if(triangle.getS() < saveNumber){
                saveNumber = triangle.getS();
                triangleMinS = triangle;
            }
        }
        return triangleMinS;
    }

    public static Triangle maxP(ArrayList<Triangle> arrayList){
        double saveNumber = 0;
        Triangle triangleMaxP = null;
        for (Triangle triangle : arrayList) {
            if(triangle.getP() > saveNumber){
                saveNumber = triangle.getP();
                triangleMaxP = triangle;
            }
        }
        return triangleMaxP;
    }

    public static Triangle minP(ArrayList<Triangle> arrayList){
        double saveNumber = 1000000000;
        Triangle triangleMinP = null;
        for (Triangle triangle : arrayList) {
            if(triangle.getP() < saveNumber) {
                saveNumber = triangle.getS();
                triangleMinP = triangle;
            }
        }
        return triangleMinP;
    }
}
