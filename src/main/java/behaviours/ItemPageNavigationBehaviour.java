package behaviours;

import pages.ItemPage;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-14  */
public class ItemPageNavigationBehaviour extends Behaviour {
    private final ItemPage itemPage;

    public  ItemPageNavigationBehaviour(ItemPage itemPage){
        this.itemPage = itemPage;
    }

    public void PerformAct(){
        itemPage.navigate(PurchaseTestContext.itemUrl);
    }

}
