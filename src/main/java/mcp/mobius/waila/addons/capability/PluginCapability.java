package mcp.mobius.waila.addons.capability;

import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.IWailaRegistrar;
import mcp.mobius.waila.api.WailaPlugin;
import net.minecraft.tileentity.TileEntity;

@WailaPlugin
public class PluginCapability implements IWailaPlugin {

    @Override
    public void register(IWailaRegistrar registrar) {
        registrar.registerProvider(HUDHandlerTank.INSTANCE, TileEntity.class);
        registrar.registerProvider(HUDHandlerTank.INSTANCE, TileEntity.class);

        registrar.addConfig("Capability", "capability.tankinfo", false);
    }
}