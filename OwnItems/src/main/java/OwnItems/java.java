package OwnItems;
/*
Author: Luke | Luhe_Xx07_
Discord: Luke | Luhe_Xx07_#7048
 */
import OwnItems.commands.items;
import org.bukkit.plugin.java.JavaPlugin;

public final class java extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("item").setExecutor(new items());

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled");
    }
}
