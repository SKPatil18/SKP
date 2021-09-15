def addition(a,b):
    print("result =",a+b)
def sub(a,b):
    print("result =",a-b)
def mul(a,b):
    print("result ",a*b)
def div(a,b):
    print("result =",a/b)

n1 = int(input("Enter a number:"))
n2 = int(input("Enter a number:"))
print(" + , - ,/, * ")
c = str(input("Choose an operator:"))
if(c=="+"):
    addition(n1,n2)
elif(c=="-"):
    sub(n1,n2)
elif(c=="/"):
    div(n1,n2)
else:
    mul(n1,n2)
