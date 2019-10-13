#super keyword with constructor
class Operation:
    a=0
    b=0
    def __init__(self):
        self.a,self.b=int(input('Enter positive integer value for a and b:')),int(input())
class RelationalOper(Operation):
    v1=0
    v2=0
    def __init__(self):
        super().__init__()
    def perform(self):
        if self.a>self.b:
            print(self.a,' is greter than ',self.b)
        elif self.a<self.b:
            print(self.b,' is greter than ',self.a)
        else:
            print(self.a,' is equal to ',self.b)       
rel=RelationalOper()
rel.perform()

    
    
