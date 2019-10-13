#WAP for method overloading with keyword arguments
class OprOverloadingDemo:
    def mult(self,*arg):
        return arg
ob1=OprOverloadingDemo()
print(ob1.mult())
print(ob1.mult(10))
print(ob1.mult(10,20))
print(ob1.mult(10,20,30))


