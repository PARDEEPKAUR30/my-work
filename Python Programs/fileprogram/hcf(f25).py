# WAP to find HCF
def hcf(n1,n2):
    s=0;
    factor=0;
    if n1>n2:
        s=n2
    else:
        s=n1
    for i in range(1,s+1):
        if n1%i==0 and n2%i==0:
            factor=i
    return factor
        
def takeInput():
    n,m=int(input('Enter the two positive integer number:')),int(input())
    result=hcf(n,m)
    print('Higest Common Factor of\'',n,'\' and \'',m,'\'is: ',result)
    
takeInput()       
        
    
