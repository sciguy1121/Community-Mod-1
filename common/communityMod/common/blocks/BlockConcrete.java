package communityMod.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import communityMod.common.CommunityMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockConcrete extends Block {

	private String textureName;

	public BlockConcrete(int par1, String tex) {
		super(par1, Material.rock);
		this.textureName = tex;
		this.setCreativeTab(CommunityMod.modTab);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return this.blockID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		super.registerIcons(register);
		this.blockIcon = register.registerIcon("communityMod:"
				+ this.textureName);
	}

}