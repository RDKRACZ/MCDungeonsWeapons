package chronosacaria.mcdw;

import chronosacaria.mcdw.api.events.OnBowArrowCreationEvent;
import chronosacaria.mcdw.api.events.OnCrossBowArrowCreationEvent;
import chronosacaria.mcdw.enchants.EnchantsRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import chronosacaria.mcdw.api.interfaces.ProjectileEntityEnchantment;

public class EventHandlers {

    private EventHandlers(){}

    private static void addProjectileEnchant(PersistentProjectileEntity arrow, LivingEntity shooter, ItemStack bowItem)
    {
        ((ProjectileEntityEnchantment)arrow).setEnchantmentLevel(EnchantsRegistry.BONUS_SHOT,
                EnchantsRegistry.BONUS_SHOT.getLevel(bowItem));

    }

    public static void init(){
        OnCrossBowArrowCreationEvent.EVENT.register((arrow, crossbow, ArrowItem, shooter) -> {
            addProjectileEnchant(arrow, shooter, crossbow);
        });
        OnBowArrowCreationEvent.EVENT.register((bow, arrowStack, arrowEntity, player, elapsed, pullProg) -> {
            addProjectileEnchant(arrowEntity, player,bow);
        });

    }

}
