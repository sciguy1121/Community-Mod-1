package mods.communityMod.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRobot extends ModelBase
{
    //fields
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    
    public ModelRobot()
    {
        textureWidth = 128;
        textureHeight = 128;
        
        LeftLeg = new ModelRenderer(this, 0, 39);
        LeftLeg.addBox(0F, 0F, 0F, 2, 5, 2);
        LeftLeg.setRotationPoint(3F, 19F, -1F);
        LeftLeg.setTextureSize(64, 32);
        LeftLeg.mirror = true;
        setRotation(LeftLeg, 0F, 0F, 0F);
        RightLeg = new ModelRenderer(this, 9, 39);
        RightLeg.addBox(0F, 0F, 0F, 2, 5, 2);
        RightLeg.setRotationPoint(-6F, 19F, -1F);
        RightLeg.setTextureSize(64, 32);
        RightLeg.mirror = true;
        setRotation(RightLeg, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 0, 12);
        Body.addBox(0F, 0F, 0F, 14, 19, 8);
        Body.setRotationPoint(-8F, 0F, -4F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        Head = new ModelRenderer(this, 0, 0);
        Head.addBox(0F, 0F, 0F, 6, 7, 5);
        Head.setRotationPoint(-4F, -7F, -3F);
        Head.setTextureSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        LeftArm = new ModelRenderer(this, 44, 12);
        LeftArm.addBox(0F, 0F, 0F, 2, 13, 2);
        LeftArm.setRotationPoint(-10F, 2F, -2F);
        LeftArm.setTextureSize(128, 128);
        LeftArm.mirror = true;
        setRotation(LeftArm, 0F, 0F, 0F);
        RightArm = new ModelRenderer(this, 54, 12);
        RightArm.addBox(0F, 0F, 0F, 2, 13, 2);
        RightArm.setRotationPoint(6F, 2F, -2F);
        RightArm.setTextureSize(128, 128);
        RightArm.mirror = true;
        setRotation(RightArm, 0F, 0F, 0F);
    }
    
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        super.render(par1Entity, par2, par3, par4, par5, par6, par7);
        setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        LeftLeg.render(par7);
        RightLeg.render(par7);
        Body.render(par7);
        Head.render(par7);
        LeftArm.render(par7);
        RightArm.render(par7);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        super.setRotationAngles(par1, par2, par3, par4, par5, par7Entity);
    }
    
}