
package net.mcreator.myfirstmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.myfirstmod.MyfirstmodModElements;

@MyfirstmodModElements.ModElement.Tag
public class CursedIronPickaxeItem extends MyfirstmodModElements.ModElement {
	@ObjectHolder("myfirstmod:cursed_iron_pickaxe")
	public static final Item block = null;
	public CursedIronPickaxeItem(MyfirstmodModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("cursed_iron_pickaxe"));
	}
}
