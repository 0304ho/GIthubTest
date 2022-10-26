
interface Starcraft{
	public void attack();
	
}


//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft{
	public void attack() {
		System.out.println("질럿의 공격");
	}
}

public class AnonymousMain {
	public static void main(String[] args) {
		
		
	}
}
