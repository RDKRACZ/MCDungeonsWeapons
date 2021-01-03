package chronosacaria.mcdw.api.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;

public interface OnBowArrowCreationEvent {
    Event<OnBowArrowCreationEvent> EVENT = EventFactory.createArrayBacked(OnBowArrowCreationEvent.class,
            (listeners)->(bow, arrowStack, arrowEntity, user, elapsedUseTime, pullProgress)->
    {
        for(OnBowArrowCreationEvent invoker : listeners)
        {
            invoker.onCreation(bow,arrowStack,arrowEntity,user,elapsedUseTime,pullProgress);
        }
    });

    void onCreation(ItemStack bow, ItemStack arrowStack, PersistentProjectileEntity arrowEntity, PlayerEntity user,
                    int elapsedUseTime, float pullProgress);
}
