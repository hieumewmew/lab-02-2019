public class Student {
    private String name , id , group , email ;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return "Name: " + name + ". MSSV: " + id + ". Group: " + group + ". Email: " + email;
    }
    Student student1 = new Student("Nguyen Van An" , "17020001" , "K62CC" , "17020001@vnu.edu.vn");
    public Student() {
        name = "Student";
        id="000";
        group="K62CB";
        email = "uet@vnu.edu.vn";
    }
    public Student(String i , String j , String k){
        name = i ;
        id = j;
        email = k;
        group = "K62CB";
    }
    public Student( Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}
