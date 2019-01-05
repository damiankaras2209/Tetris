package me.kptmusztarda.tetris;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private static final int SQUARE_SIDE_LENGTH = 30;
    private static final int SPACING = 1;
    private static final int MARGIN_TOP = 40;
    private static final int MARGIN_LEFT = 40;
    private static final int PANEL_BORDER = 1;
    private static int squaresVertically;
    private static int squaresHorizontally;

    public Renderer(int hor, int vert) {
        squaresVertically = vert;
        squaresHorizontally = hor;

        setLayout(null);
        setBackground(new Color(Color.TRANSLUCENT));
        setBounds(MARGIN_LEFT, MARGIN_TOP,
                (PANEL_BORDER * 2) + (squaresHorizontally * SQUARE_SIDE_LENGTH) + ((squaresHorizontally + 1) * SPACING),
                (PANEL_BORDER * 2) + (squaresVertically * SQUARE_SIDE_LENGTH) + ((squaresVertically + 1) * SPACING));
        setBorder(BorderFactory.createMatteBorder(PANEL_BORDER, PANEL_BORDER, PANEL_BORDER, PANEL_BORDER, Color.WHITE));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);

        for(int i = 0; i< squaresHorizontally; i++) {
            for(int j = 0; j< squaresVertically; j++) {
                g.fillRect(
                        (PANEL_BORDER) + (i * SQUARE_SIDE_LENGTH) + ((i + 1) * SPACING),
                        (PANEL_BORDER) + (j * SQUARE_SIDE_LENGTH) + ((j + 1) * SPACING),
                        SQUARE_SIDE_LENGTH,
                        SQUARE_SIDE_LENGTH);
            }
        }
    }
}