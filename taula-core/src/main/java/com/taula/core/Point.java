package com.taula.core;

import java.util.List;
import java.util.ArrayList;

public class Point {
  private int index;
  private List<Stone> stones;

  public Point(int index, List<Stone> stones) {
    this.index = index;
    this.stones = stones;
  }
}
