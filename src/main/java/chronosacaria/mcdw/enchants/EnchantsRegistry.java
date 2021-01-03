package chronosacaria.mcdw.enchants;

import chronosacaria.mcdw.Mcdw;
import chronosacaria.mcdw.api.EnchantmentSkeleton;
import chronosacaria.mcdw.api.McdwEnchantmentBuilder;
import chronosacaria.mcdw.enchants.enchantments.*;
import com.google.common.collect.Sets;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

public class EnchantsRegistry {
    public static final String MODID = Mcdw.MOD_ID;

    private static Function<ItemStack,Boolean> isBowOrCrossBow = (stack)-> {
        for(Class<?> clazz : Sets.<Class<?>>newHashSet(FishingRodItem.class, BowItem.class, CrossbowItem.class)) {
            if(clazz.isInstance(stack.getItem())) return true;
        }
        return false;
    };

    public static final EnchantmentSkeleton ANIMA_CONDUIT = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("anima_conduit");

    public static final EnchantmentSkeleton CHAINS = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("chains");

    public static final EnchantmentSkeleton COMMITTED = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("committed");

    public static final EnchantmentSkeleton CRITICAL_HIT = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("critical_hit");

    public static final EnchantmentSkeleton ECHO = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("echo");

    public static final EnchantmentSkeleton ENIGMA_RESONATOR = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("enigma_resonator");

    public static final EnchantmentSkeleton EXPLODING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("exploding");

    public static final EnchantmentSkeleton FREEZING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("freezing");

    public static final EnchantmentSkeleton GRAVITY = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("gravity");

    public static final EnchantmentSkeleton JUNGLE_POISON = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("jungle_poison");

    public static final EnchantmentSkeleton LEECHING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("leeching");

    public static final EnchantmentSkeleton POISON_CLOUD = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("poison_cloud");

    public static final EnchantmentSkeleton RADIANCE = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("radiance");

    public static final EnchantmentSkeleton RAMPAGING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("rampaging");

    public static final EnchantmentSkeleton SHOCKWAVE = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("shockwave");

    public static final EnchantmentSkeleton SMITING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("smiting");

    public static final EnchantmentSkeleton SOUL_SIPHON = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("soul_siphon");

    public static final EnchantmentSkeleton STUNNING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("stunning");

    public static final EnchantmentSkeleton SWIRLING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("swirling");

    public static final EnchantmentSkeleton THUNDERING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("thundering");

    public static final EnchantmentSkeleton WEAKENING = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof SwordItem || itemstack.getItem() instanceof AxeItem;})
            .build("weakening");

    public static final EnchantmentSkeleton ACCELERATE = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof BowItem || itemstack.getItem() instanceof CrossbowItem;})
            .build("accelerate");

    public static final EnchantmentSkeleton BONUS_SHOT = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof BowItem || itemstack.getItem() instanceof CrossbowItem;})
            .build("bonus_shot");

    public static final EnchantmentSkeleton CHARGE = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof BowItem || itemstack.getItem() instanceof CrossbowItem;})
            .build("charge");

    public static final EnchantmentSkeleton FUSE_SHOT = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof BowItem || itemstack.getItem() instanceof CrossbowItem;})
            .build("fuse_shot");

    public static final EnchantmentSkeleton REPLENISH = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof BowItem || itemstack.getItem() instanceof CrossbowItem;})
            .build("replenish");

    public static final EnchantmentSkeleton RICOCHET = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof BowItem || itemstack.getItem() instanceof CrossbowItem;})
            .build("ricochet");

    public static final EnchantmentSkeleton TEMPO_THEFT = new McdwEnchantmentBuilder(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND)
            .maxlevel(3)
            .isAcceptible((itemstack)->{return itemstack.getItem() instanceof BowItem || itemstack.getItem() instanceof CrossbowItem;})
            .build("tempo_theft");

    public static void init()
    {
        for(EnchantmentSkeleton e : new EnchantmentSkeleton[] {
                ANIMA_CONDUIT, CHAINS, CRITICAL_HIT, ECHO, ENIGMA_RESONATOR, EXPLODING, FREEZING, GRAVITY,
                JUNGLE_POISON, LEECHING, POISON_CLOUD, RADIANCE, RAMPAGING, SHOCKWAVE, SMITING, SOUL_SIPHON, STUNNING,
                SWIRLING, THUNDERING, WEAKENING,

                ACCELERATE, BONUS_SHOT, CHARGE, FUSE_SHOT, REPLENISH, RICOCHET, TEMPO_THEFT,
        })
        {
            if(e.enabled())
                Registry.register(Registry.ENCHANTMENT, new Identifier(MODID, e.regName()), e);
        }

    }
}