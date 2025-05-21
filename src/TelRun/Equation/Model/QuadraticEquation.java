package TelRun.Equation.Model;

//aX^2+bX+c=0
public class QuadraticEquation {
    private  double a;
    private  double b;
    private  double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        System.out.println(a + "X^2+" + b + "X" + c + "=0\n");
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public int getNumberOfRoots() {
        double d = delta();
        if (d > 0) {
            return 2;
        } else if (d == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public double[] solve() {
        double d = delta();
        System.out.println("Delta = " + d);
        double[] result;
        if (d > 0) {
            result = new double[2];
            result[0] = (-b + Math.sqrt(d)) / (2 * a);
            result[1] = (-b - Math.sqrt(d)) / (2 * a);
        } else {
            if (d == 0) {
                result = new double[1];
                result[0] = -b / (2 * a);
            } else {
                result = new double[0];
            }
        }
        return result;
    }



    public double getC() {
        return c;
    }
    public double getB() {
        return b;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
}
