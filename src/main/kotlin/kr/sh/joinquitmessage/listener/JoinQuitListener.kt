package kr.sh.joinquitmessage.listener

import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class JoinQuitListener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val playerName = event.player.displayName()

        event.joinMessage(Component.text("$playerName 님이 서버에 접속하셨습니다."))
    }

    @EventHandler
    fun onPlayerQuit(event: PlayerQuitEvent) {
        val playerName = event.player.displayName()

        event.quitMessage(Component.text("$playerName 님이 서버에서 퇴장하셨습니다."))
    }
}