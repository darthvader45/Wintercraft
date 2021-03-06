// Date: 11/24/2013 4:21:46 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package gruntpie224.wintercraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMiniSnowGolem extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leftarm;
    ModelRenderer rightarm;
    ModelRenderer bodyOuter;
    ModelRenderer bodyOuter2;
    ModelRenderer bodyOuter3;
    ModelRenderer bodyOuter4;
    ModelRenderer headOuter;
    ModelRenderer headOuter2;
    ModelRenderer headOuter3;
    ModelRenderer headOuter4;
    ModelRenderer flake;
    float tick =0;
  
  public ModelMiniSnowGolem()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    head = new ModelRenderer(this, 28, 55);
    head.addBox(-2.533333F, -5F, -2.033333F, 5, 5, 4);
    head.setRotationPoint(0.4F, 11F, 0F);
    head.setTextureSize(128, 64);
    head.mirror = true;
    setRotation(head, 0F, 0F, 0F);
    body = new ModelRenderer(this, 0, 52);
    body.addBox(-4F, 0F, -2F, 8, 7, 5);
    body.setRotationPoint(0.4F, 11F, 0F);
    body.setTextureSize(128, 64);
    body.mirror = true;
    setRotation(body, 0F, 0F, 0F);
    leg1 = new ModelRenderer(this, 0, 10);
    leg1.addBox(-1.5F, 0F, -1.5F, 3, 6, 3);
    leg1.setRotationPoint(2.4F, 18F, 0F);
    leg1.setTextureSize(128, 64);
    leg1.mirror = true;
    setRotation(leg1, 0F, 0F, 0F);
    leg2 = new ModelRenderer(this, 0, 0);
    leg2.addBox(-1.5F, 0F, -2.5F, 3, 6, 3);
    leg2.setRotationPoint(-1.4F, 18F, 1F);
    leg2.setTextureSize(128, 64);
    leg2.mirror = true;
    setRotation(leg2, 0F, 0F, 0F);
    leftarm = new ModelRenderer(this, 0, 21);
    leftarm.addBox(-1.5F, -1F, -1.5F, 2, 5, 3);
    leftarm.setRotationPoint(-4F, 13F, 0F);
    leftarm.setTextureSize(128, 64);
    leftarm.mirror = true;
    setRotation(leftarm, 0F, 0F, 0F);
    rightarm = new ModelRenderer(this, 0, 31);
    rightarm.addBox(-0.5F, -1F, -1.5F, 2, 5, 3);
    rightarm.setRotationPoint(5F, 13F, 0F);
    rightarm.setTextureSize(128, 64);
    rightarm.mirror = true;
    setRotation(rightarm, 0F, 0F, 0F);
    bodyOuter = new ModelRenderer(this, 0, 50);
    bodyOuter.addBox(-4F, 0F, 0F, 8, 1, 1);
    bodyOuter.setRotationPoint(0.4F, 11F, -3F);
    bodyOuter.setTextureSize(128, 64);
    bodyOuter.mirror = true;
    setRotation(bodyOuter, 0F, 0F, 0F);
    bodyOuter2 = new ModelRenderer(this, 0, 48);
    bodyOuter2.addBox(-4F, 0F, 0F, 8, 1, 1);
    bodyOuter2.setRotationPoint(0.4F, 17F, -3F);
    bodyOuter2.setTextureSize(128, 64);
    bodyOuter2.mirror = true;
    setRotation(bodyOuter2, 0F, 0F, 0F);
    bodyOuter3 = new ModelRenderer(this, 0, 41);
    bodyOuter3.addBox(-4F, 0F, 0F, 1, 5, 1);
    bodyOuter3.setRotationPoint(7.4F, 12F, -3F);
    bodyOuter3.setTextureSize(128, 64);
    bodyOuter3.mirror = true;
    setRotation(bodyOuter3, 0F, 0F, 0F);
    bodyOuter4 = new ModelRenderer(this, 4, 41);
    bodyOuter4.addBox(-4F, 0F, 0F, 1, 5, 1);
    bodyOuter4.setRotationPoint(0.4F, 12F, -3F);
    bodyOuter4.setTextureSize(128, 64);
    bodyOuter4.mirror = true;
    setRotation(bodyOuter4, 0F, 0F, 0F);
    headOuter = new ModelRenderer(this, 28, 50);
    headOuter.addBox(-2.533333F, -5F, -3.033333F, 5, 3, 1);
    headOuter.setRotationPoint(0.4F, 11F, 0F);
    headOuter.setTextureSize(128, 64);
    headOuter.mirror = true;
    setRotation(headOuter, 0F, 0F, 0F);
    headOuter2 = new ModelRenderer(this, 28, 47);
    headOuter2.addBox(-2.533333F, -1F, -3.033333F, 5, 1, 1);
    headOuter2.setRotationPoint(0.4F, 11F, 0F);
    headOuter2.setTextureSize(128, 64);
    headOuter2.mirror = true;
    setRotation(headOuter2, 0F, 0F, 0F);
    headOuter3 = new ModelRenderer(this, 34, 43);
    headOuter3.addBox(-2.533333F, -2F, -3.033333F, 1, 1, 1);
    headOuter3.setRotationPoint(0.4F, 11F, 0F);
    headOuter3.setTextureSize(128, 64);
    headOuter3.mirror = true;
    setRotation(headOuter3, 0F, 0F, 0F);
    headOuter4 = new ModelRenderer(this, 28, 43);
    headOuter4.addBox(1.466667F, -2F, -3.033333F, 1, 1, 1);
    headOuter4.setRotationPoint(0.4F, 11F, 0F);
    headOuter4.setTextureSize(128, 64);
    headOuter4.mirror = true;
    setRotation(headOuter4, 0F, 0F, 0F);
    flake = new ModelRenderer(this, 14, 0);
    flake.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
    flake.setRotationPoint(0.5F, 14F, -3.5F);
    flake.setTextureSize(128, 64);
    flake.mirror = true;
    setRotation(flake, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leftarm.render(f5);
    rightarm.render(f5);
    bodyOuter.render(f5);
    bodyOuter2.render(f5);
    bodyOuter3.render(f5);
    bodyOuter4.render(f5);
    headOuter.render(f5);
    headOuter2.render(f5);
    headOuter3.render(f5);
    headOuter4.render(f5);
    flake.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  this.head.rotateAngleY = f3/ (180/ (float)Math.PI);
	  this.head.rotateAngleX = f4/ (170/ (float)Math.PI);
	  
	  this.headOuter.rotateAngleY = this.head.rotateAngleY;
	  this.headOuter.rotateAngleX =  this.head.rotateAngleX;
	  
	  this.headOuter2.rotateAngleY = this.head.rotateAngleY;
	  this.headOuter2.rotateAngleX =  this.head.rotateAngleX;
	  
	  this.headOuter3.rotateAngleY = this.head.rotateAngleY;
	  this.headOuter3.rotateAngleX =  this.head.rotateAngleX;
	  
	  this.headOuter4.rotateAngleY = this.head.rotateAngleY;
	  this.headOuter4.rotateAngleX =  this.head.rotateAngleX;
	  
	  this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5f;
	  this.leg2.rotateAngleY = 0.0f;
	  
	  this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4f * f1;
	  this.leg1.rotateAngleY = 0.0f;
	  
	  this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5f;
	  this.leftarm.rotateAngleZ = 0.0f;
	  
	  this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6663F + (float)Math.PI) * 1.4f * f1;
	  this.rightarm.rotateAngleZ = 0.0f;
	  
	  this.flake.rotateAngleZ += 0.015f;
  }

}
