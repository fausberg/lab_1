public class Triangle {

    private final double length1;
    private final double length2;
    private final double length3;

    private double P;

    private double p;
    private double S;

    private String name;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);

        this.length1 = Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2));
        this.length2 = Math.sqrt(Math.pow((point3.getX() - point2.getX()), 2) + Math.pow((point3.getY() - point2.getY()), 2));
        this.length3 = Math.sqrt(Math.pow((point3.getX() - point1.getX()), 2) + Math.pow((point3.getY() - point1.getY()), 2));

        error(x1, y1, x2, y2, x3, y3);
    }

    public void square() {
        p = perimeter()/2;
        S = Math.sqrt(p * (p - length1) * (p - length2) * (p * length3));
    }

    public double perimeter() {
        P = length1 + length2 + length3;
        return P;
    }

    public void form() {
        if (length3 == Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2))) {
            name = "rectangular";
        } else if (length2 == Math.sqrt(Math.pow(length1, 2) + Math.pow(length3, 2))) {
            name = "rectangular";
        } else if (length1 == Math.sqrt(Math.pow(length2, 2) + Math.pow(length3, 2))) {
            name = "rectangular";
        } else if (length1 == length2 || length1 == length3 || length3 == length2) {
            name = "isosceles";
        } else if (length1 == length2 && length2 == length3) {
            name = "equilateral";
        } else {
            name = "default";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getP() {
        return P;
    }

    public double getS() {
        return S;
    }

    public void error(double x1, double y1, double x2, double y2, double x3, double y3) {
        if(x1 == x2 && x2 == x3){
            setName("error");
        } else if (y1 == y2 && y2 == y3) {
            setName("error");
        } else if (x1 == x2 && y1 == y2 || x2 == x3 && y2 == y3 || x1 == x3 && y1 == y3) {
            setName("error");
        } else {
            form();
            square();
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length1=" + length1 +
                ", length2=" + length2 +
                ", length3=" + length3 +
                ", P=" + P +
                ", p=" + p +
                ", S=" + S +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
