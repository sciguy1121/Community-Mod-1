package communityMod.common.recipes;

import java.util.HashMap;

import net.minecraft.item.ItemStack;

public class ResearcherRecipes {

	private static final ResearcherRecipes instance = new ResearcherRecipes();

	private HashMap<Integer, ItemStack> metaResearchList = new HashMap<Integer, ItemStack>();
	private HashMap<Integer, Integer> metaProgressRequiredList = new HashMap<Integer, Integer>();

	public static final ResearcherRecipes instance() {
		return instance;
	}

	private ResearcherRecipes() {

	}

	/**
	 * Adds a research recipe for discoveries
	 * 
	 * @param id
	 *            ID of the item
	 * @param itemStack
	 *            Research item to output
	 * @param progressRequired
	 *            Number of items required to research
	 * @param experience
	 *            Experience given after researching
	 */
	public void addRecipe(int id, ItemStack itemStack, int progressRequired) {
		metaResearchList.put(id, itemStack);
		metaProgressRequiredList.put(id, progressRequired);
	}

	public ItemStack getResearchResult(ItemStack item) {
		if (item == null) {
			return null;
		}
		ItemStack ret = metaResearchList.get(item.itemID);
		if (ret != null) {
			return ret;
		}
		// THE FOLLOWING LINE MIGHT NEED TO BE REPLACED WITH A LINE FROM FURNACE
		// RECIPES
		return null;
	}

	public int getProgressRequired(ItemStack item) {
		if (item == null) {
			return 0;
		}

		int ret = metaProgressRequiredList.get(item.itemID);

		if (ret != 0) {
			return ret;
		}

		return 0;
	}

}
