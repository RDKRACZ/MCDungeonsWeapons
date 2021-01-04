package chronosacaria.mcdw.mixin.events;

import chronosacaria.mcdw.api.events.OnBowArrowCreationEvent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(BowItem.class)
public abstract class OnBowArrowCreationEventMixin {
    @Inject(
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/entity/projectile/PersistentProjectileEntity.setProperties(Lnet/minecraft/entity/Entity;FFFFF)V"),
            method = "onStoppedUsing",
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void addEnchantsToArrowEntity(ItemStack bow, World world, LivingEntity user, int remainingUseTicks,
                                         CallbackInfo ci, PlayerEntity player, boolean creativeOrInfinity,
                                         ItemStack arrowStack, int elapsedUseTime, float pullProgress,
                                         boolean creativeOrInfinityAndArrowStackIsArrow, ArrowItem arrow,
                                         PersistentProjectileEntity arrowEntity)
    {
        OnBowArrowCreationEvent.EVENT.invoker().onCreation(bow, arrowStack,arrowEntity, player, elapsedUseTime,
                pullProgress);
    }

}
