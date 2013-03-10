package communityMod.common.research;

public class Research {

	public final String name;
	public final int researchID;
	
	public Research(String name, int id){
		this.name = name;
		this.researchID = id;
	}
	
	public static final Research siliconIngot = new Research("Silicon Discoveries", 0);
	
}
