package challenges.CodeWars;

public class CalculateAverage {
    public static double find_average(int[] array){
        double total = 0;

        for(int i=0; i<array.length; i++){
            total = total + array[i];
        }


        double average = total / array.length;
        return average;
    }
}
