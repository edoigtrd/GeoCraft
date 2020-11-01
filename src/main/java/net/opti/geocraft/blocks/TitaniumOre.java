package net.opti.geocraft.blocks;

import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.NetherDimension;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.opti.geocraft.GeoMain;
import net.opti.geocraft.ModBlocks;
import net.opti.geocraft.utils.References;

import java.awt.*;

public class TitaniumOre extends Block {

    public TitaniumOre(Properties properties) {
        //10F 6F
        super(properties.hardnessAndResistance(7F,-1F));
    }
    @Override
    public void onBlockClicked(BlockState blockState, World world, BlockPos pos, PlayerEntity player)
    {
        System.out.println("evenement");
        if (player.dimension == DimensionType.THE_NETHER)
        {
            System.out.println(player.getHeldItemMainhand().getCount());
            int cout =player.getHeldItemMainhand().getCount();
            if (player.getHeldItemMainhand().getItem() == Items.BLAZE_POWDER)
            {
                System.out.println("blaze powder");
                world.removeBlock(pos, false);

                //if(player.game)
                //int lastitemblaze = player.inventory.getHeldItemMainhand();

                player.inventory.removeStackFromSlot(player.inventory.currentItem);
                player.inventory.add(player.inventory.currentItem, new ItemStack(Items.BLAZE_POWDER, cout-1));


                // le paramètre 15 = le rayon en block de l'explosion
                // le paramètre que j'ai mis à true = est ce que ça cause des flammes
                // le paramètre Mode = si l'explosion détruit les block (Destroy), si ca laisse les loots (Break), ou si ca fait rien (None)
                world.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 4, true, Explosion.Mode.DESTROY);
                //replaceBlock(getDefaultState(), leBlockAAjouter.getDefaultState(), world, pos, 0)
                replaceBlock(ModBlocks.TITANIUM_ORE.getDefaultState(),ModBlocks.BLASTED_TITANIUM_ORE.getDefaultState(),world,pos,0);

            }
        }
    }
}
