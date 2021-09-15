acc_no = "12345678"
ifsc_code = "python123"
Acc_balance = 0.00000

while True:
    no = str(input("Enter your Account Number:"))
    if (no == acc_no):
        code = str(input("Enter IFSC code:"))
        if(code == ifsc_code):
             break
        else:print("IFSC code is Incorrect:")
    else:print("Account Number is Incorrect..")
print()
print()


print(".....Welcome to Python Banking.....")
while True:
    print("1.Deposit")
    print("2.withdraw")
    print("3.check Balance")
    choice = int(input("Choose one operation:"))
    print()

    if(choice == 1):
        amount = float(input("Enter Amount to Deposit"))
        Acc_balance = amount + Acc_balance
        print("your current balance is ",Acc_balance)

    elif(choice == 2):
        with_amou = float(input("Enter Amount to withdraw"))
        if(with_amou<=Acc_balance):
            Acc_balance = Acc_balance - with_amou
        print("Your current balance is :",Acc_balance)

    elif(choice == 3):
        print("Balance is :",Acc_balance)
    else:print("Enter correct choice")




