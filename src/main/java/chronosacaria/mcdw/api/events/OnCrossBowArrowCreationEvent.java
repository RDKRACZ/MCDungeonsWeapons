package chronosacaria.mcdw.api.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;

public interface OnCrossBowArrowCreationEvent {
    Event<OnCrossBowArrowCreationEvent> EVENT = EventFactory.createArrayBacked(OnCrossBowArrowCreationEvent.class,
            (listeners) -> (arrow, crossbow, arrowItem, livingEntity) -> {

                for (OnCrossBowArrowCreationEvent event : listeners)
                {
                    event.onCreation(arrow,crossbow,arrowItem,livingEntity);
                }

            });
    void onCreation(PersistentProjectileEntity arrow, ItemStack crossBow, ItemStack arrowItem, LivingEntity shooter);
}
