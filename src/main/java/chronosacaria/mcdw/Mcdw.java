package chronosacaria.mcdw;

import chronosacaria.mcdw.enchants.EnchantsRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import chronosacaria.mcdw.weapons.*;



public class Mcdw implements ModInitializer {

    public static final String MOD_ID = "mcdw";

    public static final ItemGroup WEAPONS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "weapons"),
            () -> new ItemStack(Claymores.SWORD_HEARTSTEALER));
    public static final ItemGroup RANGED = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "weapons/bows"),
            () -> new ItemStack(Bows.BOW_LONGBOW));
    public static final ItemGroup ENCHANTMENTS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "enchants"))
            .icon(() -> new ItemStack(Items.ENCHANTED_BOOK))
            .appendItems(itemStacks -> {
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.POISON_CLOUD,1)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.POISON_CLOUD,2)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.POISON_CLOUD,3)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.THUNDERING,1)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.GRAVITY,1)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.GRAVITY,2)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.GRAVITY,3)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.EXPLODING,1)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.EXPLODING,2)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.EXPLODING,3)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.FREEZING,1)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.FREEZING,2)));
                itemStacks.add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(EnchantsRegistry.FREEZING,3)));
            })
            .build();

    //private static final Enchantment POISON_CLOUD = new PoisonCloud(Enchantment.Rarity.COMMON,
            //EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    @Override
    public void onInitialize() {

        // Melee Weapons
        Claymores.init();
        Curves.init();
        Daggers.init();
        Glaives.init();
        Katanas.init();
        Sickles.init();
        SoulDaggers.init();
        Scythes.init();
        Spears.init();
        Swords.init();
        Whips.init();
        Staves.init();
        Rapiers.init();
        Axes.init();
        DoubleAxes.init();
        Hammers.init();

        // Tools
        Picks.init();

        // Ranged
        Bows.init();

        // Enchants
        EnchantsRegistry.init();

        //Registry.register(Registry.ENCHANTMENT,new Identifier(MOD_ID, "poison_cloud"),POISON_CLOUD);

    }

    /*public static void register(){
        McdwEntities.register();
    }*/

    /*public static void registerServerboundPackets(){
        ServerSidePacketRegistry.INSTANCE.register(C2SRotateHeldItem.ID, C2SRotateHeldItem::onPacket);
    }*/
}
