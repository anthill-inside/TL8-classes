package TelRun.Equation.Controller;

import TelRun.Equation.Model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
    QuadraticEquation qe = new QuadraticEquation(1,4,3);
    qe.display();
        System.out.println("Delta = "+ qe.delta());
        System.out.println("Number of roots = "+ qe.getNumberOfRoots());
        double[] roots = qe.solve();
        if(roots.length==0) System.out.println("No rational roots");
        else System.out.println("Roots:");
        for(double r:roots){
            System.out.println(r);
        }
    return;
    }
}
