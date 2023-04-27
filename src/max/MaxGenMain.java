package max;

public class MaxGenMain {
    public static void main(String[] args) {
        MaxGen maxGen = new MaxGen();
        maxGen.testMaximum(10,20,30);
        maxGen.testMaximum(10.5F,20.5F,30.5F);
        maxGen.testMaximum("Apple", "Peach", "Banana");
    }
}
