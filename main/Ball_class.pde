class Ball {
  PVector location;
  PVector velocity;
  PVector acceleration;
  float mass;
  float ballMulti = 2.5;
  
  Ball() {
    location = new PVector(random(0, width), random(0, height) - 100);
    velocity = new PVector(0, 0);
    acceleration = new PVector(0, 0);
    mass = random(2, 50);
  }
  
  void applyForce(PVector force) {
    force.div(mass);
    acceleration.add(force);
  }
  
  void update() {
    velocity.add(acceleration);
    location.add(velocity);
    acceleration.mult(0);
  }
  
  void checkEdge() {
    if (location.x > width) {
      location.x = width;
      velocity.x *= -1;
    } else if (location.x < 0) {
      velocity.x *= -1;
      location.x = 0;
    }
    
    if (location.y >= height) {
      velocity.y *= -1;
      location.y = height;
    }
  }
  
  void display() {
    ellipse(location.x, location.y, mass * ballMulti, mass * ballMulti);
  }
}
