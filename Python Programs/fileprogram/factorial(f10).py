#Program to find the factorial of any given number.

def fact(no):
    if(no>0):
       f=no*fact(no-1)
       return f
    else:
        return 1
n=int(input('Enter an Integer number to which you want to find the Factorial:'))
if(n!=0):
    f=fact(n)
print('Factorial of given number \'',n,'\' is: ',f)
    
    


        
        
    
    
    
