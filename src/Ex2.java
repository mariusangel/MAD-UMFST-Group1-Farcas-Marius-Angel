public class Ex2 {
    public static void main(String[] args) {
        
        int[] array = {5, 10, 15, 20, 25};

        //calculam suma
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        //calculam valoarea medie
        double average = (double) sum / array.length;

        System.out.println("Average value of array elements: " + average);
    }
}