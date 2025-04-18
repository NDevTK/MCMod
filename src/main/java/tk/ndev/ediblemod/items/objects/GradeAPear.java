 package tk.ndev.ediblemod.items.objects;
 
 import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
 
 public class GradeAPear extends Item {
	   public GradeAPear(int Hunger) {
			super(new Item.Properties()
					.group(ItemGroup.FOOD)
					.food((new Food.Builder())
							.setAlwaysEdible()
							.hunger(Hunger)
							.fastToEat()
							.build()
					)
				);
	   }
	   
   protected void onFoodEaten(ItemStack stack, World worldIn, PlayerEntity player) {
     if (!worldIn.isRemote) {
       player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 2400, 21));
       player.addPotionEffect(new EffectInstance(Effects.SPEED, 2400, 5));
       player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 2400, 2));
     } 
   }
 }