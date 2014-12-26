package com.taula.core.layout;

import java.util.List;
import java.util.ArrayList;

import com.taula.core.Color;
import com.taula.core.Stone;
import com.taula.core.Layout;

public class BackgammonLayout implements Layout {
  public int points() {
    return 24;
  }

  public List<Stone> stonesForPoint(int index) {
    switch(index) {
      case 0:
        return createPoint(2, Color.WHITE);
      case 23:
        return createPoint(2, Color.BLACK);
      case 5:
        return createPoint(5, Color.WHITE);
      case 18:
        return createPoint(5, Color.BLACK);
      case 7:
        return createPoint(3, Color.WHITE);
      case 16:
        return createPoint(3, Color.BLACK);
      case 11:
        return createPoint(5, Color.WHITE);
      case 12:
        return createPoint(5, Color.BLACK);
      default:
        return new ArrayList<Stone>();
    }
  }

  private List<Stone> createPoint(int count, Color color) {
    List<Stone> stones = new ArrayList<Stone>(count);

    for(int i = 0; i < count; ++i) {
      stones.add(new Stone(color));
    }

    return stones;
  }
}
