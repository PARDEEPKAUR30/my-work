# multiple inheritance
class University:
    def show(self):
        print('University is at higer level of educational system')
class School:
    def display(self):
        print('School is at lower level of educational system')
class Building(University,School):
    print('A building can be a School and university')
build=Building()
build.display()
build.show()
