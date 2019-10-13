#Multilevel inheritance
class Color:
    c=''
    def takeInput(self):
        self.c=input('Enter name of your favourite color:')
class DarkColor(Color):
    d=''
    def userInput(self):
        self.d=input('Enter name of your favourite dark color:')
class DisplayColor(DarkColor):
    def myInput(self):
        if(self.c!=self.d):
            print(self.c,'is your favourite color.')
            print(self.d,'is your favourite dark color.')
        else:
             print(self.c,'is your favourite color.')
rc=DisplayColor()
rc.userInput()
rc.takeInput()
rc.myInput()
