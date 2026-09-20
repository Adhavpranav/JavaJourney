package ExceptionHandling;

class Player{
    private String playerName;
    private Item[] inventory;
    private int itemCount=0;
    private static final int INVENTORY_SIZE = 5;

    Player(String playerName){
        this.playerName=playerName;
        this.inventory = new Item[INVENTORY_SIZE];
    }

    protected void displayInventory() throws InventoryEmptyException{
        if(itemCount==0){
            throw  new InventoryEmptyException("Inventory Empty");
        }
        System.out.println("Inventory of player : "+playerName);
        for(Item item:inventory){
            if(item==null){
                break;
            }
           item.displayItem();
        }
    }

    protected  void addItem(Item item) throws InventoryFullException,InvalidItemException{
        if(item==null){
            throw  new InvalidItemException("Invalid Item");
        }
        if(itemCount==INVENTORY_SIZE){
            throw  new InventoryFullException("Inventory is full");
        }
        inventory[itemCount++]=item;
        System.out.println("Item added");
    }

    protected void useItem(String itemName) throws InventoryEmptyException,ItemNotFoundException{
        if(itemCount==0){
            throw new InventoryEmptyException("Inventory is empty");
        }
        for(Item item:inventory){
            if(item==null){
                break;
            }
            if(item.getItemName().equals(itemName)){
                System.out.println(item.getItemName()+" Is used");
                return;
            }
        }
        throw new ItemNotFoundException("Item not found");
    }

    protected void searchItem(String itemName) throws InventoryEmptyException,ItemNotFoundException{
        if(itemCount==0){
            throw new InventoryEmptyException("Inventory is empty");
        }
        for(Item item:inventory){
            if(item==null){
                break;
            }
            if(item.getItemName().equals(itemName)){
                System.out.println(item.getItemName()+" Is in inventory");
                return;
            }
        }
        throw new  ItemNotFoundException("Item not found");
    }

    protected void removeItem(Item item) throws InventoryEmptyException, ItemNotFoundException,InvalidItemException {

        if (itemCount == 0) {
            throw new InventoryEmptyException("Inventory is empty");
        }
        if(item==null){
            throw  new InvalidItemException("Invalid Item");
        }

        for (int i = 0; i < itemCount; i++) {
            if (inventory[i].getItemName().equals(item.getItemName())) {
                for (int j = i; j < itemCount - 1; j++) {
                    inventory[j] = inventory[j + 1];
                }

                inventory[itemCount - 1] = null;
                itemCount--;

                System.out.println(item.getItemName() + " removed");
                return;
            }
        }
        throw new ItemNotFoundException("Item not found");
    }

}

class Item{
    private  String itemName;
    private String itemType;
    private int quantity;

    Item(String itemName, String itemType, int quantity){
        this.itemName=itemName;
        this.itemType=itemType;
        this.quantity=quantity;
    }

    protected String getItemName(){
        return this.itemName;
    }
    protected String getItemType(){
        return  this.itemType;
    }
    protected  int getQuantity(){
        return  this.quantity;
    }
    protected void setQuantity(int quantity){
        this.quantity=quantity;
    }
    protected void displayItem(){
        System.out.println("Item Name: "+this.itemName);
        System.out.println("Item Type: "+this.itemType);
        System.out.println("Quantity: "+this.quantity);
    }
}

class InvalidItemException extends  Exception{
    InvalidItemException(String message){
        super(message);
    }
}

class ItemNotFoundException extends   Exception{
    ItemNotFoundException(String message){
        super(message);
    }
}

class InventoryEmptyException extends Exception {
    InventoryEmptyException(String message) {
        super(message);
    }
}

class InventoryFullException extends   Exception{
    InventoryFullException(String message){
        super(message);
    }
}

public class GameInventoryExceptionDemo {
    public static void main(String[] args) {
        Player player=new Player("Pranav");
        Item sword=new Item("Sword","Weapon",1);
        Item potion=new Item("Potion","Consumable",2);
        try{
            player.addItem(sword);
            player.addItem(potion);
            player.displayInventory();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
