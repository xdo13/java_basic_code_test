package s.exam06;

// DVDPlayerTester 클래스 정의
public class DVDPlayerTester {
    public static void main(String[] args) {
        // DVDPlayer 객체 생성
        DVDPlayer a = new DVDPlayer();

        // Players 타입으로 DVDPlayer 객체 생성
        Players b = new DVDPlayer();

        // ExPlayer 타입으로 DVDPlayer 객체 생성
        ExPlayer c = new DVDPlayer();

        // DVDPlayer형 변수 a의 메서드 호출
        System.out.println("DVDPlayer형 변수 a");
        a.play();
        a.stop();
        a.slow();

        // Player형 변수 b의 메서드 호출
        System.out.println("Player형 변수 b");
        b.play();
        b.stop();

        // ExPlayer형 변수 c의 메서드 호출
        System.out.println("ExPlayer형 변수 c");
        c.play();
        c.stop();
        c.slow();
    }
}
