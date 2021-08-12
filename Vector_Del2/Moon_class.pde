class Moon {
  PVector location;
  PVector velocity;
  PVector acceleration;
  float topspeed;
  
  Moon() {
    location = new PVector(300, 450);
    velocity = new PVector(10, 12);
    topspeed = 1000;
  }
  
  void update(Mover m) {
    PVector centerScreen = new PVector(m.location.x, m.location.y);
    PVector dir = PVector.sub(centerScreen, location);
    dir.normalize();
    //dir.mult(0.5);
    acceleration = dir;

    acceleration.mult(5);
    velocity.add(acceleration);
    velocity.limit(topspeed);
    location.add(velocity);
  }
  
  void display() {
    strokeWeight(2);
    fill(0);
    ellipse(location.x,location.y, 5, 5);
  }
}
