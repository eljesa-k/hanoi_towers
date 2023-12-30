import java.util.Arrays;

public abstract class HanoiSolver {
    protected int n, src, dest;
    private final HanoiWritter writer;
    protected final Tower[] towers = {
            new Tower(),
            new Tower(),
            new Tower()
    };
    public HanoiSolver(int n, int src, int dest, HanoiWritter h) {
        this.n = n;
        this.src = src;
        this.dest = dest;
        this.writer = h;

        for (int i = n; i > 0; i--) {
            towers[src].push(i);
        }
        repaint();
    }
    public abstract void solve();
    protected void move(int src, int dest, Tower[] towers) {
        try{Thread.sleep(1000);}
        catch (InterruptedException ignored){}

        towers[dest].push(towers[src].pop());
        repaint();

        System.out.print(src + " -> " + dest);
        System.out.println("  " + Arrays.toString(towers));
    }
    private void repaint(){
        writer.redraw(new int[][] {towers[0].getArray(), towers[1].getArray(), towers[2].getArray()});
    }
}
