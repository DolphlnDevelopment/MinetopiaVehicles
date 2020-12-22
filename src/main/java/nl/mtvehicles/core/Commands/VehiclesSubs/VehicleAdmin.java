package nl.mtvehicles.core.Commands.VehiclesSubs;

import nl.mtvehicles.core.Infrastructure.Models.MTVehicleSubCommand;
import nl.mtvehicles.core.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class VehicleAdmin extends MTVehicleSubCommand {
    @Override
    public boolean execute(CommandSender sender, Command cmd, String s, String[] args) {
        if (!isPlayer) {
            sendMessage(Main.messagesConfig.getMessage("notForConsole"));
            return false;
        }
        if (!checkPermission("mtvehicles.admin")) return true;
        sendMessage("");
        sendMessage("&2/vehicle &aedit &f- &2" + Main.messagesConfig.getMessage("adminEdit"));
        sendMessage("&2/vehicle &amenu &f- &2" + Main.messagesConfig.getMessage("adminMenu"));
        sendMessage("&2/vehicle &abenzine &f- &2" + Main.messagesConfig.getMessage("adminBenzine"));
        sendMessage("&2/vehicle &arestore &f- &2" + Main.messagesConfig.getMessage("adminRestore"));
        sendMessage("&2/vehicle &areload &f- &2" + Main.messagesConfig.getMessage("adminReload"));
        sendMessage("&2/vehicle &agivevoucher &f- &2" + Main.messagesConfig.getMessage("adminGivevoucher"));
        sendMessage("&2/vehicle &agivecar &f- &2" + Main.messagesConfig.getMessage("adminGivecar"));
        sendMessage("&2/vehicle &asetowner &f- &2" + Main.messagesConfig.getMessage("adminSetowner"));
        sendMessage("&2/vehicle &aupdate &f- &2" + Main.messagesConfig.getMessage("adminUpdate"));
        sendMessage("&2/vehicle &adelete &f- &2" + Main.messagesConfig.getMessage("adminDelete"));
        return true;
    }
}
