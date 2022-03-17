
public class Item {
	private String name;
	private  String itemType;
	private Weapon w;
	private Potion p;
	
	public Item(String nam, String type, int num1,int num2 ){ 
		//Num2 is only for potions that you want a speed buff on, 
		//if you are creating a weapon, set this parameter to 0
		//Num1 is then
		name=nam;
		if(type=="weapon") {
			w=new Weapon(num1);
			p=null;
			itemType=type;
		}
		else if(type=="potion") {
			p=new Potion(num1,num2);
			w=null;
			itemType=type;
		}else {
			System.out.println("Itemtype did not match weapon or potion");

		}
		
		
	}
	public String getItemType() {
		return itemType;
	}
  
}
