package com.company.models.figure;

import com.company.models.Point;
import com.company.models.Step;

import java.util.List;

public interface Character {

    List<Step> getPossibleSteps();

    Point getCurrentPosition();
}
