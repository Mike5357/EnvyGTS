package com.envyful.gts.forge.command;

import com.envyful.api.command.annotate.Child;
import com.envyful.api.command.annotate.Command;
import com.envyful.api.command.annotate.Permissible;
import com.envyful.api.command.annotate.executor.CommandProcessor;
import com.envyful.api.command.annotate.executor.Sender;
import com.envyful.gts.forge.EnvyGTSForge;
import net.minecraft.command.ICommandSource;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;

@Command(
        value = "reload",
        description = "Reloads the configs"
)
@Child
@Permissible("com.envyful.gts.command.reload")
public class ReloadCommand {

    @CommandProcessor
    public void onCommand(@Sender ICommandSource sender, String[] args) {
        EnvyGTSForge.getInstance().loadConfig();
        sender.sendMessage(new StringTextComponent("Reloaded config"), Util.NIL_UUID);
    }
}