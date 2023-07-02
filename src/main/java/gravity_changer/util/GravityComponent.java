package gravity_changer.util;

import gravity_changer.RotationAnimation;
import gravity_changer.api.RotationParameters;
import dev.onyxstudios.cca.api.v3.component.Component;
import dev.onyxstudios.cca.api.v3.component.tick.CommonTickingComponent;
import java.util.ArrayList;
import net.minecraft.core.Direction;

public interface GravityComponent extends Component, CommonTickingComponent {
    //Internal

    void onGravityChanged(Direction oldGravity, Direction newGravity, RotationParameters rotationParameters, boolean initialGravity);

    void updateGravity(RotationParameters rotationParameters, boolean initialGravity);

    //Get

    Direction getGravityDirection();

    Direction getPrevGravityDirection();

    Direction getDefaultGravityDirection();

    double getGravityStrength();
    void setDefaultGravityStrength(double strength);

    double getDefaultGravityStrength();
    Direction getActualGravityDirection();

    ArrayList<Gravity> getGravity();

    boolean getInvertGravity();

    RotationAnimation getGravityAnimation();

    //Set

    void setGravity(ArrayList<Gravity> gravityList, boolean initialGravity);

    void invertGravity(boolean isInverted, RotationParameters rotationParameters, boolean initialGravity);

    void setDefaultGravityDirection(Direction gravityDirection, RotationParameters rotationParameters, boolean initialGravity);

    void addGravity(Gravity gravity, boolean initialGravity);

    void clearGravity(RotationParameters rotationParameters, boolean initialGravity);
}