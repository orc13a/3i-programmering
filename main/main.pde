// Fokuspunkter_PVector_og_Forces_v2.pdf (18/08/21)

// Til spørgsmål 3 ---------
PVector location;
PVector velocity;
PVector gravity;
float mass;
// -------------------------

ArrayList<Ball> allBalls = new ArrayList<Ball>();

Ball ball1;

void setup() {
  size(600, 600);
  smooth(8);

  // Til spørgsmål 3
  location = new PVector(100, 0);
  velocity = new PVector(0, 0);
  gravity = new PVector(0, 0.1);
  mass = 10.0;
  // -------------------------

  ball1 = new Ball();
}

void draw() {
  clear();
  background(255);

  egenS3();
}

// Spørgsmål 1: Et program består af følgende linjer kode:
// Hvorfor virker programmet ikke?
void s1() {
  PVector p; // Der er ikke blevet dannet en vector (ingen new PVector)
  //p.set(20,20);
}

// Spørgsmål 2: Et andet program består af kode-linjerne:
// Hvad skriver programmet og hvorfor?

// x2 ændres først til 1000 efter at x1 er blivet at til x2
// Variabler tager værdien fra et variable og objekter tager en reference fra hinanden.

void s2() {
  PVector p1 = new PVector(1, 1); //objekter!
  PVector p2 = new PVector(2, 2);
  float x1 = 1; //primitiv data!
  float x2 = 2;
  p1 = p2;
  x1 = x2;
  x2 = 1000; //Nu ændres x2
  p2.x = 1000; //Nu ændres p2.x

  if (p1.x != x1) {
    println("Ja p1.x er nu " + p1.x + " men x1 er stadig " + x1);
    println("Det er godt at vide hvordan objekter fungerer i Java!");
  }
}

// Spørgsmål 3: I et tredje programs “draw funktion” står følgende linje kode, der bruges til at
// Hvordan kan man bruge disse tre vektorer til at simulere tyngdekraft-påvirkning på “bolden”?
void s3() {
  // Tilføj kræfter
  velocity.add(gravity);
  location.add(velocity);

  if (location.y >= height - 10) {
    location.y = height - 5;
  }

  // simulere en bold
  ellipse(location.x, location.y, 10, 10);
}

void egenS3() {
  for (Ball b : allBalls) {
    PVector gravity = new PVector(0, 9.82);
    float c = 1;
    PVector friction = b.velocity.get();
    friction.mult(-1);
    friction.normalize();
    friction.mult(c*(b.mass/10));
    
    b.applyForce(friction);
    b.applyForce(gravity);
    
    b.update();
    b.display();
    b.checkEdge();
  }
}

void mousePressed() {
  allBalls.add(new Ball());
}
