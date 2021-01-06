package chronosacaria.mcdw.enchants.enchantments;

import chronosacaria.mcdw.Mcdw;
import chronosacaria.mcdw.enchants.types.RangedEnchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class FuseShotEnchantment extends RangedEnchantment {
    public FuseShotEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        Registry.register(Registry.ENCHANTMENT,Mcdw.ID("fuse_shot"),this);
    }

    @Override
    public int getMaxLevel(){
        return 3;
    }

    /*@Override
    public void onTargetDamaged (LivingEntity user, Entity target, int level){
        if (target instanceof LivingEntity){
            World world = user.getEntityWorld();
            world.createExplosion(target, target.getX(), target.getY(), target.getZ(), level,
                    Explosion.DestructionType.NONE);
        }
    }*/

}