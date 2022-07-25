package OwnItems.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class items implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("server.items")){
            Player player = (Player) sender;
            switch(args[0]){
                case "sword":
                    ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
                ItemMeta meta1 = sword.getItemMeta();
                meta1.setDisplayName("§2Schwert §e§lCountry§8§lCrafts");
                meta1.setUnbreakable(true);
                    ArrayList<String> list = new ArrayList<>();
                    list.add("");
                    list.add("§cLegendär");
                    list.add("");
                    meta1.setLore(list);
                    meta1.addEnchant(Enchantment.KNOCKBACK,2, true);
                    meta1.addEnchant(Enchantment.MENDING, 3, true);
                sword.setItemMeta(meta1);
                sender.sendMessage("§e§lCountry§8§lCraft §7» §cDu hast das Schwert erhalten!");
                player.getInventory().addItem(sword);
                break;
                case "shovel":
                    ItemStack shovel = new ItemStack(Material.DIAMOND_SHOVEL, 1);
                    ItemMeta meta2 = shovel.getItemMeta();
                    meta2.setDisplayName("§2Schaufel §e§lCountry§8§lCrafts");
                    meta2.setUnbreakable(true);
                    ArrayList<String> list1 = new ArrayList<>();
                    list1.add("");
                    list1.add("§cLegendär");
                    list1.add("");
                    meta2.setLore(list1);
                    meta2.addEnchant(Enchantment.SILK_TOUCH,2, true);
                    meta2.addEnchant(Enchantment.VANISHING_CURSE, 3, true);
                    shovel.setItemMeta(meta2);
                    sender.sendMessage("§e§lCountry§8§lCraft §7» §cDu hast die Schaufel erhalten!");
                    player.getInventory().addItem(shovel);
                    break;
                case "pickaxe":
                    ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                    ItemMeta meta3 = pickaxe.getItemMeta();
                    meta3.setDisplayName("§2Spitzhacke §e§lCountry§8§lCrafts");
                    meta3.setUnbreakable(true);
                    ArrayList<String> list2 = new ArrayList<>();
                    list2.add("");
                    list2.add("§cLegendär");
                    list2.add("");
                    meta3.setLore(list2);
                    meta3.addEnchant(Enchantment.DURABILITY,5, true);
                    meta3.addEnchant(Enchantment.SILK_TOUCH, 3, true);
                    pickaxe.setItemMeta(meta3);
                    sender.sendMessage("§e§lCountry§8§lCraft §7» §cDu hast die Spitzhacke erhalten!");
                    player.getInventory().addItem(pickaxe);
                    break;
                case "axe":
                    ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
                    ItemMeta meta4 = axe.getItemMeta();
                    meta4.setDisplayName("§2Axt §e§lCountry§8§lCrafts");
                    meta4.setUnbreakable(true);
                    ArrayList<String> list3 = new ArrayList<>();
                    list3.add("");
                    list3.add("§cLegendär");
                    list3.add("");
                    meta4.setLore(list3);
                    meta4.addEnchant(Enchantment.VANISHING_CURSE,2, true);
                    meta4.addEnchant(Enchantment.DURABILITY, 4, true);
                    axe.setItemMeta(meta4);
                    sender.sendMessage("§e§lCountry§8§lCraft §7» §cDu hast die Axt erhalten!");
                    player.getInventory().addItem(axe);
                    break;
                default:
                    sender.sendMessage("§e§lCountry§8§lCraft §7» §cNutze: /item [axe, shovel, sword, pickaxe].");

            }
        }else{
            sender.sendMessage("§e§lCountry§8§lCraft §7» §cDazu hast du keine Rechte.");
        }
        return true;
    }
}
