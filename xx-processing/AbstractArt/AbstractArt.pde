void setup() {
  size(1000, 1000);
  background(255);
  noStroke();
}

int Value[] = {-20, -18, -16, -14, -12, -10, -8, -6, -4, -2, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

void draw() {
  if (mousePressed) {
    int ColorR = (int)(Math.random() * 254) + 1;
    int ColorG = (int)(Math.random() * 254) + 1;
    int ColorB = (int)(Math.random() * 254) + 1;
    
    int RandValX = (int)(Math.random() * 19);
    int RandValY = (int)(Math.random() * 19);
    
    fill(ColorR, ColorG, ColorB);
    rect(mouseX, mouseY, Value[RandValX] * 10, Value[RandValY] * 10);
  }
}
