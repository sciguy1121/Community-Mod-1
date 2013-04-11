package communityMod.common;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class CommonPacketHandler implements IPacketHandler {

	@Override
	public void onPacketData(INetworkManager manager,
			Packet250CustomPayload packet, Player player) {
		try {
			ByteArrayDataInput data = ByteStreams.newDataInput(packet.data);
			int x = data.readInt();
			int y = data.readInt();
			int z = data.readInt();
			int id = data.readInt();
			int l = data.readInt();

			EntityPlayer ePlayer = (EntityPlayer) player;

			if (ePlayer != null) {
				TileEntity tileEntity = ePlayer.worldObj.getBlockTileEntity(x,
						y, z);

				if (tileEntity != null) {
					if (tileEntity instanceof IPacketReceiver) {
						((IPacketReceiver) tileEntity).handlePacketData(
								manager, packet.channel, data);

					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Packet TECommonPacket(TileEntity sender, String channelName,
			int id, int[] sendData) {
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		DataOutputStream data = new DataOutputStream(bytes);

		try {
			data.writeInt(sender.xCoord);
			data.writeInt(sender.yCoord);
			data.writeInt(sender.zCoord);
			data.writeInt(id);
			data.writeInt(3 + sendData.length);

			for (int i = 0; i < sendData.length; i++) {
				data.writeInt(sendData[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = "CommunityMod";
		packet.data = bytes.toByteArray();
		packet.length = packet.data.length;
		packet.isChunkDataPacket = true;
		return packet;
	}
}
