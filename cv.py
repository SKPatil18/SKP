std_marks = [['name',['A','B','C','D','E']],
             ['ANKIT',[41,34,45,55,63]],
             ['ARVIND',[42,23,34,44,53]],
             ['LAKSHAY',[32,23,13,54,67]],
             ['GYAN',[23,82,23,63,34,]],
             ['PRANAV',[21,23,25,56,56]]
            ]
print(std_marks)
list=[]
for i in range(1,6):
    #print(std_marks[i][1][1])
    list.append(std_marks[i][1][1])
#print(list)
highest_marks=max(list)
#print(highest_marks)
for i in range(0,5):
    if highest_marks==list[i]:
        print(std_marks[i+1][0]+' Scored highest marks in B')


list1=[]
temp=0
for i in range(1,6):
    list1.append(std_marks[i][1][2])
#print(list1)
for i in range(len(list1)):
    temp=temp +list1[i]
    avg=temp/len(list1)
print('the Average marks scored in subject c is ' +str(avg))



list2=[]
avg2=0
def avg_fun(list2):
    temp1=0
    for i in range(len(list2)):
        temp1=temp1+list2[i]
        avg2=temp1/len(list2)
    return avg2
for i in range(1, 6):
    a=avg_fun(std_marks[i][1])
    list2.append(a)
print(list2)
max_perc=max(list2)
print(max_perc)
for i in range(0,5):
    if(max_perc==list2[i]):
        print(std_marks[i+1][0]+' scorred maximum percentage of marks')

std_top4_marks=[]


ankit_top4_score=std_marks[1][1]
ankit_top4_score.sort(reverse=True)
print(ankit_top4_score)

aravind_top4_score=std_marks[2][1]
aravind_top4_score.sort(reverse=True)
print(aravind_top4_score)

lakshay_top4_score=std_marks[3][1]
lakshay_top4_score.sort(reverse=True)
print(lakshay_top4_score)

gyan_top4_score=std_marks[4][1]
gyan_top4_score.sort(reverse=True)
print(gyan_top4_score)

pranav_top4_score=std_marks[5][1]
pranav_top4_score.sort(reverse=True)
print(pranav_top4_score)

print(std_marks[1][1])

for i in range(0,6):
    std_top4_marks[i]=std_marks[i+1][1]
print(std_top4_marks)


