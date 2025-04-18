package tk.ndev.ediblemod.items.objects;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

public class ModShovel extends ShovelItem {

	public ModShovel(IItemTier tier, float attackDamageIn, float attackSpeedIn) {
		super(tier, attackDamageIn, attackSpeedIn, new Properties()
	    		.group(ItemGroup.TOOLS)
	    );
	}

}
