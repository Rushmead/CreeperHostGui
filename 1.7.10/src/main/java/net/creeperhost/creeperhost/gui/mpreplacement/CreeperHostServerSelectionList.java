package net.creeperhost.creeperhost.gui.mpreplacement;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.ServerListEntryNormal;
import net.minecraft.client.gui.ServerSelectionList;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;

import java.util.List;

/**
 * Created by Aaron on 19/05/2017.
 */
public class CreeperHostServerSelectionList extends ServerSelectionList
{

    private List<ServerListEntryNormal> ourList;
    private GuiMultiplayer ourParent;

    public CreeperHostServerSelectionList(GuiMultiplayer ownerIn, Minecraft mcIn, int widthIn, int heightIn, int topIn, int bottomIn, int slotHeightIn)
    {
        super(ownerIn, mcIn, widthIn, heightIn, topIn, bottomIn, slotHeightIn);
        ourParent = ownerIn;
    }

    @Override
    public void func_148195_a(ServerList p_148195_1_) {
        super.func_148195_a(p_148195_1_);
        ourList.add(new CreeperHostEntry(ourParent, new ServerData("","127.0.0.1", false), true));
    }

    public void replaceList(List list) {
        ourList = list;
        ourList.add(new CreeperHostEntry(ourParent, new ServerData("","127.0.0.1", false), true));
    }

}
