public class Main {
    public static void main(String[] args) {
        TriangleList triangleList = new TriangleList();

        System.out.println(triangleList);
        System.out.println();

        EquilateralList equilateralList = new EquilateralList();
        IsoscelesList isoscelesList = new IsoscelesList();
        DefaultList defaultList = new DefaultList();
        RectungleList rectungleList = new RectungleList();

        equilateralList.info();
        System.out.println();

        isoscelesList.info();
        System.out.println();

        defaultList.info();
        System.out.println();

        rectungleList.info();
    }
}