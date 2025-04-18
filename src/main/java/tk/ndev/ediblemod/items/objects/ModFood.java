 package tk.ndev.ediblemod.items.objects;
 
 import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
 
 public class ModFood extends Item {
		public ModFood(int hunger) {
			super(new Item.Properties()
				.group(ItemGroup.FOOD)
				.food((new Food.Builder())
						.setAlwaysEdible()
						.hunger(hunger)
						.build()
				)
			);

		}
   
 }