def marks():
    f=open("student marks.txt","r")
    d=f.readline()
    print(d)
    for i in range(1,6):
        sum=0
        m1,m2,m3=[eval(x)for x in (f.readline().split())]
        sum=m1+m2+m3
        print('Sum of total marks of Student',i," in three different subject is: ",  sum)
marks()
