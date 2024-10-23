package s.exam06;

// ExPlayer 인터페이스를 구현하는 DVDPlayer 클래스 정의
public class DVDPlayer implements ExPlayer {
    // DVD 재생 시작 메서드
    public void play() {
        System.out.println("DVD 재생 시작!");
    }

    // DVD 재생 종료 메서드
    public void stop() {
        System.out.println("DVD 재생 종료");
    }

    // DVD 느린 재생 시작 메서드
    public void slow() {
        System.out.println("DVD 느린 재생 시작!");
    }
}
