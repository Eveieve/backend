package day14_0203.Homework.Num4;

public abstract class Wheeler {
 protected int velocity;
 protected String carName;
 protected int wheelNumber;

    public Wheeler(String carName, int velocity) {
    // 이 생성자 없으면 Truck 생성자에서 super() 못씀
        this.carName = carName;
        this.velocity = velocity; // velocity 파라미터 주지 않으면 Truck에서 Truck(String carName, int velocity) 쓸 수 없음.
    }

    public Wheeler(String carName, int velocity, int wheelNumber) {
        // 이 생성자 없으면 Truck 생성자에서 super() 못씀
        this.carName = carName;
        this.velocity = velocity; // velocity 파라미터 주지 않으면 Truck에서 Truck(String carName, int velocity) 쓸 수 없음.
        this.wheelNumber = wheelNumber;
    }

    abstract public void speedUp(int speed);

 abstract public void speedDown(int speed);

 public void stop(){
	 velocity = 0;
	 System.out.println("�������·� �ӵ��� 0���� �ʱ�ȭ�մϴ�.");
 }
}
