import java.util.Arrays;
public class GradeBook{

  private SuperArray exams;
  private SuperArray participation;

  public array2(int size, int size2){
    this.exams = new int[size];
    this.participation new int[size2];
  }
  public addExam(int score){
    this.exams.add(score);
  }
  public addParticipation(int score2){
    this.participation.add(score2);
  }
  public removeExam(int score3){
    this.exams.remove(score3);
  }
  public removeParticipation(int score4){
    this.participation.remove(score4);
  }
  public String toString(){
    return Arrays.toString(this.exams + this.participation);
  }
}
