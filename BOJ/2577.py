A = int(input())
B = int(input())
C = int(input())

num = A * B * C
l = list(map(int, str(num)))

for i in range(10):
    print(l.count(i))
