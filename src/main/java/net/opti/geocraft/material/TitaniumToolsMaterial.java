package net.opti.geocraft.material;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.opti.geocraft.ModItem;

public class TitaniumToolsMaterial implements IItemTier {
    @Override
    public int getMaxUses()
    {
        return 2827;
    }

    @Override
    public float getEfficiency()
    {
        return 22;
    }

    @Override
    public float getAttackDamage()
    {
        return 4;
    }

    @Override
    public int getHarvestLevel()
    {
        return 4;
    }

    @Override
    public int getEnchantability()
    {
        return 20;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(ModItem.TITANIUM_INGOT);
    }
}
