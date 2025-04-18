package tk.ndev.ediblemod.items.objects;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class ModSword extends SwordItem {

	public ModSword(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
		super(tier, attackDamageIn, attackSpeedIn, new Properties()
	    		.group(ItemGroup.COMBAT)
	    );
	}

}
