people = int(input())
m = list(map(int, input().split()))

m.sort()
time = 0
total = []

for i in m:
    time += i
    total.append(time)

print(sum(total)) 
