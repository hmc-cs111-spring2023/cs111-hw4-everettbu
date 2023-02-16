def collatz(x: Int): Int = 
  if (x % 2 == 0) x / 2
  else 3 * x + 1


def collatzCount(n: Int): Int = 
  if n == 0 then 0 
  else if n == 1 then 0
  else collatzCount(collatz(n)) + 1