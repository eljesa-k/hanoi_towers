import java.util.Arrays;

public class HanoiSolverRecursive extends HanoiSolver{
    private int step_count = 0;
    public HanoiSolverRecursive(int n, int src, int dest, HanoiWritter h) {
        super(n, src, dest, h);
    }
    public void solve(){
        System.out.println("\nRecursive");
        System.out.println("0:initial  " + Arrays.toString(towers));
        hanoiRecursive(n, src, dest, towers);
    }
    public void hanoiRecursive(int n, int src, int dest, Tower[] towers){
        if(n == 1){
            move(src, dest, towers);
            return;
        }

        int auxiliary = 3 - src - dest;
        hanoiRecursive(n-1, src, auxiliary, towers);
        move(src, dest, towers);
        hanoiRecursive(n-1, auxiliary, dest, towers);
    }
    @Override
    protected void move(int src, int dest, Tower[] towers){
        System.out.print(++step_count + ": ");
        super.move(src, dest, towers);
    }
}
