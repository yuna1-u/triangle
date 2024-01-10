public class triangle {

    double a;
    double b;
    double c;

    void area() {
        double halfPerimetr = (a + b + c) / 2;
        double area = Math.sqrt(halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c));

        System.out.println(area);
    }
}

