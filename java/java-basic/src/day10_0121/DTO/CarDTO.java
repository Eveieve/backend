package day10_0121.DTO;

public class CarDTO {

    // 데이터 보관하는 용도인 DTO 클래스의 멤버 변수들은 private 해준다.
    private String model; // null
    private int speed; // 0
    private boolean start; // false, new 하여 인스턴스와 되면 디폴트값이 false라는 의미. 데이터가 있어야 공간이 유지될 수 있으니까.
    private Tire tire; // 선언만 하면 힙에 생성되고 디폴트 값으로 채워진다.

    public CarDTO(){};

    public CarDTO(String model, Tire tire){
        this.model = model;
        this.tire = tire;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override // 객체에 대한 정보/설명을 보기 쉽게 나타내기 위해.
    // overrride 하지 않으면 읽을 수 없는 값이 나옴.
    public String toString() {
        return "CarDTO{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", start=" + start +
                ", tire=" + tire +
                '}';
    }
}
