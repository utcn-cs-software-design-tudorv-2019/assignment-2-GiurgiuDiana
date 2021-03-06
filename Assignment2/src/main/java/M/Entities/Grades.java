package M.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "grades")
public class Grades {
   @Column(name="Grade", nullable = false)
    private int Grade;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="examDate")
    private Date examDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="midtermDate")
    private Date MidtermDate;
    @Column(name="Midterm")
    private int MidtermGrade;
    @Column(name="Exam")
    private int exam;
    @ManyToOne
    @JoinColumn(name = "idStudent", referencedColumnName = "idStudent")
    @NotNull
    private Student student;

    @ManyToOne
    @JoinColumn(name = "courseID", referencedColumnName = "id")
    @NotNull
    private Course courses;

    public Grades(int grade, Date examDate, Date midtermDate, int midtermGrade, int exam, Student studentID, Course coursesID) {
        Grade = grade;
        this.examDate = examDate;
        MidtermDate = midtermDate;
        MidtermGrade = midtermGrade;
        this.exam = exam;
        this.student = studentID;
        this.courses = coursesID;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Date getMidtermDate() {
        return MidtermDate;
    }

    public void setMidtermDate(Date midtermDate) {
        MidtermDate = midtermDate;
    }

    public int getMidtermGrade() {
        return MidtermGrade;
    }

    public void setMidtermGrade(int midtermGrade) {
        MidtermGrade = midtermGrade;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student studentID) {
        this.student = studentID;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course coursesID) {
        this.courses= coursesID;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "Grade=" + Grade +
                ", examDate=" + examDate +
                ", MidtermDate=" + MidtermDate +
                ", MidtermGrade=" + MidtermGrade +
                ", exam=" + exam +
                ", student=" + student +
                ", courses=" + courses +
                '}';
    }
}
