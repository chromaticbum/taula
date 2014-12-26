package com.taula.core;

import java.util.List;

public interface Layout {
  int points();
  List<Stone> stonesForPoint(int index);
}
