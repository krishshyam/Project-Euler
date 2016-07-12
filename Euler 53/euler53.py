# Enter your code here. Read input from STDIN. Print output to STDOUT
from math import factorial

def ncr(n, r):
    return list[n]/(list[r] * list[n-r])

list=[1]
temp=1
for i in range(1, 1001):
    temp=temp*i
    list.append(temp)

n, k = map(int, raw_input().split(" "))
count = 0
for i in range(n+1):
    for j in range(i+1):
        if ncr(i, j) > k:
            count = count + 1
print count