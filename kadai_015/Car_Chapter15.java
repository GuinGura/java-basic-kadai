package kadai_015;

//クラス
public class Car_Chapter15 {
    //フィールド
    private int gear = 1; //1～5のギア
    private int speed = 10; //ギアチェンジ後の速度

    //コンストラクタ（初期化）
    public Car_Chapter15(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    //メソッド
    public void gearChange(int afterGear) {
        this.gear = afterGear;
        this.speed = switch (this.gear) {
            case 1 -> this.speed = 10;
            case 2 -> this.speed = 20;
            case 3 -> this.speed = 30;
            case 4 -> this.speed = 40;
            case 5 -> this.speed = 50;
            default -> this.speed = 10;
        };
    }

    public void run() {
        System.out.println("ギア1から" + this.gear + "に切り替えられました");
        System.out.println("速度は時速" + this.speed + "kmです");

    }
}


