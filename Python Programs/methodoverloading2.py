#WAP for method overloading
class OprOverloadingDemo:
    def mult(self,a,b):
        result=a*b
        return result
    def mult(self,a,b,c):
        result=a*b*c
        return result
ob1=OprOverloadingDemo()
r=ob1.mult(10,20,30)
print(r)
#r1=ob1.mult(10,20)
#print(r1)

