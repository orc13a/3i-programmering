class BinaryTree {
  float nodeSize = 10;

  void tegnGren(PVector beforePos, PVector lastVec, float v) {
    if (lastVec.mag() > 10) {
      PVector p = lastVec.copy();
      p.rotate(v);
      p.mult(0.8);
      PVector newPos = PVector.add(beforePos, p);
      vecLine(beforePos, newPos);
   
      tegnGren(newPos, p, v * 0.8);
      tegnGren(newPos, p, -(v * 0.8));
    }
  }
  
  void vecLine(PVector c, PVector d) {
    line(c.x, c.y, d.x, d.y);
  }
}
