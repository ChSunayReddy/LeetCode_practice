n=input().upper()
dict1={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
pre_value=0
number=0
for i in n:
    value=dict1[i]
    if value>pre_value:
        number=number+value-2*pre_value
    else:
        number+=value
    pre_value=value
print(number)
