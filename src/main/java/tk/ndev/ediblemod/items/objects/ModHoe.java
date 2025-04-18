package tk.ndev.ediblemod.items.objects;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;

public class ModHoe extends HoeItem {

	public ModHoe(IItemTier tier, float attackSpeedIn) {
		super(tier, attackSpeedIn, new Properties()
	    		.group(ItemGroup.TOOLS)
	    );
	}

}
