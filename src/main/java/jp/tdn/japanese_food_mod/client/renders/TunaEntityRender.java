package jp.tdn.japanese_food_mod.client.renders;

import jp.tdn.japanese_food_mod.JapaneseFoodMod;
import jp.tdn.japanese_food_mod.client.models.CrabEntityModel;
import jp.tdn.japanese_food_mod.client.models.TunaEntityModel;
import jp.tdn.japanese_food_mod.entities.CrabEntity;
import jp.tdn.japanese_food_mod.entities.TunaEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class TunaEntityRender extends MobRenderer<TunaEntity, TunaEntityModel<TunaEntity>> {
    public TunaEntityRender(EntityRendererManager manager){
        super(manager, new TunaEntityModel<TunaEntity>(), 0f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull TunaEntity tunaEntity) {
        return new ResourceLocation(JapaneseFoodMod.MOD_ID + ":textures/entities/tuna.png");
    }
}
