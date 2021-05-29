void setup() {
  background(220);
  size(840, 840);
  noStroke();
}

void draw() {
  int sizeX = 20;
  int sizeX2 = 20;
  int sizeY = 20;
  int color1 = 0;
  int color2 = 0;
  int color3 = 0;

  for (int x = 0; x < 8; x++) {
    for (int j = 0; j < 10; j++) {
      sizeX = sizeX2;
      for (int i = 0; i < 10; i++) {
        fill(color1, color2, color3);
        rect(sizeX, sizeY, 10, 80);
        sizeX += 10;
        color1 += 25;
      }
      sizeY += 80;
      color1 = 0;
      color2 += 25;
    }
    sizeX2 += 100;
    sizeY = 20;
    color2 = 0;
    color3 += 28;
  }
}
