n=list(map(int,input().split()))
m=0
for i in n:
    m=(m*10)+i
m+=1
l=[]
while m>0:
    l.insert(0,m%10)
    m//=10
print(l)