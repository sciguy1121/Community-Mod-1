package communityMod.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import communityMod.common.Reference;
import communityMod.common.research.Research;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemResearch extends Item {
    Research research;

    public ItemResearch(int par1, String name) {
        super(par1);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setUnlocalizedName(name);
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, @SuppressWarnings("rawtypes") List par3List, boolean par4) {
        // par3List.add(research.name);
    }

    @SuppressWarnings("unchecked")
	@Override
    public void getSubItems(int itemID, CreativeTabs tab, @SuppressWarnings("rawtypes") List itemList) {
        for (int i = 0; i < 3; i++) {
            itemList.add(new ItemStack(itemID, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        super.registerIcons(iconRegister);
        this.itemIcon = iconRegister.registerIcon(Reference.modTextureID + ":" + "Research");
    }

}
