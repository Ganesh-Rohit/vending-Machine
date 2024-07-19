package LowLevelDesign.DesignVendingMachine.VendingStates;

import LowLevelDesign.DesignVendingMachine.Item;
import LowLevelDesign.DesignVendingMachine.VendingMachine;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    //public void setAmount(VendingMachine machine , int amount) throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public Integer refundFullMoney(VendingMachine machine) throws Exception;

    public void addAmount(VendingMachine machine, int amount) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;


}
