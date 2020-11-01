package net.opti.geocraft.material;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.opti.geocraft.ModItem;

public class HammerToolsMaterial implements IItemTier {
    @Override
    public int getMaxUses()
    {
        return 128;
    }

    @Override
    public float getEfficiency()
    {
        return 11;
    }

    @Override
    public float getAttackDamage()
    {
        return 6;
    }

    @Override
    public int getHarvestLevel()
    {
        return 4;
    }

    @Override
    public int getEnchantability()
    {
        return 0;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Items.IRON_INGOT);
    }
}
