import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HanoiSolver s1 = new HanoiSolverIterative(3, 0, 2);
        s1.solve();

        System.out.println();

        HanoiSolver s2 = new HanoiSolverRecursive(3, 0, 2);
        s2.solve();
    }
}