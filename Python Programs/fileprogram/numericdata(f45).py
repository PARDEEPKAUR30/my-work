def fileWrite():
    ob=open("Numeric Data.txt","w")
    ob.write("Numeric data \n")
    for i in range(1,30):
        i=str(i)
        ob.write(i+'\n')
    ob.close()
def fileRead():
    ob=open("Numeric Data.txt","r")
    i=ob.read()
    print(i,end='')
    
fileWrite()
fileRead()
    
        
