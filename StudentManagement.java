public class StudentManagement {
            private boolean sameGroup( Student v , Student u ) {
                return u.getGroup().equals(v.getGroup());
            }
            if(Sm.sameGroup(s1, s2))
                System.out.print("hoc sinh 1 va hoc sinh 2 cung lop");
            else
                System.out.print("hoc sinh 1 va hoc sinh 2 khong cung lop");
            if(Sm.sameGroup(s1, s3))
                System.out.print("hoc sinh 1 va hoc sinh 3 cung lop");
            else
                System.out.print("hoc sinh 1 va hoc sinh 3 khong cung lop");
            if(Sm.sameGroup(s2, s3))
                System.out.print("hoc sinh 2 va hoc sinh 3 cung lop");
            else
                System.out.print("hoc sinh 2 va hoc sinh 3 khong cung lop");

            static Student[] listStudent = null;
        public static boolean sameGroup(Student u, Student v) {
            return u.getGroup() == v.getGroup();
        }

        public static void studentsByGroup() {
            for (int groupNo = 0, i = 0; i < listStudent.length; ++i) {
                boolean newGroup = true;
                for (int j = 0; j < i; ++j)
                    if (sameGroup(listStudent[i], listStudent[j])) {
                        newGroup = false;
                        break;
                    }
                    if (newGroup) {
                        System.out.println("Group " + ++groupNo + ":");
                        for (int studentNo = 0, j = i; j < listStudent.length; ++j)
                            if (sameGroup(listStudent[i], listStudent[j])) {
                                System.out.println("Student " + ++studentNo + ":");
                                listStudent[j].getInfo();
                            }
                    System.out.println();
                    }
            }return;
        }

        public static void removeStudent(String id) {
            int l = listStudent.length;
            for (int i = 0; i < l; ++i) {
                while (listStudent[i] != null && listStudent[i].getId() == id) {
                    --l;
                    for (int j = i; j < l; ++j)
                        listStudent[j] = listStudent[j + 1];
                    listStudent[l] = null;
                }
            }

            if (l == 0)
                listStudent = null;
            else {
                Student[] a = new Student[l];
                System.arraycopy(listStudent, 0, a, 0, l);
                listStudent = a;
            }

            return;
        }
        public static void main(String[] args, Object v, Object u){
            StudentManagement Sm = new StudentManagement();
            Student student1 = new Student();
            Student student2 = new Student("nguyen phuong hieu", "17020747","17020747@vnu.edu.vn");
            Student student3 = new Student(student1);

            System.out.println(student1.getInfo());
            System.out.println(student2.getInfo());
            System.out.println(student3.getInfo());

            Student s1 = new Student();
            Student s2 = new Student();
            Student s3 = new Student();
            s1.setGroup("K62CE");
            s2.setGroup("K62CJ");
            s3.setGroup("K62CE");
        }
}
