package mods.communityMod.common;

import net.minecraft.network.INetworkManager;

import com.google.common.io.ByteArrayDataInput;

public interface IPacketReceiver 
{
	void handlePacketData(INetworkManager manager, String channel, ByteArrayDataInput data);
}
