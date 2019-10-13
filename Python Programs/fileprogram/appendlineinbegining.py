def fileWrite():
    ob1=open("file.txt","w")
    ob1.write("Welcome to GNA University")
    ob1.close()

def fileRead():
    ob1=open("file.txt","r")
    d=ob1.read()
    print(d)
    
def fileAppend():
    fob=open("file.txt","a")
    fob.write("\nHello Students")
    fob.close()
appendData()
    
#fileWrite()
fileRead()
