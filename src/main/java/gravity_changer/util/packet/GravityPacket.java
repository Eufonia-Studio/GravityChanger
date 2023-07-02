package gravity_changer.util.packet;

import gravity_changer.api.RotationParameters;
import gravity_changer.util.GravityComponent;
import net.minecraft.network.FriendlyByteBuf;

public abstract class GravityPacket {
    public abstract void write(FriendlyByteBuf buf);
    public abstract void run(GravityComponent gc);
    public abstract RotationParameters getRotationParameters();
}
