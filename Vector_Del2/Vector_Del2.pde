// ########################################
// 3.i Oliver C & Gustav
// ########################################
Mover c;
Moon n;

void setup() {
  size(600, 600);
  background(255);
  smooth(8);
  
  c = new Mover();
  n = new Moon();
}

void draw() {
  c.update();
  c.display();
  n.update(c);
  n.display();
}
