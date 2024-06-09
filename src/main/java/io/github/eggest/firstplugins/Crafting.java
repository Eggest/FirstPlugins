package io.github.eggest.firstplugins;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Crafting {
    public static void TotemCraft(){
        ShapedRecipe sr = new ShapedRecipe(
                new ItemStack(Material.TOTEM_OF_UNDYING,64))
                .shape(" x ","xyx"," x ")
                .setIngredient('x',Material.GOLD_INGOT)
                .setIngredient('y',Material.EMERALD);
        getServer().addRecipe(sr);

    }
    public static void TotemCraft_2(){
        ShapedRecipe sr = new ShapedRecipe(
                new ItemStack(Material.TOTEM_OF_UNDYING,64))
                .shape("x")
                .setIngredient('x',Material.TOTEM_OF_UNDYING);
        getServer().addRecipe(sr);
    }
    public static void AllCraft(){
        TotemCraft();
        TotemCraft_2();
    }

}
