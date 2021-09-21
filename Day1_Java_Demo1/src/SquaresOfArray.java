public class SquaresOfArray {
    public static void main(String[] args) {
        int[]array = new int[5];
        int sq;
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        for(int i=0;i< array.length;i++)
        {
            sq = array[i]*array[i];
            System.out.println("square of is "+sq);
        }
    }
}
