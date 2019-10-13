#WAP to constructor with object as parameters

class Test:
    a=0
    b=0
    def __init__(self,x,y):
        self.a=x
        self.b=y
    def equals(self,obj):
        if(obj.a==self.a and obj.b==self.b):
            return True
        else:
            return False
o1=Test(10,20)
o2=Test(10,20)
o3=Test(12,10)
print('obj1==obj2',o1.equals(o2))
print('obj1==obj3',o1.equals(o3))
