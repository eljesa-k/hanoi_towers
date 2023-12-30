import java.util.Arrays;

public abstract class HanoiSolver {
    protected int n, src, dest;
    protected final Tower[] towers = {
            new Tower(),
            new Tower(),
            new Tower()
    };
    public HanoiSolver(int n, int src, int dest) {
        this.n = n;
        this.src = src;
        this.dest = dest;

        for (int i = n; i > 0; i--) {
            towers[src].push(i);
        }
    }
    public abstract void solve();
    protected void move(int src, int dest, Tower[] towers){
        towers[dest].push(towers[src].pop());
        System.out.print(src + " -> " + dest);
        System.out.println("  " + Arrays.toString(towers));
    }
}
