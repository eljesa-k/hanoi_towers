import java.util.ListIterator;
import java.util.Stack;

public class Tower extends Stack<Integer> {
    public int[] getArray(){
        int[] res = new int[this.size()];
        for (int i = this.size() - 1; i >= 0; i--)
            res[i] = this.get(i);
        return res;
    }
}
