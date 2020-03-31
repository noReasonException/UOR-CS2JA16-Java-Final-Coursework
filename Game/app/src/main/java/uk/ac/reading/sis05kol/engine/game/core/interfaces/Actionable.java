package uk.ac.reading.sis05kol.engine.game.core.interfaces;

import android.arch.core.util.Function;

import uk.ac.reading.sis05kol.engine.game.core.interfaces.actions.Action;
import uk.ac.reading.sis05kol.engine.game.core.map.Position;
import uk.ac.reading.sis05kol.engine.game.core.map.path.Path;

public interface Actionable {
    public Action getNextAction(Path p, Function<Position,Position> fromAbsoluteToTileConversion, Function<Position,Position> fromTileToAbsoluteConversion);
}