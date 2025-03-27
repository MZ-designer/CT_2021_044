package Q_01;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Q01 {
    public static void main(String[] args) {
        final double pie=(3.14);
        //a)
        double A=2,B=3,C=4,X=5,Y=6,R=7;
        double sqrta =Math.sqrt(B*B+4*A*C);
        System.out.println(sqrta);

        //b)
        double sqrtb=Math.sqrt(X+4*(Y*Y*Y));
        System.out.println(sqrtb);

        //c)
        double cbrt=Math.cbrt(X*Y);
        System.out.println(cbrt);

        //d)
        double area=pie*R*R;
        System.out.println(area);

    }
}
