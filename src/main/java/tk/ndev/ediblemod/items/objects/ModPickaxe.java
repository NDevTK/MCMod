package tk.ndev.ediblemod.items.objects;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class ModPickaxe extends PickaxeItem {

	public ModPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn) {
		super(tier, attackDamageIn, attackSpeedIn, new Properties()
	    		.group(ItemGroup.TOOLS)
	    );
	}

}
