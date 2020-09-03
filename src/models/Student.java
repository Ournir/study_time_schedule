package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "students")
//@NamedQueries({
//    @NamedQuery(
//            name = "getAllStudents",
//            query = "SELECT s FROM Student AS s ORDER BY s.id DESC"
//            ),
//    @NamedQuery(
//            name = "getStudentsCount",
//            query = "SELECT COUNT(s) FROM Student AS s"
//            ),
//    @NamedQuery(
//            name = "checkRegisteredCode",
//            query = "SELECT COUNT(s) FROM Student AS s WHERE s.code = :code"
//            ),
//    @NamedQuery(
//            name = "checkLoginCodeAndPassword",
//            query = "SELECT s FROM Student AS s WHERE s.delete_flag = 0 AND s.code = :code AND s.password = :pass"
//            )
//})
@Entity
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column(name = "code", nullable = false, unique = true)
//    private String code;
//
//    @Column(name = "name", nullable = false)
//    private String name;
//
//    @Column(name = "password", length = 64, nullable = false)
//   private String password;
//
//    @Column(name = "admin_flag", nullable = false)
//    private Integer admin_flag;

    @Column(name = "start_time", nullable = false)
    private Timestamp start_time;

    @Column(name = "finish_time", nullable = false)
    private Timestamp finish_time;

//    @Column(name = "delete_flag", nullable = false)
//    private Integer delete_flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Integer getAdmin_flag() {
//        return admin_flag;
//    }
//
//    public void setAdmin_flag(Integer admin_flag) {
//        this.admin_flag = admin_flag;
//    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setCreated_at(Timestamp start_time) {
        this.start_time = start_time;
    }

    public Timestamp getFinish_time() {
        return finish_time;
    }

    public void setUpdated_at(Timestamp finish_time) {
        this.finish_time = finish_time;
    }

//    public Integer getDelete_flag() {
//        return delete_flag;
//    }
//
//    public void setDelete_flag(Integer delete_flag) {
//        this.delete_flag = delete_flag;
//    }
}
