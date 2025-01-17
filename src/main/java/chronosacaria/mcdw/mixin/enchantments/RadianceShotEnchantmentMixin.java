package chronosacaria.mcdw.mixin.enchantments;

import chronosacaria.mcdw.api.util.AOECloudHelper;
import chronosacaria.mcdw.configs.McdwEnchantsConfig;
import chronosacaria.mcdw.enchants.EnchantsRegistry;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PersistentProjectileEntity.class)
public abstract class RadianceShotEnchantmentMixin extends Entity {

    public RadianceShotEnchantmentMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "onEntityHit", at = @At("TAIL"))
    private void onRadianceShotEnchantmentEntityHit(EntityHitResult entityHitResult, CallbackInfo ci){
        if (!(entityHitResult.getEntity() instanceof LivingEntity)) {
            return;
        }
        PersistentProjectileEntity persistentProjectileEntity = (PersistentProjectileEntity) (Object) this;
        Entity target = entityHitResult.getEntity();
        LivingEntity shooter = (LivingEntity) persistentProjectileEntity.getOwner();
        ItemStack mainHandStack = null;
        if (shooter != null) {
            mainHandStack = shooter.getMainHandStack();
        }
        if (McdwEnchantsConfig.getValue("radiance_shot")) {
            if (mainHandStack != null && (EnchantmentHelper.getLevel(EnchantsRegistry.RADIANCE_SHOT, mainHandStack) >= 1)) {
                int level = EnchantmentHelper.getLevel(EnchantsRegistry.RADIANCE_SHOT, mainHandStack);
                float radianceShotRand = shooter.getRandom().nextFloat();
                if (radianceShotRand <= 0.2F) {
                    if (target instanceof LivingEntity) {
                        AOECloudHelper.spawnRegenCloudAtPos(shooter, true, target.getBlockPos(), level - 1);
                    }
                }
            }
        }
    }
}
