package communityMod.common.research;

public class Research {

	public final String name;
	public final int researchID;
	
	public Research(String name, int id){
		this.name = name;
		this.researchID = id;
	}
	
	public static final Research siliconIngot = new Research("Silicon Discoveries", 0);
	public static final Research titaniumIngot = new Research("Titanium Discoveries", 1);
	public static final Research copperIngot = new Research("Copper Discoveries", 2);
	
}
