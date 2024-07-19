package LowLevelDesign.DesignVendingMachine;

import LowLevelDesign.DesignVendingMachine.VendingStates.State;
import LowLevelDesign.DesignVendingMachine.VendingStates.impl.IdleState;


public class VendingMachine {

    private State vendingMachineState;
    private Inventory inventory;
    private Integer amount;

    public VendingMachine(){
        this.vendingMachineState = new IdleState();
        this.inventory = new Inventory(10);
        this.amount  = 0;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void addAmount(int amount) {
        this.setAmount(this.getAmount()+amount);
    }
}
