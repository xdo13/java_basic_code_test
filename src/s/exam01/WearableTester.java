package s.exam01;

// WearableTester 클래스 정의
class WearableTester {
    public static void main(String[] args) {
        // Wearable 타입의 객체를 저장할 배열 생성
        Wearable[] a = new Wearable[2];

        // 배열의 첫 번째 요소에 HeadPhone 객체 할당
        a[0] = new HeadPhone();
        // 배열의 두 번째 요소에 WearableComputer 객체 할당
        a[1] = new WearableComputer();

        // 배열의 각 Wearable 객체에 대해 putOn() 메서드 호출
        for (int i = 0; i < a.length; i++)
            a[i].putOn();

        // 배열의 각 Wearable 객체에 대해 putOff() 메서드 호출
        for (int i = 0; i < a.length; i++)
            a[i].putOff();
    }
}
