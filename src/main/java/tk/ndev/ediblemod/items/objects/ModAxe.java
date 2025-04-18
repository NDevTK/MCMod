package tk.ndev.ediblemod.items.objects;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;

public class ModAxe extends AxeItem {

	public ModAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn) {
		super(tier, attackDamageIn, attackSpeedIn, new Properties()
	    		.group(ItemGroup.TOOLS)
	    );
	}

}
