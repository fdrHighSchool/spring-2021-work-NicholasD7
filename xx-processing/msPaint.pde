void setup() {
  background(200);
  noStroke();
  size(1800, 1000);
}
int size = 40;
color c = #000000;

void draw() {
  textSize(20);
  fill(0);
  text("press '1' '2' '3' '4' or '5' for size of square to draw with", 10, 30);
  text("press 'r' for red, 'b' for blue, and 'g' for green", 10, 50);

  if (keyPressed) {
    //size
    if (key == '1') {
      size = 20;
    }
     if (key == '2') {
      size = 40;
    }
     if (key == '3') {
      size = 60;
    }
     if (key == '4') {
      size = 80;
    }
    if (key == '5') {
      size = 100;
    }
    //color
    if (key == 'r') {
      c = #ff0000;
    }
    if (key == 'g') {
      c = #00ff00;
    }
    if (key == 'b') {
      c = #0002ff;
    }

    if (key == 'c') {
      background(200);
    }
  }
  if (mousePressed == true) {
    fill(c, 60);
    circle(pmouseX, pmouseY, size);
  }
}
