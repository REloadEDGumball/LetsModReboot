package com.gumball.letsmodreboot.init;

import com.gumball.letsmodreboot.item.ItemLMRB;
import com.gumball.letsmodreboot.item.ItemMapleLeaf;
import com.gumball.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
