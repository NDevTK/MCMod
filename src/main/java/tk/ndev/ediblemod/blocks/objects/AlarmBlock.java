 package tk.ndev.ediblemod.blocks.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import tk.ndev.ediblemod.EdibleMod;
import tk.ndev.ediblemod.tiles.ModTiles;
 
 public class AlarmBlock extends Block {
	 public boolean Power = false;
	 public AlarmBlock(Material materialIn, SoundType sound, float hardness) {
	     super(Properties.create(materialIn)
	    		 .sound(sound)
	             .hardnessAndResistance(hardness)
	     );
	}
	 
	 @Override
	 public boolean hasTileEntity(BlockState state) {
		 return true;
	 }
	 
	 @Override
	 public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		 return ModTiles.alarmtile.get().create();
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult p_225533_6_) {
		player.sendStatusMessage(new StringTextComponent("You have been enroled on this Alarm Block!"), true);
		return ActionResultType.SUCCESS;
	}

	   @Override
	   public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		   if (!worldIn.isRemote) {
			          if(!Power == worldIn.isBlockPowered(pos)) {
			        	  Power = worldIn.isBlockPowered(pos);
			        	  if(Power) {
			        		  EdibleMod.logger.info("Power Detected");			        		  
			        	  }
			          }	  
		      }
		   }
	   
	  // TODO 1 add data storage using https://mcforge.readthedocs.io/en/latest/tileentities/tileentity/
 }