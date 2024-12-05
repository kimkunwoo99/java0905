package _gui.controller;

import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 400;

    public static int FRAME_X = 200;
    public static int FRAME_Y = 100;


    public MainFrame() {
        super("정보검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double sw = dimension.getWidth() ;
        double sh = dimension.getHeight() ;

        int FRAME_X = (int) (sw - FRAME_WIDTH) / 2;
        int FRAME_Y = (int) (sh - FRAME_HEIGHT) / 2;

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView,"Center");


        setLocation(FRAME_X,FRAME_Y);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
