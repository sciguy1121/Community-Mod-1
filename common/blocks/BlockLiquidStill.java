package blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockLiquidStill extends BlockStationary{
	
	private String TextureName;
	private String SideTextureName;
	private Icon side;
	private Icon bottom;
	
	BlockLiquidStill(int par1, String textureName) {
		super(par1, Material.water);
        
		this.blockHardness = 100.0F;
		this.setLightOpacity(2);
		this.disableStats();
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
		this.bottom = reg.registerIcon("liquidConcrete.png");
    }
	
	public Icon getBlockTextureFromSideAndMetadata(int side, int metadata)
    {
        if(side == 1) return blockIcon;
        else if(side == 0) return bottom;
        else return this.side;
    }
	
}
