class Mover {
  PVector location;
  PVector velocity;
  PVector acceleration;
  float topspeed;
  
  Mover() {
    location = new PVector(300, 450);
    velocity = new PVector(10, 0);
    topspeed = 100;
  }
  
  void update() {
    PVector centerScreen = new PVector(width / 2, height / 2);
    PVector dir = PVector.sub(centerScreen, location);
    dir.normalize();
    //dir.mult(0.5);
    acceleration = dir;

    velocity.add(acceleration);
    velocity.limit(topspeed);
    location.add(velocity);
  }
  
  void display() {
    strokeWeight(2);
    fill(255);
    ellipse(location.x,location.y,16,16);
  }
}
