 package tk.ndev.ediblemod.items.objects;
 
 import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import tk.ndev.ediblemod.Utils;
 
 public class LevitationSword extends SwordItem {
	public LevitationSword(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
		 super(tier, attackDamageIn, attackSpeedIn,  new Properties()
		    		.group(ItemGroup.COMBAT)
		);
	}
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		 target.addPotionEffect(new EffectInstance(Effects.LEVITATION, Utils.SECS2TICKS(10), 1));
		 return true;
	}
 }