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
    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        LeftLeg.render(f5);
        RightLeg.render(f5);
        Body.render(f5);
        Head.render(f5);
        LeftArm.render(f5);
        RightArm.render(f5);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
    
}