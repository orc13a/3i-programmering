class BinaryTree {
  float nodeSize = 10;

  void tegnGren(float x, float y, float h, float v) {
    PVector p = new PVector(x, h + nodeSize);

    p.rotate(v);
    line(x, y, p.x, p.y);
    circle(x, y, nodeSize);

    //if (h < 100) {
    //  p.rotate(v);
    //  line(x, y, p.x, p.y);
    //  circle(x, y, nodeSize);
    //} else {
    //  line(x, y, x, p.y);
    //  circle(x, y, nodeSize);
    //}

    if (h > 80) {
      tegnGren(x, (y + h), h - 20, (v - (PI/8)));
      tegnGren(x, (y + h), h - 20, (v + (PI/8)));
    }
  }
}
