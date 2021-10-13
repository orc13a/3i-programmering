boolean showSmallWork = false;
boolean showBinarytree = false;
int ranInt = int(random(50));

BinaryTree bt;

void setup() {
  size(500, 500);
  
  smooth(8);
  //pixelDensity(2);
  
  rectMode(CENTER);
  textAlign(CENTER);
  
  bt = new BinaryTree();
  
  fill(0);
}

void draw() {
  clear();
  background(255);
  
  if (!showSmallWork && !showBinarytree) {
    textSize(26);
    text("Mini opgaver eller binary træ", width/2, height/2);
    textSize(18);
    text("Tryk 1 eller 2", width/2, (height/2) + 50);
  }
  
  if (showSmallWork) {
    fill(0);
    
    text("#1", 50, (width/4) - 25);
    smallOne(5);
    
    text("#2", 50, (width/2) - 20);
    smallTwo(5);
    
    text("#3", 50, ((width/4) * 3) - 25);
    text(smallTree(3), 50, (width/4) * 3);
  }
  
  if (showBinarytree) {
    fill(0);
    
    bt.tegnGren(width/2, 25, 100, 0);
  }
}

// #1 
// Lav en funktion, der modtager et heltal "n"
// Og udskriver alle hele positive tal fra n og nedefter i din konsol
// Dvs. for n=5 udskrives 5 4 3 2 1
void smallOne(int n) {
  if (n > 0) {
    // print(n, " ");
    text(n + " ", (50 * n), width/4); // ##### Skal printe omvendt!!!
    smallOne(n - 1);
  }
}

// #2
// Lav en funktion, der modtager et heltal "n"
// Og tegner det antal firkanter der svarer til n
void smallTwo(int n) {
  if (n > 0) {
    rect((50 * n), width / 2, 10, 10);
    smallTwo(n - 1);
  }
}

// #3
// Lav en funktion, der modtager et heltal "n"
// Og returnerer fakultet af tallet, dvs !n
// Dvs. for n=3 returneres 3*2*1 dvs. 6
int smallTree(int n) {
  if (n > 0) {
    return n + smallTree(n - 1);
  } else {
    return 0;
  }
}

void keyPressed() {
  if (key == '1') {
    showSmallWork = true;
    showBinarytree = false;
  }
  
  if (key == '2') {
    showSmallWork = false;
    showBinarytree = true;
  }
}
