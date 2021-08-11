// ########################################
// 3.i Oliver C & Gustav
// ########################################
Mover c;

void setup() {
  size(600, 600);
  background(255);
  smooth(8);
  
  c = new Mover();
}

void draw() {
  c.update();
  c.display();
}
