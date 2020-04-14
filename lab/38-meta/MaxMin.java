public class MaxMin{
    public static int max(int[] numbers) {
        int rtn = numbers[0];
        for (int i = 1;i < numbers.length; i++){
            if (numbers[i] > rtn) 
                rtn = numbers[i];
        }
        return rtn;
    }
}
