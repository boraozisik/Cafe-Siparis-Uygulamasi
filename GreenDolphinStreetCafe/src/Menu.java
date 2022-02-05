
public class Menu {
	 private String menuName;
	    private int menuNumber;
	    private String menuContent;
	    private int menuPrice;

	    public Menu(String menuName, int menuNumber, String menuContent, int menuPrice) {
	        this.menuName = menuName;
	        this.menuNumber = menuNumber;
	        this.menuContent = menuContent;
	        this.menuPrice = menuPrice;
	    }

	    public String getMenuPriceWithTL() {
	        String returned = this.menuPrice + " TL";
	        return returned;
	    }

	    public int getMenuPrice() {
	        return menuPrice;
	    }

	    public void setMenuPrice(int menuPrice) {
	        this.menuPrice = menuPrice;
	    }

	    public String getMenuName() {
	        return menuName;
	    }

	    public void setMenuName(String menuName) {
	        this.menuName = menuName;
	    }

	    public int getMenuNumber() {
	        return menuNumber;
	    }

	    public void setMenuNumber(int menuNumber) {
	        this.menuNumber = menuNumber;
	    }

	    public String getMenuContent() {
	        return menuContent;
	    }

	    public void setMenuContent(String menuContent) {
	        this.menuContent = menuContent;
	    }

	    public void getMenuInfo(){
	        System.out.println("Menu Name: " +this.menuName);
	        System.out.println("Menu Number: " +this.menuNumber);
	        System.out.println("Menu Content: " +this.menuContent);
	        System.out.println("Menu Price: " +this.menuPrice);
	    }


}
