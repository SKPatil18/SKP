import cv2
face_cascade = cv2.CascadeClassifier('carr.xml')
img = cv2.imread("E:\\New folder\\sss.jpg")
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
faces = face_cascade.detectMultiScale(gray, 1.1, 5)
for(x,y,w,h) in faces:

    cv2.rectangle(img, (x, y), (x + w, y + h), (255, 255, 0), 2)
    #cv2.putText(img, 'Face', (x, y-2), cv2.FONT_HERSHEY_DUPLEX, 0.5, (0, 500,), 2)
cv2.imshow("skpatil", img)
cv2.waitKey()









