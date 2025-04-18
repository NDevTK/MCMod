package tk.ndev.ediblemod.items.objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItem extends Item {

	public ModItem(ItemGroup group) {
		super(new Item.Properties()
			.group(group)
		);
	}

}
