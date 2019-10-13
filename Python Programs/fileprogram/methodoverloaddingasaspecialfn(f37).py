# method overloading as a special function
def add(*a):
     #print(*a)
     result=0
     for i in a:
          #print(i)
          result=result+i
     print('addition is:', result)
def addmore(name='Pardeep',**a):
        print('name=',name,end="")
        #print(a)
        for i in a:
          print(', ',i,'=',a[i],end="")
        print()       
add()
add(10)
add(10,20)
add(10,15,20)
add(5,10,15,20)
addmore(name='Deep',Age=24)
addmore(Age=20,markes=534)

