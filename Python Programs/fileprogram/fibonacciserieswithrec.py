#fibonacci series with recursive function
n=int(input('Enter an Integer value for how many Fibonacci series numbers you want to print:'))
def fibo(f,s,i):
    if i<n:
        sum=f+s
        print(' ',sum,end='')
        f=s
        s=sum
        i=i+1
        fibo(f,s,i)

if n>2:
    i=2
    f=0
    s=1
    print(f,'',s,end='')
    fibo(f,s,i)
   

    
