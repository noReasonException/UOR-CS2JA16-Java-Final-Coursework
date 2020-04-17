package uk.ac.reading.sis05kol.engine.game.core.object.drawables.ghost;

import android.content.Context;

import java.util.Arrays;

import uk.ac.reading.sis05kol.engine.game.core.info.LevelInfo;
import uk.ac.reading.sis05kol.engine.game.core.map.Position;
import uk.ac.reading.sis05kol.engine.game.core.object.animator.DrawableAnimator;
import uk.ac.reading.sis05kol.engine.menuanimators.elements.Element;

public class RedGhost extends Ghost {
    public RedGhost(Context context, LevelInfo levelInfo, Position absolutePosition) {
        super(context, levelInfo, absolutePosition,Arrays.asList(
                new DrawableAnimator(Element.GHOSTREDDOWN, context, levelInfo),
                new DrawableAnimator(Element.GHOSTREDUP, context, levelInfo),
                new DrawableAnimator(Element.GHOSTREDRIGHT, context, levelInfo),
                new DrawableAnimator(Element.GHOSTREDLEFT, context, levelInfo)),6);
    }
}
