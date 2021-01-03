package chronosacaria.mcdw.api;

import chronosacaria.mcdw.api.EnchantmentSkeleton.LevelProvider;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

import java.util.function.Function;

public class McdwEnchantmentBuilder {

    EnchantmentSkeleton mcdwenhant;
    public static final EquipmentSlot[]
        ARMOR_SLOTS = new EquipmentSlot[] {EquipmentSlot.FEET, EquipmentSlot.LEGS, EquipmentSlot.CHEST,
            EquipmentSlot.HEAD},
        ALL_SLOTS = new EquipmentSlot[] {EquipmentSlot.FEET, EquipmentSlot.LEGS, EquipmentSlot.CHEST,
                EquipmentSlot.HEAD, EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND},
        HAND_SLOTS = new EquipmentSlot[] {EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND};

    public McdwEnchantmentBuilder(Rarity rarity, EnchantmentTarget enchantmentTarget, EquipmentSlot... equipmentSlots) {
        this.mcdwenhant = new EnchantmentSkeleton(rarity, enchantmentTarget, equipmentSlots);
    }

    public McdwEnchantmentBuilder enabled(boolean bool){
        this.mcdwenhant.enabled = bool;
        return this;
    }

    public McdwEnchantmentBuilder treasure(boolean bool){
        this.mcdwenhant.isTreasure = bool;
        return this;
    }

    public McdwEnchantmentBuilder curse(boolean bool){
        this.mcdwenhant.isCurse = bool;
        return this;
    }

    public McdwEnchantmentBuilder minlevel(int i){
        this.mcdwenhant.minlevel = i;
        return this;
    }

    public McdwEnchantmentBuilder maxlevel(int i){
        this.mcdwenhant.maxlevel = i;
        return this;
    }

    public McdwEnchantmentBuilder minpower(LevelProvider provider){
        this.mcdwenhant.minpower = provider;
        return this;
    }

    public McdwEnchantmentBuilder maxpower(LevelProvider provider){
        this.mcdwenhant.maxpower = provider;
        return this;
    }

    public McdwEnchantmentBuilder isAcceptible(Function<ItemStack, Boolean> isAcceptible){
        this.mcdwenhant.isAcceptible = isAcceptible;
        return this;
    }

    public EnchantmentSkeleton build(String regname){
        this.mcdwenhant.regname = regname.toLowerCase();
        return this.mcdwenhant;
    }

}
