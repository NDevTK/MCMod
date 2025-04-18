package tk.ndev.ediblemod.items.objects;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tk.ndev.ediblemod.Config;
import tk.ndev.ediblemod.blocks.ModBlocks;
import tk.ndev.ediblemod.items.ModItems;

public enum ModArmorMaterial implements IArmorMaterial {
	
	RUBY(Config.MODID + ":ruby", 5, new int[] { 3, 6, 8, 3 }, 420, SoundEvents.field_226124_Y_, 6.9F, () -> {
		return Ingredient.fromItems(ModItems.ruby.get());
	}),
	
	HOJIR(Config.MODID + ":hojir", 5, new int[] { 2, 6, 7, 2 }, 420, SoundEvents.field_226124_Y_, 6.9F, () -> {
		return Ingredient.fromItems(ModBlocks.hojirleaves.get());
	}),
	
	TSORVINA(Config.MODID + ":tsorvina", 5, new int[] { 2, 6, 7, 2 }, 420, SoundEvents.field_226124_Y_, 6.9F, () -> {
		return Ingredient.fromItems(ModItems.superpear.get());
	});

   private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
   private final String name;
   private final int maxDamageFactor;
   private final int[] damageReductionAmountArray;
   private final int enchantability;
   private final SoundEvent soundEvent;
   private final float toughness;
   private final LazyValue<Ingredient> repairMaterial;

   private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float p_i48533_8_, Supplier<Ingredient> repairMaterialSupplier) {
      this.name = nameIn;
      this.maxDamageFactor = maxDamageFactorIn;
      this.damageReductionAmountArray = damageReductionAmountsIn;
      this.enchantability = enchantabilityIn;
      this.soundEvent = equipSoundIn;
      this.toughness = p_i48533_8_;
      this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
   }

   public int getDurability(EquipmentSlotType slotIn) {
      return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
   }

   public int getDamageReductionAmount(EquipmentSlotType slotIn) {
      return this.damageReductionAmountArray[slotIn.getIndex()];
   }

   public int getEnchantability() {
      return this.enchantability;
   }

   public SoundEvent getSoundEvent() {
      return this.soundEvent;
   }

   public Ingredient getRepairMaterial() {
      return this.repairMaterial.getValue();
   }

   @OnlyIn(Dist.CLIENT)
   public String getName() {
      return this.name;
   }

   public float getToughness() {
      return this.toughness;
   }
}