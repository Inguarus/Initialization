package testpackage;


public class Static {
    private static int ARRAY = 100;
    private static int[] arr = new int[ARRAY];


    static {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(arr[i] + ", ");
        }

        System.out.print("]");
    }

    public static void main(String[] args) {

    }

}

