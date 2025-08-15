package kr.sh.joinquitmessage

import kr.sh.joinquitmessage.listener.JoinQuitListener
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(JoinQuitListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
