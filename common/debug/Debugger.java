package mods.communityMod.common.debug;

import mods.communityMod.common.CommunityMod;

public class Debugger 
{
	
	public static void sendDebugMessage(String args)
	{
		if(CommunityMod.debug)
		{
			System.out.println("[DEBUG] " + args);
		}
	}

}
