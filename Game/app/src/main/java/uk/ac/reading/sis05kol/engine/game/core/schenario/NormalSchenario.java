package uk.ac.reading.sis05kol.engine.game.core.schenario;

import android.content.Context;
import android.os.Handler;

import uk.ac.reading.sis05kol.engine.game.core.info.LevelInfo;
import uk.ac.reading.sis05kol.engine.game.core.interfaces.MapAwareAction;
import uk.ac.reading.sis05kol.engine.game.core.map.Map;
import uk.ac.reading.sis05kol.engine.game.core.map.Position;
import uk.ac.reading.sis05kol.engine.game.core.object.drawables.ghost.BlueGhost;
import uk.ac.reading.sis05kol.engine.game.core.object.drawables.ghost.Ghost;
import uk.ac.reading.sis05kol.engine.game.core.object.drawables.ghost.RedGhost;
import uk.ac.reading.sis05kol.engine.game.core.utils.ChooseGhostUtils;
import uk.ac.reading.sis05kol.engine.game.core.utils.CoordinateSystemUtils;

public class NormalSchenario extends Schenario {
    public static String loggerTag ="NORMALSCHENARIO";

    public NormalSchenario(LevelInfo levelInfo  ) {
        super(levelInfo, new ChooseGhostUtils.GhostPropabilities(
                0.2,0.5,0.2,0.1
        ),150);
    }


}