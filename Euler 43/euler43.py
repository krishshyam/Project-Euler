# Enter your code here. Read input from STDIN. Print output to STDOUT

from itertools import permutations
n=int(raw_input())
primes=[2,3,5,7,11,13,17,19,23,29]
sum=0
for i in range(n,n+1):
    #print i
    lists = []
    for j in range(i,-1,-1):
        lists.append(str(j))
    temp=str(''.join(lists))
    mylist=permutations(temp)
    for item in mylist:
        #print item
        flag=False
        for j in range(1,i-1):
            abcd = int(item[j]+item[j+1]+item[j+2])
            #print str(abcd) + "--" + str(primes[j-1])
            if not((abcd % primes[j-1]) == 0):
                flag=True
                break
        if(not(flag)):
            myint=int(''.join(item))
            #print myint
            sum=sum+myint
print sum