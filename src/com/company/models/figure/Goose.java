package com.company.models.figure;

import com.company.field.FieldHelp;
import com.company.models.Point;
import com.company.models.Step;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Goose extends AbstractFigure {
    public Goose(@NotNull Point position){
        super(position);
    }

    @Override
    public @NotNull AbstractFigure moveFigure(Point point) {
        return new Goose(point);
    }

    @Override
    public void updatePossibleSteps(){
        super.updatePossibleSteps();

        final List<Point> potentialPoints = new ArrayList<>();

        potentialPoints.add(new Point(currPosition.x() + 1, currPosition.y()));
        potentialPoints.add(new Point(currPosition.x() + 1, currPosition.y() - 1));
        potentialPoints.add(new Point(currPosition.x() , currPosition.y() - 1));
        potentialPoints.add(new Point(currPosition.x() - 1, currPosition.y() - 1));
        potentialPoints.add(new Point(currPosition.x() - 1, currPosition.y()));

        for (var point: potentialPoints){
            if(FieldHelp.canPointBeInField(point)){
                possibleSteps.add(new Step(currPosition, point));
            }
        }

    }


}
