 package tk.ndev.ediblemod.blocks.objects;
 
 import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
 
 public class ModBlock extends Block {
   public ModBlock(Material materialIn, SoundType sound, float hardness) {
     super(Properties.create(materialIn)
    		 .sound(sound)
             .hardnessAndResistance(hardness)
     );
   }
 }