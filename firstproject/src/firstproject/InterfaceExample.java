package firstproject;

interface TVRemote{
	public void SwitchOff();
	public void SwitchOn();
	public void ChangeChannel();
	public void IncreaseVolume();
	public void DecreaseVolume();
}

class SamsungTV implements TVRemote{

	@Override
	public void SwitchOff() {
		System.out.println("Switching off samsung tv");
	}

	@Override
	public void SwitchOn() {
		System.out.println("Switching on samsung tv");
	}

	@Override
	public void ChangeChannel() {
		System.out.println("Changing channel of samsung tv");
	}

	@Override
	public void IncreaseVolume() {
		System.out.println("Increasing volume of samsung tv");
	}

	@Override
	public void DecreaseVolume() {
		System.out.println("Decreasing volume of samsung tv");
	}
	
}

class SonyTV implements TVRemote{

	@Override
	public void SwitchOff() {
		System.out.println("Switching off sony tv");
	}

	@Override
	public void SwitchOn() {
		System.out.println("Switching on sony tv");
	}

	@Override
	public void ChangeChannel() {
		System.out.println("Changing channel of sony tv");
	}

	@Override
	public void IncreaseVolume() {
		System.out.println("Increasing volume of sony tv");
	}

	@Override
	public void DecreaseVolume() {
		System.out.println("Decreasing volume of sony tv");
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungTV sm=new SamsungTV();
		sm.SwitchOn();
		sm.ChangeChannel();
		sm.DecreaseVolume();
		sm.IncreaseVolume();
		sm.SwitchOff();
		System.out.println();
		SonyTV so=new SonyTV();
		so.SwitchOn();
		so.ChangeChannel();
		so.DecreaseVolume();
		so.IncreaseVolume();
		so.SwitchOff();
	}

}
