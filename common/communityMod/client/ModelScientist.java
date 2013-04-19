package communityMod.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScientist extends ModelBase{
    //fields
    ModelRenderer sideright;
    ModelRenderer sideleftglass;
    ModelRenderer bottomrightglass;
    ModelRenderer bottomleftglass;
    ModelRenderer rightglass;
    ModelRenderer leftglass;
    ModelRenderer rightrobe;
    ModelRenderer topglass;
    ModelRenderer middleglass;
    ModelRenderer leftrobe;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    
    public ModelScientist()
    {
        textureWidth = 64;
        textureHeight = 64;
        
        sideright = new ModelRenderer(this, 38, 32);
        sideright.addBox(0F, 0F, 0F, 1, 1, 8);
        sideright.setRotationPoint(4F, -4F, -4F);
        sideright.setTextureSize(64, 64);
        sideright.mirror = true;
        setRotation(sideright, 0F, 0F, 0F);
        sideleftglass = new ModelRenderer(this, 20, 32);
        sideleftglass.addBox(0F, 0F, 0F, 1, 1, 8);
        sideleftglass.setRotationPoint(-5F, -4F, -4F);
        sideleftglass.setTextureSize(64, 64);
        sideleftglass.mirror = true;
        setRotation(sideleftglass, 0F, 0F, 0F);
        bottomrightglass = new ModelRenderer(this, 30, 4);
        bottomrightglass.addBox(0F, 0F, 0F, 2, 1, 1);
        bottomrightglass.setRotationPoint(1F, -3F, -5F);
        bottomrightglass.setTextureSize(64, 64);
        bottomrightglass.mirror = true;
        setRotation(bottomrightglass, 0F, 0F, 0F);
        bottomleftglass = new ModelRenderer(this, 24, 4);
        bottomleftglass.addBox(0F, 0F, 0F, 2, 1, 1);
        bottomleftglass.setRotationPoint(-3F, -3F, -5F);
        bottomleftglass.setTextureSize(64, 64);
        bottomleftglass.mirror = true;
        setRotation(bottomleftglass, 0F, 0F, 0F);
        rightglass = new ModelRenderer(this, 28, 2);
        rightglass.addBox(0F, 0F, 0F, 1, 1, 1);
        rightglass.setRotationPoint(3F, -4F, -5F);
        rightglass.setTextureSize(64, 64);
        rightglass.mirror = true;
        setRotation(rightglass, 0F, 0F, 0F);
        leftglass = new ModelRenderer(this, 24, 2);
        leftglass.addBox(0F, 0F, 0F, 1, 1, 1);
        leftglass.setRotationPoint(-4F, -4F, -5F);
        leftglass.setTextureSize(64, 64);
        leftglass.mirror = true;
        setRotation(leftglass, 0F, 0F, 0F);
        rightrobe = new ModelRenderer(this, 6, 32);
        rightrobe.addBox(0F, 0F, 0F, 2, 12, 1);
        rightrobe.setRotationPoint(2F, 0F, -3F);
        rightrobe.setTextureSize(64, 64);
        rightrobe.mirror = true;
        setRotation(rightrobe, 0F, 0F, 0F);
        topglass = new ModelRenderer(this, 24, 0);
        topglass.addBox(0F, 0F, 0F, 7, 1, 1);
        topglass.setRotationPoint(-3.333333F, -5F, -5F);
        topglass.setTextureSize(64, 64);
        topglass.mirror = true;
        setRotation(topglass, 0F, 0F, 0F);
        middleglass = new ModelRenderer(this, 37, 6);
        middleglass.addBox(0F, 0F, 0F, 2, 1, 1);
        middleglass.setRotationPoint(-1F, -4F, -5F);
        middleglass.setTextureSize(64, 64);
        middleglass.mirror = true;
        setRotation(middleglass, 0F, 0F, 0F);
        leftrobe = new ModelRenderer(this, 0, 32);
        leftrobe.addBox(0F, 0F, 0F, 2, 12, 1);
        leftrobe.setRotationPoint(-4F, 0F, -3F);
        leftrobe.setTextureSize(64, 64);
        leftrobe.mirror = true;
        setRotation(leftrobe, 0F, 0F, 0F);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(64, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(64, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-5F, 2F, 0F);
        rightarm.setTextureSize(64, 64);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 2F, 0F);
        leftarm.setTextureSize(64, 64);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-2F, 12F, 0F);
        rightleg.setTextureSize(64, 64);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(2F, 12F, 0F);
        leftleg.setTextureSize(64, 64);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
    }
    
    @Override
    public void render(Entity par1Entity, float par2, float par3, float par4,
                       float par5, float par6, float par7) {
        super.render(par1Entity, par2, par3, par4, par5, par6, par7);
        setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        sideright.render(par7);
        sideleftglass.render(par7);
        bottomrightglass.render(par7);
        bottomleftglass.render(par7);
        rightglass.render(par7);
        leftglass.render(par7);
        rightrobe.render(par7);
        topglass.render(par7);
        middleglass.render(par7);
        leftrobe.render(par7);
        head.render(par7);
        body.render(par7);
        rightarm.render(par7);
        leftarm.render(par7);
        rightleg.render(par7);
        leftleg.render(par7);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float par1, float par2, float par3,
                                  float par4, float par5, float par6, Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
    
}

