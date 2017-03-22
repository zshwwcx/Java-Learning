package pac1;

public class Parcel1 {
	class Contents{
		private int i=11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label=whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	public void ship(String dst){
		Contents c=new Contents();
		Destination d=new Destination(dst);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel1 p=new Parcel1();
		p.ship("Tasmania");
	}

}
