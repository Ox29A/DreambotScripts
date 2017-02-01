package com.ijabba.Scripts.Woodcutting;

import com.ijabba.Scripts.Woodcutting.nodes.CuttingNode;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.impl.TaskScript;

import java.awt.*;

/**
 * Created by iJabba on 01/02/17.
 */
public class iCutter extends TaskScript {

    @Override
    public void onStart() {
        addNodes(new CuttingNode());
        setFailLimit(-1);
    }

    @Override
    public void onExit() {

    }

    @Override
    public void onPaint(Graphics graphics) {
        super.onPaint(graphics);
    }
}
