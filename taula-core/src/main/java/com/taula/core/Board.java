package com.taula.core;

import java.util.List;
import java.util.ArrayList;


public class Board {
  private List<Point> points;

  public Board(Layout layout) {
    points = new ArrayList<Point>(layout.points());

    for(int i = 0; i < layout.points(); ++i) {
      points.add(new Point(i, layout.stonesForPoint(i)));
    }
  }

  public void moveStone(Stone stone,
      Point fromPoint,
      Point toPoint) {
  }

  public void bearoffStone(Stone stone,
      Point point) {
  }
}
