# WAP for class membership test
class A:
    print('In class A')
class B:
    print('In class B')
class C:
    print('In class C')
ob1=A()
ob2=B()
ob3=C()
print(isinstance(ob1,A))
print(isinstance(ob1,B))
print(isinstance(ob3,C))
      
    
