
case = int(input())
res= {}
for i in range(0,case):
    n = int(input())
    res[i] =  int(n*(n-1)*(n-2)*(n-3)/24 + n*(n-1)/2 + 1)

for i in res:
    print(res[i])
