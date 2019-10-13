# program to print fibonacci series till n values.

n=int(input('Enter an Integer value for till you want to print Fibonacci series:'))
if n>2:
    f=0
    s=1

    print(f,' ',s,end='')
    for i in range(1,n):
         sum=f+s
         print(' ',sum,end='')
         f=s
         s=sum
        
    

    
