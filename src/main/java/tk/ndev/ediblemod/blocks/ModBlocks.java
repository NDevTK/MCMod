 package tk.ndev.ediblemod.blocks;
 
 import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tk.ndev.ediblemod.Config;
import tk.ndev.ediblemod.blocks.objects.AlarmBlock;
import tk.ndev.ediblemod.blocks.objects.ModBlock;
import tk.ndev.ediblemod.blocks.objects.Nova;
import tk.ndev.ediblemod.blocks.objects.ModSand;
 
 
 public class ModBlocks
 {
	 public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Config.MODID);
	 
	 public static final RegistryObject<Block> chiseledhorustone = BLOCKS.register("chiseledhorustone", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> crackedhorustonebricks = BLOCKS.register("crackedhorustonebricks", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deephorustone = BLOCKS.register("deephorustone", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deephorustonecoalore = BLOCKS.register("deephorustonecoalore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deephorustoneironore = BLOCKS.register("deephorustoneironore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustone = BLOCKS.register("deeperhorustone", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonealuminumore = BLOCKS.register("deeperhorustonealuminumore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonecoalore = BLOCKS.register("deeperhorustonecoalore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonecopperore = BLOCKS.register("deeperhorustonecopperore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));	 
	 public static final RegistryObject<Block> deeperhorustonegoldore = BLOCKS.register("deeperhorustonegoldore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustoneironore = BLOCKS.register("deeperhorustoneironore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonelapisore = BLOCKS.register("deeperhorustonelapisore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonerubyore = BLOCKS.register("deeperhorustonerubyore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonesaltore = BLOCKS.register("deeperhorustonesaltore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonesiliconore = BLOCKS.register("deeperhorustonesiliconore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonetinore = BLOCKS.register("deeperhorustonetinore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> deeperhorustonetopazore = BLOCKS.register("deeperhorustonetopazore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));	 
	 public static final RegistryObject<Block> drixwood = BLOCKS.register("drixwood", () -> new ModBlock(Material.WOOD, SoundType.WOOD, 2.0F));
	 public static final RegistryObject<Block> durdrumwood = BLOCKS.register("durdrumwood", () -> new ModBlock(Material.WOOD, SoundType.WOOD, 2.0F));	 
	 public static final RegistryObject<Block> durdrumwoodplanks = BLOCKS.register("durdrumwoodplanks", () -> new ModBlock(Material.WOOD, SoundType.WOOD, 2.0F));
	 public static final RegistryObject<Block> flemfrywood = BLOCKS.register("flemfrywood", () -> new ModBlock(Material.WOOD, SoundType.WOOD, 2.0F));
	 public static final RegistryObject<Block> horustonebricks = BLOCKS.register("horustonebricks", () -> new ModBlock(Material.ROCK, SoundType.STONE, 2.0F));
	 public static final RegistryObject<Block> horustonefurnace = BLOCKS.register("horustonefurnace", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> horustonepillar = BLOCKS.register("horustonepillar", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));	 
	 public static final RegistryObject<Block> horustone = BLOCKS.register("horustone", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> mossyhorustonebricks = BLOCKS.register("mossyhorustonebricks", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> rubyblock = BLOCKS.register("rubyblock", () -> new ModBlock(Material.IRON, SoundType.STONE, 1.5F));	 
	 public static final RegistryObject<Block> sandofseth = BLOCKS.register("sandofseth", () -> new ModSand(0.5F));
	 public static final RegistryObject<Block> seashellblockhorus = BLOCKS.register("seashellblockhorus", () -> new ModBlock(Material.CORAL, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> topazblock = BLOCKS.register("topazblock", () -> new ModBlock(Material.IRON, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> supaspleefblock = BLOCKS.register("supaspleefblock", () -> new ModBlock(Material.IRON, SoundType.STONE, 0.0F));
	 public static final RegistryObject<Block> hojirleaves = BLOCKS.register("hojirleaves", () -> new ModBlock(Material.LEAVES, SoundType.PLANT, 0.2F));	 
	 public static final RegistryObject<Block> delexdust = BLOCKS.register("delexdust", () -> new ModBlock(Material.SAND, SoundType.SAND, 0.5F));
	 public static final RegistryObject<Block> petrifiedwood = BLOCKS.register("petrifiedwood", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> soulblockone = BLOCKS.register("soulblockone", () -> new ModBlock(Material.ICE, SoundType.SLIME, 2.0F));
	 public static final RegistryObject<Block> delexbrick = BLOCKS.register("delexbrick", () -> new ModBlock(Material.ROCK, SoundType.STONE, 1.5F));
	 public static final RegistryObject<Block> saikraore = BLOCKS.register("saikraore", () -> new ModBlock(Material.ROCK, SoundType.STONE, 2F));
	 public static final RegistryObject<Block> saikrablock = BLOCKS.register("saikrablock", () -> new ModBlock(Material.ROCK, SoundType.STONE, 2F));
	 public static final RegistryObject<Block> alarmblock = BLOCKS.register("alarmblock", () -> new AlarmBlock(Material.ROCK, SoundType.STONE, 2F));
	 
	 public static final RegistryObject<Block> nova = BLOCKS.register("nova", () -> new Nova());
	 
 }