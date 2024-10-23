package s.exam05;

import s.exam01.Wearable;
import s.exam02.Skinnable;

public class HeadMountedDisplay implements Wearable, Skinnable {
    private int skin;

    public void putOn(){
        System.out.println("디스플레이를 착용했습니다.");
    }

    public void putOff() {
        System.out.println("디스플레이를 벗었습니다");
    }
    public void changeSkin(int skin){
        this.skin = skin;
    }
    public void putSkin(){
        switch (skin){
            case BLACK:
                System.out.println("BLACK DISPLAY"); break;
            case RED:
                System.out.println("RED DISPLAY"); break;
            case GREEN:
                System.out.println("GREEN DISPLAY"); break;
            case BLUE:
                System.out.println("BLUE DISPLAY"); break;
            case YELLOW:
                System.out.println("YELLOW DISPLAY"); break;
        }
    }
}
