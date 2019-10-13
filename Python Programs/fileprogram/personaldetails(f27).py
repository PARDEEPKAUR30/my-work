#WAP to dispaly the use of default keyword and positional arguments
def personalDetails(name,age,height=3.5,weight=20):
    print('Name is: ',name)
    print('Age is: ',age)
    print('Height is: ',height)
    print('Weight is: ',weight,'kg')
n=input("Enter your name: ")
a=eval(input('Enter your age in integer number: '))
h=eval(input('Enter your height in feet: '))
w=eval(input('Enter your height in kg: '))
personalDetails(n,a,h,w)
personalDetails(n,a)
personalDetails(weight=50,name="Pardeep",age=24,)
     
    
