#WAP for method overloading
class OprOverloadingDemo:
    def __init__(self,x):
        self.x=x
    def __add__(self,other):
        print('value of ob1=',self.x)
        print('value of ob2=',other.x)
        return self.x+other.x
ob1=OprOverloadingDemo(10)
ob2=OprOverloadingDemo(20)
ob3=ob1+ob2
print(ob3)
