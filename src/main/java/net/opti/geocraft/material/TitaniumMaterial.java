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

public class TitaniumMaterial implements IArmorMaterial {
    @Override
    public int getDurability( EquipmentSlotType slotIn)
    {
        return (int) (new int[]{19, 19, 19, 19}[slotIn.getIndex()] * this.getToughness());
    }

    @Override
    public int getDamageReductionAmount( EquipmentSlotType slotIn)
    {
        return new int[]{6, 9, 11, 6}[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return 30;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(ModItem.TITANIUM_INGOT);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public  String getName()
    {
        return References.MODID+":titanium";
    }

    @Override
    public float getToughness()
    {
        return 4;
    }
}
