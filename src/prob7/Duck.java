package prob7;

public class Duck extends Bird {
	public Duck(){
		
	}
	public void fly(){
		System.out.println("오리("+getName()+ ")은 날지 않습니다.");
	}
	public void sing(){
		System.out.println("오리("+getName()+")가 소리내어 웁니다.");
	}
	public String toString() {
		return "오리의 이름은" + getName() +" 입니다.";
	}
	
}
