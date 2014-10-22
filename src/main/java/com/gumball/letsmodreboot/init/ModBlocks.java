package com.gumball.letsmodreboot.init;

import com.gumball.letsmodreboot.block.BlockFlag;
import com.gumball.letsmodreboot.block.BlockLMRB;
import com.gumball.letsmodreboot.reference.Names;
import com.gumball.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }
}
