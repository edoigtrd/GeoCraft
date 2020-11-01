package net.opti.geocraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.property.Properties;
import net.opti.geocraft.ModBlocks;
import net.opti.geocraft.ModItem;
import java.util.Random;

public class GeodeBlock extends Block {
    public GeodeBlock(Properties properties) {
        super(properties.hardnessAndResistance(7F, 6F));
    }

    @Override
    public void onBlockClicked(BlockState blockState, World world, BlockPos pos, PlayerEntity player) {
        if (player.getHeldItemMainhand().getItem() == ModItem.GEODE_HAMMER) {


                Random rand = new Random();
                int n = rand.nextInt(200);
                //world.removeBlock(pos, false);
                //replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),Blocks.COBBLESTONE.getDefaultState(),world,pos,0);
                int dr = rand.nextInt(1000);

                if(dr< 250){
                replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),ModBlocks.GEODE_AMETHYST.getDefaultState(),world,pos,0);
                }else if(dr<500){
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),ModBlocks.GEODE_SCORIES.getDefaultState(),world,pos,0);
                }else{
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),ModBlocks.GEODE_QUARTZ.getDefaultState(),world,pos,0);
                }
                /*if (n == 1) {
                    player.inventory.removeStackFromSlot(player.inventory.currentItem);

                }*/


            }else{

            if(world.getBlockState(pos.down()).getBlock().getDefaultState()==ModBlocks.GEODE_SUBLIMER.getDefaultState()){
                Random rand = new Random();
                int nr = rand.nextInt(100);
                if(nr<2){
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),Blocks.EMERALD_ORE.getDefaultState(),world,pos,0);
                }else if(nr<22){
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),Blocks.REDSTONE_ORE.getDefaultState(),world,pos,0);
                }else if(nr<27){
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),Blocks.DIAMOND_ORE.getDefaultState(),world,pos,0);
                }else if(nr<43){
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),Blocks.LAPIS_ORE.getDefaultState(),world,pos,0);
                }else if(nr<73){
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),Blocks.IRON_ORE.getDefaultState(),world,pos,0);
                }else if(nr<98){
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),Blocks.GOLD_ORE.getDefaultState(),world,pos,0);
                }else{
                    replaceBlock(ModBlocks.GEODE_BLOCK.getDefaultState(),ModBlocks.TITANIUM_ORE.getDefaultState(),world,pos,0);

                }
            }


        }


    }
    //@Override

}
