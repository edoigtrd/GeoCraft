package net.opti.geocraft.material;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.opti.geocraft.ModItem;
import net.opti.geocraft.utils.References;

public class AmethystArmorMaterial implements IArmorMaterial {
    @Override
    public int getDurability( EquipmentSlotType slotIn)
    {
        return (int) (new int[]{3, 6, 7, 3}[slotIn.getIndex()] * this.getToughness());
    }

    @Override
    public int getDamageReductionAmount( EquipmentSlotType slotIn)
    {
        return new int[]{3, 6, 7, 3}[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return 15;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(ModItem.AMETHYST);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public  String getName()
    {
        return References.MODID+":amethyst";
    }

    @Override
    public float getToughness()
    {
        return 2;
    }
}
