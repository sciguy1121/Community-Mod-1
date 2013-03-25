package mods;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class Materials {
	static EnumToolMaterial copper =  EnumHelper.addToolMaterial("Copper", 1, 150, 4F, 1, 15);
	static EnumToolMaterial platinum = EnumHelper.addToolMaterial("Platinum", 2, 275, 6F, 2, 14);
	static EnumToolMaterial titanium = EnumHelper.addToolMaterial("Titanium", 4, 350, 7F, 4, 20);
}
