import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HanoiWritter writer = new HanoiWritter();

        HanoiSolver s1 = new HanoiSolverIterative(3, 0, 2, writer);
        s1.solve();

//        HanoiSolver s2 = new HanoiSolverRecursive(3, 0, 2, writer);
//        s2.solve();
    }
}