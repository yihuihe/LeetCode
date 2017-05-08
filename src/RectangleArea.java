/**
 * Created by hyh on 2017/5/8.
 */
public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A) * (D-B);
        int area2 = (G-E) * (H-F);
        int repeatArea = 0;
        int left = Math.max(A,E);
        int right = Math.max(Math.min(C,G),left);
        int bottom = Math.max(B,F);
        int top  = Math.max(Math.min(D,H),bottom);
        repeatArea = (right - left) * (top - bottom);

        return area1 + area2 - repeatArea;
    }
    public static void main(String[] args){
        System.out.print(computeArea(-2,-2,2,2,-4,3,-3,4));

    }
}
