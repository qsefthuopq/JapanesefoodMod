package jp.tdn.japanese_food_mod.client.renders;

import jp.tdn.japanese_food_mod.JapaneseFoodMod;
import jp.tdn.japanese_food_mod.client.models.EelEntityModel;
import jp.tdn.japanese_food_mod.entities.EelEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class EelEntityRender extends MobRenderer<EelEntity, EelEntityModel<EelEntity>> {
    public EelEntityRender(EntityRendererManager manager){
        super(manager, new EelEntityModel<EelEntity>(), 0f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull EelEntity ellEntity) {
        return new ResourceLocation(JapaneseFoodMod.MOD_ID + ":textures/entities/eel.png");
    }
}
