n = int(input())

def fib(n):
    a, b = 0, 1
    for i in range(n): a, b = b, a+b
    return a

for j in range(n):
    f = int(input())
    print(f'Fib({f}) = {fib(f)}')
