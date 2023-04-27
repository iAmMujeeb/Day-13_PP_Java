package max;

public class MaxGen<M extends Comparable>  {
    public  M testMaximum(M value1, M value2, M value3){
        M maxValue = value1;
        if (value2.compareTo(maxValue)>0)
            maxValue = value2;
        if (value3.compareTo(value2)>0)
            maxValue = value3;
        System.out.println("Maximum Value is "+maxValue);
        return maxValue;
    }
}
