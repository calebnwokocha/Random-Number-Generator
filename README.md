This project make use of linear congruential generator (LCG) to generate random numbers.

LCG is an algorithm that yields a sequence of pseudo-randomized numbers calculated with a discontinuous piecewise linear equation. The method represents one of the oldest and best-known pseudorandom number generator algorithms. The theory behind them is relatively easy to understand, and they are easily implemented and fast, especially on computer hardware which can provide modular arithmetic by storage-bit truncation.

The generator is defined by recurrence relation:

X{n+1} = ((a * X{n}) + c) mod m

where X is the sequence of pseudorandom values, and

m, 0 < m  — the "modulus"
a, 0 < a < m — the "multiplier"
c, 0 <= c < m — the "increment"
X{0}, 0 <= X{0} < m — the "seed" or "start value"
 
Source: https://en.wikipedia.org/wiki/Linear_congruential_generator
