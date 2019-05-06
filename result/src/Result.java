import com.bsuir.maslan.model.Matrix;
import com.bsuir.maslan.model.Vector;
public class Result {
    public static void main(String[] args) {
        try {
            new Result().start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
private void start() throws Exception {
Matrix m = new Matrix(new int[][]{{1, 2, 3}, {3, 2, 1}});

m.print();

}
}