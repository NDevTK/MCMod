 package tk.ndev.ediblemod.items.objects;
 
 import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
 
 public class KnockbackStick7 extends Item {
   public KnockbackStick7() {
	   super(new Item.Properties()
				.group(ItemGroup.COMBAT)
	   );
   }
   
   public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
     if (entity instanceof LivingEntity) {
       ((LivingEntity)entity).knockBack(player, 7.0F, player.getPosX() - entity.getPosX(), player.getPosZ() - entity.getPosZ());
     }
     return false;
   }
 }