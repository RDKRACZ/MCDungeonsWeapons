package chronosacaria.mcdw.api.interfaces;

import net.minecraft.enchantment.Enchantment;

public interface ProjectileEntityEnchantment {
    public void setEnchantmentLevel(Enchantment enchantment, int level);
    public int getEnchantmentLevel(Enchantment enchantment);

}
