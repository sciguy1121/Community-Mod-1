package mods.communityMod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.communityMod.common.entities.EntityRobot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityCow;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderRobot extends RenderLiving{
	
	protected ModelRobot model;
	
	public RenderRobot(ModelRobot par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((ModelRobot)mainModel);
	}
	
	public void renderRobot(EntityRobot par1EntityRobot, double par2, double par4, double par6, float par8, float par9){
        super.doRenderLiving(par1EntityRobot, par2, par4, par6, par8, par9);
    }
    
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9){
        this.renderRobot((EntityRobot)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9){
        this.renderRobot((EntityRobot)par1Entity, par2, par4, par6, par8, par9);
    }
	
}
