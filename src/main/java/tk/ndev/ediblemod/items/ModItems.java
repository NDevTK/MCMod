 package tk.ndev.ediblemod.items;
 
 import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tk.ndev.ediblemod.Config;
import tk.ndev.ediblemod.items.objects.GradeAPear;
import tk.ndev.ediblemod.items.objects.KnockbackStick15;
import tk.ndev.ediblemod.items.objects.KnockbackStick30;
import tk.ndev.ediblemod.items.objects.KnockbackStick7;
import tk.ndev.ediblemod.items.objects.LevitationBow;
import tk.ndev.ediblemod.items.objects.LevitationSword;
import tk.ndev.ediblemod.items.objects.ModArmor;
import tk.ndev.ediblemod.items.objects.ModArmorMaterial;
import tk.ndev.ediblemod.items.objects.ModAxe;
import tk.ndev.ediblemod.items.objects.ModFood;
import tk.ndev.ediblemod.items.objects.ModHoe;
import tk.ndev.ediblemod.items.objects.ModItem;
import tk.ndev.ediblemod.items.objects.ModPickaxe;
import tk.ndev.ediblemod.items.objects.ModShovel;
import tk.ndev.ediblemod.items.objects.ModSword;
import tk.ndev.ediblemod.items.objects.SuperPear;
 
 public class ModItems {
	 public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Config.MODID);
	 
	 // Food
	 public static final RegistryObject<Item> superpear = ITEMS.register("superpear", () -> new SuperPear(4));
	 public static final RegistryObject<Item> pear = ITEMS.register("pear", () -> new ModFood(4));
	 
	 // Ruby Tools
	public static final RegistryObject<Item> rubyhoe = ITEMS.register("rubyhoe", () -> new ModHoe(ItemTier.DIAMOND, 0));	 
	public static final RegistryObject<Item> rubyaxe = ITEMS.register("rubyaxe", () -> new ModAxe(ItemTier.DIAMOND, 0, 0));
	public static final RegistryObject<Item> rubypickaxe = ITEMS.register("rubypickaxe", () -> new ModPickaxe(ItemTier.DIAMOND, 0, 0));
	public static final RegistryObject<Item> rubyshovel = ITEMS.register("rubyshovel", () -> new ModShovel(ItemTier.DIAMOND, 0, 0));
	public static final RegistryObject<Item> rubysword = ITEMS.register("rubysword", () -> new ModSword(ItemTier.DIAMOND, 0, 0));
	 
	 // Ruby Armor	 
	 public static final RegistryObject<Item> rubyboots = ITEMS.register("rubyboots", () -> new ModArmor(ModArmorMaterial.RUBY, EquipmentSlotType.FEET));
	 public static final RegistryObject<Item> rubychestplate = ITEMS.register("rubychestplate", () -> new ModArmor(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST));
	 public static final RegistryObject<Item> rubyhelmet = ITEMS.register("rubyhelmet", () -> new ModArmor(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD));
	 public static final RegistryObject<Item> rubyleggings = ITEMS.register("rubyleggings", () -> new ModArmor(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS));
	 
	 // Hojir Armor
	 public static final RegistryObject<Item> hojirboots = ITEMS.register("hojirboots", () -> new ModArmor(ModArmorMaterial.HOJIR, EquipmentSlotType.FEET));
	 public static final RegistryObject<Item> hojirchestplate = ITEMS.register("hojirchestplate", () -> new ModArmor(ModArmorMaterial.HOJIR, EquipmentSlotType.CHEST));
	 public static final RegistryObject<Item> hojirhelmet = ITEMS.register("hojirhelmet", () -> new ModArmor(ModArmorMaterial.HOJIR, EquipmentSlotType.HEAD));
	 public static final RegistryObject<Item> hojirleggings = ITEMS.register("hojirleggings", () -> new ModArmor(ModArmorMaterial.HOJIR, EquipmentSlotType.LEGS));
	 //  Tsorvina Armor
	 public static final RegistryObject<Item> tsorvinahelmet = ITEMS.register("tsorvinahelmet", () -> new ModArmor(ModArmorMaterial.TSORVINA, EquipmentSlotType.FEET));
	 public static final RegistryObject<Item> tsorvinachestplate = ITEMS.register("tsorvinachestplate", () -> new ModArmor(ModArmorMaterial.TSORVINA, EquipmentSlotType.CHEST));
	 public static final RegistryObject<Item> tsorvinaleggings = ITEMS.register("tsorvinaleggings", () -> new ModArmor(ModArmorMaterial.TSORVINA, EquipmentSlotType.HEAD));
	 public static final RegistryObject<Item> tsorvinaboots = ITEMS.register("tsorvinaboots", () -> new ModArmor(ModArmorMaterial.TSORVINA, EquipmentSlotType.LEGS));
	 
	 // Levitation
	 public static final RegistryObject<Item> gradeapear = ITEMS.register("gradeapear", () -> new GradeAPear(5));
	 public static final RegistryObject<Item> levitationsword = ITEMS.register("levisaber", () -> new LevitationSword(ItemTier.DIAMOND, 0, 0));
	 public static final RegistryObject<Item> levitationbow = ITEMS.register("levitationbow", () -> new LevitationBow());
	 
	 public static final RegistryObject<Item> knockbackstick30 = ITEMS.register("knockbackstick30", () -> new KnockbackStick30());
	 public static final RegistryObject<Item> knockbackstick15 = ITEMS.register("knockbackstick15", () -> new KnockbackStick15());
	 public static final RegistryObject<Item> knockbackstick7 = ITEMS.register("knockbackstick7", () -> new KnockbackStick7());
	 
	 // Materials
	 public static final RegistryObject<Item> ruby = ITEMS.register("ruby", () -> new ModItem(ItemGroup.MATERIALS));
	 public static final RegistryObject<Item> topaz = ITEMS.register("topaz", () -> new ModItem(ItemGroup.MATERIALS));    
	 public static final RegistryObject<Item> saikragem = ITEMS.register("saikragem", () -> new ModItem(ItemGroup.MATERIALS));

 }