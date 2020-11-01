package net.opti.geocraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class SlateBricksStairs extends StairsBlock {

    public SlateBricksStairs(BlockState state, Properties properties) {
        super(state, properties.hardnessAndResistance(4F,3F));
    }
}
