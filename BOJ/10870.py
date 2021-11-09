n = int(input()) # n을받고

def fib(n): #피보나치 함수
    if n <= 1: #base case
        return n
    return fib(n-1) + fib(n-2) # n = n-1+n+2 라고 문제에서 나와있죠,,

print(fib(n))
