package ch04Class;
/**
 * @author: wuke 
 * @date  : 2017年2月27日 上午8:50:40
 * Title  : ObjectClone
 * Description : 
 */
public class ObjectClone {
	private String name;
	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ObjectClone(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectClone aObjectClone = new ObjectClone("Sam", 5);
		ObjectClone bObjectClone = new ObjectClone("Sim", 6);
		
		bObjectClone = aObjectClone;
		
		bObjectClone.setSize(11);
		
		System.out.println(aObjectClone.toString() + "    " +bObjectClone.toString());
		
		bObjectClone = (ObjectClone) aObjectClone.clone();
		
		//System.out.println(aObjectClone.toString() + "    " +bObjectClone.toString());
	}

}
