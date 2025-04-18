 package tk.ndev.ediblemod.items.objects;
 
 import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import tk.ndev.ediblemod.Utils;
 
 public class SuperPear extends Item {
   public SuperPear(int Hunger) {
		super(new Item.Properties()
				.group(ItemGroup.FOOD)
				.food((new Food.Builder())
						.setAlwaysEdible()
						.hunger(Hunger)
						.build()
				)
			);
   }
   
   protected void onFoodEaten(ItemStack stack, World worldIn, PlayerEntity player) {
     if (!worldIn.isRemote) {
       player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, Utils.MINS2TICKS(2), 1));
       player.addPotionEffect(new EffectInstance(Effects.SPEED, Utils.MINS2TICKS(2), 2));
     } 
   }
 }