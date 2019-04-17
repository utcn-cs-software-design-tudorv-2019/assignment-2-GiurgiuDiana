package project.M.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="address", nullable = true)
    private String address;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="age")
    private Integer age;
    @Column(name="passsword",nullable = false)
    private String password;

    //public Teacher(Integer idTask, String description, String filepath, String str, String ema, Integer it) {


  //  }


        public Teacher(int id, String name, String password, String address, String email, int age) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.email = email;
            this.age = age;
            this.password = password;
        }

        public Teacher( String name,String password, String address, String email, int age) {
            this.name = name;
            this.address = address;
            this.email = email;
            this.age = age;
                this.password = password;
        }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}