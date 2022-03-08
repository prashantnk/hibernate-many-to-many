package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class CreateCoursesAndStudentsDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

//			add course and student

//			Course c = new Course("Spring Boot ! A to Z ");
//
//			c.addReview(new Review("Good One !"));
//			c.addReview(new Review("Nice Course!"));
//			c.addReview(new Review("You didn't explain very well !"));
//
//			Student joey = new Student("Joey", "Tribianni", "joe@tribianni.com");
//			Student monica = new Student("monica", "geller", "monica@gellar.com");
//
//			c.addStudent(monica);
//			c.addStudent(joey);
//
//			session.save(c);
//
//			session.save(monica);
//			session.save(joey);

//			add more courses to joey 

//			Student joey = session.createQuery("from Student where first_name='Joey'", Student.class).getSingleResult();
//			System.out.println(joey);
//			System.out.println(joey.getCourses());

//			Course java = new Course("java");
//			Course python = new Course("python");
//
//			joey.addCourse(python);
//			joey.addCourse(java);
//
//			session.save(python);
//			session.save(java);
//			System.out.println(joey.getCourses());

//			delete course 

//			Course spring = session.createQuery("from Course where id = 10", Course.class).getSingleResult();
//
//			System.out.println(spring);
//
//			session.delete(spring);

//		delete student

			Student monica = session.get(Student.class, 1);

			session.delete(monica);

			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}

}
