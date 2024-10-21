package CS220.week8.inheritance_ex1;

public class GenericItem {
		   private String itemName;
		   private int itemQuantity;

		   public void setName(String newName) {
		      itemName = newName;
		   }

		   public void setQuantity(int newQty) {
		      itemQuantity = newQty;
		   }
		   
		   public void printItem() {
		      System.out.println(itemName + " " + itemQuantity);
		   }

		   public String getItemName() {
			   return itemName;
		   }
		   public int getItemQuantity() {
			   return itemQuantity;
		   }

}
