//part a)

public int countWhitePixels() {
  int count = 0;
  for(int i = 0; i < pixelValues.length; i++) {
    for(int j = 0; j < pixelValues[0].length; j++) {
      if(pixelValues[i][j] == WHITE) {
        count++;
      }
    }
  }
  return count;
}

//part b)

public void processImage() {
  for(int i = 0; i < pixelValues.length - 2; i++) {
    for(int j = 0; j < pixelValues[0].length - 2; j++) {
      if(pixelValues[i][j] - pixelValues[i + 2][j + 2] < BLACK) {
        pixelValues[i][j] = pixelValues[i][j] - pixelValues[i + 2][j + 2];
      } else {
        pixelValues[i][j] = BLACK;
      }
    }
  }
}
