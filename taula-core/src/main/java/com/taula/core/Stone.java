package com.taula.core;


public class Stone {
  private Color color;

  public Stone(Color color) {
    this.color = color;
  }

  public boolean isColor(Color color) {
    return this.color == color;
  }
}
