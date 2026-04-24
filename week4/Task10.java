import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
class Result {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;
        for (int layer = 0; layer < layers; layer++) {
            List<Integer> elements = new ArrayList<>();
            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;
            for (int i = left; i <= right; i++)
                elements.add(matrix.get(top).get(i));
            for (int i = top + 1; i <= bottom - 1; i++)
                elements.add(matrix.get(i).get(right));
            for (int i = right; i >= left; i--)
                elements.add(matrix.get(bottom).get(i));
            for (int i = bottom - 1; i >= top + 1; i--)
                elements.add(matrix.get(i).get(left));
        int size = elements.size();
        int rotation = r % size;
        Collections.rotate(elements, -rotation);
        int index = 0;
        for (int i = left; i <= right; i++)
            matrix.get(top).set(i, elements.get(index++));
        for (int i = top + 1; i <= bottom - 1; i++)
            matrix.get(i).set(right, elements.get(index++));
        for (int i = right; i >= left; i--)
            matrix.get(bottom).set(i, elements.get(index++));
        for (int i = bottom - 1; i >= top + 1; i--)
            matrix.get(i).set(left, elements.get(index++));
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix.get(i).get(j) + " ");
        }
        System.out.println();
    }
}    
}
public class Task10 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int m = Integer.parseInt(firstMultipleInput[0]);           
            int r = Integer.parseInt(firstMultipleInput[2]);
            List<List<Integer>> matrix = new ArrayList<>();
            IntStream.range(0, m).forEach(i -> {
                try {
                    matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            Result.matrixRotation(matrix, r);
        }
    }
}