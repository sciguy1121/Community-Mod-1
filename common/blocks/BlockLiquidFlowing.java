package blocks;

import communityMod.common.CommunityMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockLiquidFlowing extends BlockFlowing{
    
	private String TextureName;
	private String SideTextureName;
	private Icon side;
	private Icon bottom;
	
	protected BlockLiquidFlowing(int par1, String textureName) {
		super(par1, Material.water);
        
		this.blockHardness = 100.0F;
		this.setLightOpacity(2);
		this.setCreativeTab(CommunityMod.modTab);
		TextureName = TextureName;
		SideTextureName = SideTextureName;
    }
    
	
	public String getTextureName(){
		return this.TextureName;
	}
	
	private String getSideTextureName() {
		return this.SideTextureName;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg)
    {
		this.blockIcon = reg.registerIcon("communityMod:" + this.getTextureName());
		this.side = reg.registerIcon("communityMod:" + this.getSideTextureName());
		this.bottom = reg.registerIcon("liquidConcreteFlowing.png");
    }
	
	public Icon getBlockTextureFromSideAndMetadata(int side, int metadata)
    {
        if(side == 1) return blockIcon;
        else if(side == 0) return bottom;
        else return this.side;
    }
}

