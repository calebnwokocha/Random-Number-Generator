public class Test {
    public static void main(String[] args) {
        // NOTE: Some input values, for example seed = 7, min = 9, max = 11,
        // don't have a solution for random number with the range(min, max).
        RandomNumGen randomNumGen = new RandomNumGen(9, 9, 11);
        System.out.println("\nRandom number within range is " + randomNumGen.getNum());
    }
}
