import cv2
cap = cv2.VideoCapture('carvideo.mp4')
car_cascade = cv2.CascadeClassifier("carr.xml")
while True:
    ret, frames = cap.read()
    gray = cv2.cvtColor(frames,cv2.COLOR_BGR2GRAY)
    cars = car_cascade.detectMultiScale(gray, 1.7, 1)
    for(x, y, w, h) in cars:
       cv2.rectangle(frames,(x,y),(x+w,y+h),(200),2)
    cv2.imshow("car_detection", frames)
    if cv2.waitKey(33)==27:
        break
cv2.destroyAllWindows()


