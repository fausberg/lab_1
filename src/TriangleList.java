import java.util.ArrayList;
import java.util.Collections;

public class TriangleList {
    private ArrayList<Triangle> triangles = new ArrayList<>();

    protected ArrayList<Triangle> sortTriangles = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();

    public TriangleList() {
        this.triangles.add(new Triangle(-1, 0, 0, 4, 1, 0));
        this.triangles.add(new Triangle(3, 0, 5, 4, 7, 0));
        this.triangles.add(new Triangle(1, 5, 1, 7, 2, 6));
        this.triangles.add(new Triangle(1, 2, 3, 2, 3, 3));
        this.triangles.add(new Triangle(3, 2, 3, 4, 5, 6));
        this.triangles.add(new Triangle(0, 0, 10, 0, 5, 7));
        this.triangles.add(new Triangle(0, 0, 0, 0, 5, 7));
        this.triangles.add(new Triangle(0, 0, 0, 0, 0, 0));

        trianglesSort();
    }

    public void trianglesSort() {
        for (Triangle triangle : triangles) {
            if(!triangle.getName().equals("error")) {
                name.add(triangle.getName());
            }
        }

        Collections.sort(name);

        int n = 0;
        while (n < name.size()) {
            for (Triangle triangle : triangles) {
                if (triangle.getName() == name.get(n)) {
                    sortTriangles.add(triangle);
                    triangle.setName("check: " + triangle.getName());
                    n++;
                    if (n == name.size()) {
                        break;
                    }
                }
            }
        }

        n = 0;
        for (Triangle triangle : sortTriangles) {
            triangle.setName(name.get(n));
            n++;
        }
    }


    @Override
    public String toString() {
        return "TriangleList{" +
                "sortTriangles=" + sortTriangles +
                '}';
    }
}
