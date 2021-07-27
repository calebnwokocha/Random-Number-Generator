public class RandomNumGen {
    private int seed;
    private int min;
    private int max;

    public RandomNumGen(int seed, int min, int max) {
        this.seed = seed;
        this.min = min;
        this.max = max;
    }

    public int getNum() {
        final int MODULUS = 53;
        final int MULTIPLIER = 24;
        final int INCREMENT = 65;
        int generatedNum[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int contraintedNum = 0;

        while (true) {
            for (int i = 0; i < generatedNum.length; i++) {
                if (generatedNum[i] >= min && generatedNum[i] <= max) {
                    contraintedNum = generatedNum[i];
                    return contraintedNum;
                } else {
                    for(int j = 0; j <= 9; j++) {
                        seed = ((MULTIPLIER * seed) + INCREMENT) % MODULUS;
                        System.out.print("New seed is " + seed + "\n");
                        generatedNum[j] = seed;
                    }
                }
            }
        }
    }
}
