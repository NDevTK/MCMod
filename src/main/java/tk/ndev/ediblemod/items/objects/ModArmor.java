package tk.ndev.ediblemod.items.objects;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemGroup;

public class ModArmor extends ArmorItem {

	public ModArmor(IArmorMaterial materialIn, EquipmentSlotType slot) {
	     super(materialIn, slot, new Properties()
	    		.group(ItemGroup.COMBAT)
	     );
	}

}
