package tech.drainwalk.client.module;


import tech.drainwalk.client.module.modules.combat.*;

import tech.drainwalk.client.module.modules.movement.GuiWalkModule;
import tech.drainwalk.client.module.modules.movement.NoDelayModule;
import tech.drainwalk.client.module.modules.overlay.*;
import tech.drainwalk.client.module.modules.render.*;


import java.util.ArrayList;
import java.util.List;

public class ModuleManager {

    public List<Module> getModuleList() {
        return moduleList;
    }


    private final List<Module> moduleList = new ArrayList<>();

    public final MenuModule menuModule;

    public final AuraModule auraModule;


    public final HitBoxModule hitBoxModule;


    public ModuleManager() {
        registerModule(menuModule = new MenuModule());
        registerModule(auraModule = new AuraModule());
        registerModule(new AntiBotModule());
        registerModule(new NoFriendDamageModule());
        registerModule(hitBoxModule = new HitBoxModule());
        registerModule(new KeepSprintModule());
        registerModule(new ReachModule());
        registerModule(new SuperBowModule());
        registerModule(new VelocityModule());
        registerModule(new NoDelayModule());
        registerModule(new WatermarkModule());
        registerModule(new SessionModule());
        registerModule(new TestModule());
        registerModule(new GuiWalkModule());
        registerModule(new FullBrightModule());



    }

    public void registerModule(Module module) {
        moduleList.add(module);
    }

}
