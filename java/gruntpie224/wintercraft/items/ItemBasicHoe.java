package gruntpie224.wintercraft.items;

import gruntpie224.wintercraft.Wintercraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemBasicHoe extends ItemHoe{

	private Item repair;
	public ItemBasicHoe(ToolMaterial par2EnumToolMaterial, Item repair) {
		super(par2EnumToolMaterial);
		this.setCreativeTab(Wintercraft.wintercraftTab);
		this.repair = repair;
	}

	@Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
    	return par2ItemStack.isItemEqual(new ItemStack(this.repair, 1, 0)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
	
}
