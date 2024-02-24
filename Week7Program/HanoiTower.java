public class HanoiTower {
    public static void SH(n,A,B,C){
        if (n==1)
            S.O.P(A->B);
        else{
            SH(n-1,A,C,B);
            S.O.P(A->B);
            SH(n-1,C,B,A);
        }
    }
}
