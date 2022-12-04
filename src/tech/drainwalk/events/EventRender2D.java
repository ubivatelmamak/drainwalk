package tech.drainwalk.events;

import com.darkmagician6.eventapi.events.Event;
import net.minecraft.client.gui.ScaledResolution;

public class EventRender2D implements Event {

    private ScaledResolution sr;

    public EventRender2D(ScaledResolution sr) {
        this.sr = sr;
    }

    public ScaledResolution getScaledResolution() {
        return sr;
    }

    public void setScaledResolution(ScaledResolution sr) {
        this.sr = sr;
    }
}
