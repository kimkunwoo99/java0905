package chp11.ex11_1_2_3;

public class IPhone implements Phone,Alarm,Message{

    @Override
    public void playMusic(String MusicTitle) {
        System.out.println(MusicTitle + "음악을 " +PRODUCT_NAME +" Music으로 재생한다.");
    }

    @Override
    public void beep() {
        System.out.println("beep음이 삐삐삐삐 발생한다.");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content + "메시지를 전송한다.");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content + "메시지를 받는다.");
    }

    @Override
    public void callPhone(String phoneNumber) {
        System.out.println(phoneNumber + "로 전화를 건다.");
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println(phoneNumber + "의 전화를 받는다.");
    }

    public void sendAirdrop(String content){
        System.out.println("에어드롭으로" + content + "를(을) 보낸다.");
    }
}
