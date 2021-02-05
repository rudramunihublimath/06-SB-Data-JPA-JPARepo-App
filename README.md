
This example is for JpaRepository : 

1.  List<Student> studentAge = studentRepo.findAll(Sort.by("studentAge").descending());

2. Student s = new Student();
   s.setStudentName("Rudra");
   Example<Student> example = Example.of(s);
   List<Student> studentAge = studentRepo.findAll(example,Sort.by("studentAge").descending());



----

 Table :
create table cs.student_dtls (
student_id numeric, 
student_age numeric,
student_email varchar(50),
student_name varchar(50),
PRIMARY KEY (`student_id`)

);
commit;
