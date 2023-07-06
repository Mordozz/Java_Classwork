import org.json.JSONObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        Task1 task1 = new Task1();
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        task1.constructSqlWhere(json);

        // Задание 2
        Task2 task2 = new Task2();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        task2.bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static class Task1 {
        void constructSqlWhere(String jsonString) {
            StringBuilder sql = new StringBuilder("select * from students where ");
            JSONObject jsonObject = new JSONObject(jsonString);
            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                String value = jsonObject.getString(key);
                if (!value.equals("null")) {
                    sql.append(key).append("='").append(value).append("'");
                    if (keys.hasNext()) {
                        sql.append(" and ");
                    }
                }
            }
            System.out.println(sql.toString());
        }
    }

    static class Task2 {
        void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                logToFile(arr, i);
            }
        }

        void logToFile(int[] arr, int iteration) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("log.txt", true));
                out.write("After iteration " + (iteration + 1) + ": " + Arrays.toString(arr) + "\n");
                out.close();
            } catch (IOException e) {
                System.out.println("An error occurred while writing to file: " + e.getMessage());
            }
        }
    }
}
