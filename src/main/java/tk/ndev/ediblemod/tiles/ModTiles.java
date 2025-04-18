package tk.ndev.ediblemod.tiles;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tk.ndev.ediblemod.Config;
import tk.ndev.ediblemod.blocks.ModBlocks;

public class ModTiles {
	public static final DeferredRegister<TileEntityType<?>> TILES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Config.MODID);
	
	public static final RegistryObject<TileEntityType<AlarmTile>> alarmtile = TILES.register("alarmtile", () -> TileEntityType.Builder.create(AlarmTile::new, ModBlocks.alarmblock.get()).build(null));

}
