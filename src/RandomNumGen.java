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
        int constraintedNum = 0;

        while (true) {
            for (int i = 0; i < generatedNum.length; i++) {

                // Min and Max Definition:
                // Given a set R of random numbers, R[1]...R[n], R[n] is
                // within min and max threshold iff min <= R[n] <= max.
                if (generatedNum[i] >= min && generatedNum[i] <= max) {

                    // Program Output Definition:
                    // The first discovered min <= R[n] <= max in R is the output.
                    constraintedNum = generatedNum[i];
                    return constraintedNum;
                } else {
                    for(int j = 0; j <= 9; j++) {

                        // X[n+1] = ((a * X[n]) + c) mod m
                        seed = ((MULTIPLIER * seed) + INCREMENT) % MODULUS;
                        System.out.print("New seed is " + seed + "\n");

                        // Store seed in the generatedNum array, R, to check
                        // for min <= R[n] <= max.
                        generatedNum[j] = seed;
                    }
                }
            }
        }
    }
}
