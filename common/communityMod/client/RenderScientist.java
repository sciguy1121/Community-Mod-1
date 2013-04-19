package communityMod.client;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

import communityMod.common.entities.EntityScientist;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderScientist extends RenderLiving {
    
    protected ModelScientist model;
    
    public RenderScientist(ModelScientist par1ModelBase, float par2) {
        super (par1ModelBase, par2);
        model = ((ModelScientist) mainModel);
    }
    
    public void renderScientist(EntityScientist par1EntityScientist, double par2,
                                double par4, double par6, float par8, float par9) {
        super.doRenderLiving(par1EntityScientist, par2, par4, par6, par8, par9);
    }
    
    @Override
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2,
                               double par4, double par6, float par8, float par9) {
        this.renderScientist((EntityScientist) par1EntityLiving, par2, par4, par6,
                             par8, par9);
    }
    
    @Override
    public void doRender(Entity par1Entity, double par2, double par4,
                         double par6, float par8, float par9) {
        this.renderScientist((EntityScientist) par1Entity, par2, par4, par6, par8, par9);
    }
    
}
