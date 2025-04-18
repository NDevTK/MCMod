 package tk.ndev.ediblemod;
 
 import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import tk.ndev.ediblemod.blocks.ModBlocks;
import tk.ndev.ediblemod.items.ModItems;
import tk.ndev.ediblemod.tiles.ModTiles;

@Mod(Config.MODID)
@Mod.EventBusSubscriber(modid = Config.MODID, bus=Bus.MOD)
 public class EdibleMod
 {	
   public static final Logger logger = LogManager.getLogger(Config.MODID);
   public EdibleMod() {
	   final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	   ModItems.ITEMS.register(bus);
	   ModBlocks.BLOCKS.register(bus);
	   ModTiles.TILES.register(bus);
	   MinecraftForge.EVENT_BUS.register(this);
   }
	
   @SubscribeEvent
   public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
	   final IForgeRegistry<Item> registry = event.getRegistry();
	   ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
		   final Item.Properties properties = new Item.Properties();
		   properties.group(ItemGroup.BUILDING_BLOCKS);
		   final BlockItem blockItem = new BlockItem(block, properties);
		   blockItem.setRegistryName(block.getRegistryName());
		   registry.register(blockItem);
		   });
	   }
 }