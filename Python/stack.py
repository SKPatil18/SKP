stack = []
length = int(input("Enter Stack length:"))
def push(a):
    if(len(stack)==length):
        print("Stack is Full")
    else:stack.append(a)

def pop():
    if(len(stack)==0):
        print("Stack is Empty")
    else:stack.pop(-1)

def display():
    if(len(stack)==0):
        print("Stack is Empty")
    else:
        for i in stack:
            print(i)
while True:
    print("1.append")
    print("2.pop")
    print("3.display")
    print("Choose one operation:")
    choice = int(input())

    if(choice==1):
        item = int(input("Enter element to insert:"))
        push(item)
    elif(choice==2):
        pop()
    elif(choice==3):
        display()
    else:print("Enter right choice")

