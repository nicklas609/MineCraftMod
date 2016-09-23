package dk.codingpirates.minecraft.mods;

import dk.codingpirates.minecraft.mods.CodingPiratesMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Morblock extends Block {
	
	private final String name = "Morblock";

	public Morblock() {
		super(Material.ROCK);
		// GameRegistry.registerBlock(this, name);
		setUnlocalizedName(CodingPiratesMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		// Hvor lang tid det skal tage for at ødelægge en Block 
		setHardness(40F);
		// Hvad du skal bruge for at få Blocken
		setHarvestLevel("pickaxe", 2);
	}

	public String getName() {
		return name;
	}

}
