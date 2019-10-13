# WAP to create a calculator
class calculator:
    a=0;
    b=0;
    def takeInput(self):
        self.a=eval(input('Please enter the value for a='))
        self.b=eval(input('Please enter the value for b='))
        self.function()
    def __init__(self):
        self.takeInput()       
    def addition(self):
        add=self.a+self.b
        print('Addition of \'',self.a,'\' and \'',self.b,'\' is: ',add)
        return add
    def subtraction(self):
        sub=self.a-self.b
        print('Subtraction of\'',self.a,'\' and \'',self.b,'\'is: ',sub)
        return sub
    def multiplication(self):
        mult=self.a*self.b
        print('Multiplication of\'',self.a,'\' and \'',self.b,'\'is: ',mult)
        return mult
    def division(self):
        if self.b>0:
            div=self.a//self.b
            print('division of\'',self.a,'\' and \'',self.b,'\'is: ',div)
            return div
        else:
            print('You should enter the value for b variable more than 0 to do division')
            self.takeInput()
    def modulus(self):
        mod=self.a%self.b
        print('Modulus of\'',self.a,'\' and \'',self.b,'\'is: ',mod)
        return mod
    def function(self):
        loopc=True
        while(loopc):
            loopc=False
            print('What do want to do:')
            print('Enter\'1\'for Addition.')
            print('Enter\'2\'for Subtraction.')
            print('Enter\'3\'for Multiplication.')
            print('Enter\'4\'for Division.')
            print('Enter\'5\'for Modulus.')
            option=int(input('Please enter your option:'))
            if option==1:
                self.addition()
            elif option==2:
                self.subtraction()
            elif option==3:
                self.Mutiplication()
            elif option==4:
                self.division()
            elif option==5:
                self.modulus()
            else:
                print('You enterd the wrong input please try again.')
                loopc=True
            
        
c=calculator()        
        

        
