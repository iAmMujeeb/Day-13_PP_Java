package max;

public class MaxGenMain {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer num3 = 30;
        Integer maxInt = num1;
        Float num4 = 10.5F;
        Float num5 = 20.5F;
        Float num6 = 30.5F;
        Float maxFloat = num4;

        if (num2.compareTo(maxInt)>0)
            maxInt = num2;
        if (num3.compareTo(num2)>0)
            maxInt = num3;
        System.out.println("Maximum Integer Number = "+maxInt);

        if (num5.compareTo(maxFloat)>0)
            maxFloat = num5;
        if (num6.compareTo(num5)>0)
            maxFloat = num6;
        System.out.println("Maximum Float Number = "+maxFloat);
    }
}
