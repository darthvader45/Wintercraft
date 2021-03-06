package gruntpie224.wintercraft.items;

import java.util.List;

import gruntpie224.wintercraft.Wintercraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCookieCone extends ItemFood{

	public ItemCookieCone(int par2, float par3, boolean par4) {
		super(par2, par3, par4);
		this.setCreativeTab(Wintercraft.wintercraftTab);
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a7eFills 3 Hunger");
        par3List.add("\u00a7bGives 45 Sec Speed Boost");
    }
	
	@Override
    public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 45 * 20, 2));    
    }
	
}
