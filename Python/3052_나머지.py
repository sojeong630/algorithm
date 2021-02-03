l = []
for i in range(0,10):
    a = int(input()) % 42
    if a not in l:
        l.append(a)
print(len(l))