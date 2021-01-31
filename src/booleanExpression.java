public class booleanExpression {
    public static boolean booleanExpressions(boolean a, boolean b, boolean c, boolean d) {

        int a1 = a ? 1 : 0;
        int b2 = b ? 1 : 0;
        int c2 = c ? 1 : 0;
        int d2 = d ? 1 : 0;

        if ((a1 + b2 + c2 + d2) == 2){
            System.out.println("True");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }
    public static void main(String[] args) {
        booleanExpression.booleanExpressions(true, true, true, false);
    }
}

