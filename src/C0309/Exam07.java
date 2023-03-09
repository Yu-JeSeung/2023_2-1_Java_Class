package C0309;

public class Exam07 {
    public static void main(String[] args) {
        Car 내차 = new Car("빨강",0);
        Car 제니차 = new Car("파랑",0);
        Car 은우차 = new Car("초록",0);
        // 객체 2개 더 추가
        Car front_car = new Car("블랙",0);
        Car back_car = new Car("화이트",0);

        내차.upSpeed(50);
        System.out.println("내차의 자동차 색상은 "+내차.getColor()+" 속도는 "+내차.getSpeed());
        제니차.upSpeed(100);
        System.out.println("제니차의 자동차 색상은 "+제니차.getColor()+" 속도는 "+제니차.getSpeed());
        은우차.upSpeed(250);
        System.out.println("은우차의 자동차 색상은 "+은우차.getColor()+" 속도는 "+은우차.getSpeed());
        front_car.upSpeed(100);
        System.out.println("프론트엔드의 자동차 색상은 "+front_car.getColor()+" 속도는 "+front_car.getSpeed());
        back_car.upSpeed(150);
        System.out.println("백엔드의 자동차 색상은 "+back_car.getColor()+" 속도는 "+back_car.getSpeed());

        System.out.println("생성된 치의 대수 "+Car.carCount);
        System.out.println("차의 최고 속도 "+Car.MAXSPEED);

        System.out.println("파이값은 "+Math.PI);
        System.out.println("3의 5제곱 "+Math.pow(3,5));
    }
}
