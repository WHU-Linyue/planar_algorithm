package com.huifer.planar.aset.view.base;

import org.locationtech.jts.io.ParseException;

import javax.swing.*;
import java.awt.*;

/**
 * <p>Title : FrameContext </p>
 * <p>Description : 显示内容</p>
 *
 * @author huifer
 * @date 2019-01-15
 */
public class FrameContext extends JPanel implements Aframe {

    @Override
    public void drawing(Graphics g) throws ParseException {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            drawing(g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
