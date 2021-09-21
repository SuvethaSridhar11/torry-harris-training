public class AvgAndMid {
    public static void main(String[] args) {
        int sum = 0, avg = 0;
        float sum1=0;
        float avg1=0;
        int[] array = {2, 3, 4, 5, 6};
        float[] array1 = {2.5f, 3.5f, 4.5f, 5.5f, 6.5f};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            avg = sum / array.length;
        }
        System.out.println("average is " + avg);
        int mid1 = array.length/2;
        float mid2 = array1.length/2;
        System.out.println("mid is " +array[mid1]);
        System.out.println("mid is " +array1[(int) mid2]);
        for (int j = 0; j < array1.length; j++) {
            sum1 = sum1 + array1[j];
            avg1 = sum1 / array1.length;
        }
        System.out.println("average is " + avg1);
    }


}
