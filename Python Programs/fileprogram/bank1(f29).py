#bank facilities

class Account:
    name=''
    age=''
    date_o_b=''
    phone=''
    balance=0.0
    def __init__(self):
        self.takeInput()     
    def takeInput(self):
        l=True
        while(l):
            self.name=input('Enter your name:')
            for i in range(len(self.name)):                          
                if self.name[i].isalpha()==True or self.name[i].isspace()==True:
                    l=False
                else:
                    print('You can enter name only in alphabets.Please try again')
                    l=True
                    break;
        l=True
        while(l):
            self.age=input('Enter your age:')
            if self.age.isdigit()==True and len(self.age)<=2:
                l=False
            else:
                print('You can enter age only between 0-99 years.Please try again')
                l=True
        l=True
        while(l):
             day=int(input('Enter your Date of Birth:Enter Day:'))
             if day<=31 and day>0:
                 l=False
             else:
                 print('You can enter birth day only between 01-31.Please try again')
                 l=True
        string=str(day)
        string=string+'/'
        l=True
        while(l):
             month=int(input('Enter month:'))
             if month<=12 and month>0:
                 l=False
             else:
                 print('You can enter birth month only between 01-12.Please try again')
                 l=True
        string=string+str(month)
        string=string+'/'
        l=True
        while(l):
             year=int(input('Enter year'))
             if year>1900 and year<2020:
                 l=False
             else:
                 print('You can enter birth year only between 1900-2019.Please try again')
                 l=True
        string=string+str(year)
        self.date_o_b=string
        #print(self.date_o_b)
        l=True
        while(l):
            self.phone=input("Enter your contact number:")
            if self.phone.isdigit()==True and len(self.phone)==10:
                l=False
            else:
                print('You can enter 10 digit contact number.Please try again')
                l=True
        l=True
        while(l):
            self.balance=eval(input('Enter the balance amount that you want to deposit in your account:'))    
            if self.balance>0:
                l=False
            else:
                print('You should enter the amount greater than 0')
                l=True
            
    def checkbalance(self):
        print('Your Balance is:',self.balance)
    def withdraw(self):
        loopc=True
        while(loopc):
            loopc=False
            money=int(input('Enter the amount you want to withdraw:'))
            if self.balance>=money and money>0:
                self.balance=self.balance-money
                self.checkbalance();
            else:
                loopc=True
                if self.balance<money:
                    print('Your balance is lower than the amount entered')
                    self.checkbalance()
                else:
                    print('You should enter the money greater than 0')
                
                 
    def deposite(self):
        loopc=True
        while(loopc):
            loopc=False
            money=eval(input('Enter the amount you want to deposite:'))
            if money>0:
                self.balance=self.balance+money
                self.checkbalance();
            else:
                print('You should enter the money greater than 0')
                loopc=True
    def facilities(self):
        loopc=True
        while(loopc):
            print('What you want to do:')
            print('1.Enter\'1\'for Check Balance')
            print('2.Enter\'2\'for Withdraw Money')
            print('3.Enter\'3\'for Deposite Money')
            print('4.Enter\'4\'for Exit')
            option=input('Please enter the option:')
            if option=='1':
                self.checkbalance();
            elif option=='2':    
                self.withdraw();
            elif option=='3':
                self.deposite();
            elif option=='4':
                loopc=False
                print('Thank You!')
            else:
                print('You enter the wrong option, Please try again')
                loopc=True
        
        
                     
                     
account=Account();
account.facilities();
                     
                     
                     
                     
                     
                     
                     
                     
        
    
    
