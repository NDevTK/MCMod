 package tk.ndev.ediblemod.blocks.objects;
 
 import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
 
 public class ModSand extends FallingBlock {
   public ModSand(float hardness) {
	     super(Properties.create(Material.SAND)
	    		 .sound(SoundType.SAND)
	             .hardnessAndResistance(hardness)
	     );
   }
 }