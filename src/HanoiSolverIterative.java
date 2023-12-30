import java.util.Arrays;

public class HanoiSolverIterative extends HanoiSolver{
    public HanoiSolverIterative(int n, int src, int dest, HanoiWritter h) {
        super(n, src, dest, h);
    }
    public void solve() {
        System.out.println("Iterative");
        System.out.println("0:initial  " + Arrays.toString(towers));
        hanoiIterative(n, src, dest, towers);
    }
    public void hanoiIterative(int n, int src, int dest, Tower[] towers){
        int nr_moves = (int)Math.pow(2, n) - 1;
        if(n % 2 == 0) dest = 3 - src - dest;
        int auxiliary = 3 - src - dest;

        for (int i = 1; i <= nr_moves; i++) {
            System.out.print(i + ": "); // Step count
            if(i % 3 == 1)
                checkMove(src, dest, towers);
            else if(i % 3 == 2)
                checkMove(src, auxiliary, towers);
            else
                checkMove(auxiliary, dest, towers);
        }
    }
    private void checkMove(int src, int dest, Tower[] towers){
        if(towers[dest].isEmpty() || !towers[src].isEmpty() && towers[src].peek() < towers[dest].peek())
            move(src, dest, towers);
        else
            move(dest, src, towers);
    }
}
