package mods.communityMod.common.research;

import java.util.HashMap;

import mods.communityMod.common.IDsHelper;
import mods.communityMod.common.blocks.BlocksHelper;
import mods.communityMod.common.items.ItemsHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class ResearchHandler {

	/*
	 * The way research will work is like this:
	 * 
	 * The player will research something, and they will be given an item with metadata.
	 * The metatadata corresponds to the research that has been completed.
	 * When the player right-clicks with their research, the item will send a request to the
	 * Research Handler to set that research number to true, and the player will
	 * be able to do everything that research sets up.
	 */
	
	private static final ResearchHandler instance = new ResearchHandler();
	
	private HashMap<Integer, Integer> accessors = new HashMap<Integer, Integer>();
	private HashMap<Integer, Boolean> research = new HashMap<Integer, Boolean>();
	
	public static ResearchHandler instance(){
		return instance;
	}
	
	public void initResearchHandler(){
		this.setupResearchValues();
	}
	
	public void setResearchValue(int research, boolean value){
		this.accessors.put(accessors.size(), research);
		this.research.put(research, value);
	}
	
	public void setupResearchValues(){
		for(int i = 0; i < accessors.size(); i++){
			if(research.get(accessors.get(i))){
				if(accessors.get(i) == ItemsHelper.siliconIngot.itemID){
					GameRegistry.addRecipe(new ItemStack(BlocksHelper.siliconBlock, 1), new Object[]{
						"SSS", "SSS", "SSS", 'S', ItemsHelper.siliconIngot
					});
					GameRegistry.addRecipe(new ItemStack(ItemsHelper.siliconWafer, 8), new Object[]{
						"SSS", "SNS", "SSS", 'S', ItemsHelper.siliconIngot
					});
			        
			        GameRegistry.addRecipe(new ItemStack(ItemsHelper.siliconChip, 4), new Object[]{
			        	"SIS", "IWI", "SIS", 'S', ItemsHelper.siliconIngot, 'I', ItemsHelper.siliconWafer, 'W', Item.bucketWater
			        });
				}
			}
		}
	}
	
}
