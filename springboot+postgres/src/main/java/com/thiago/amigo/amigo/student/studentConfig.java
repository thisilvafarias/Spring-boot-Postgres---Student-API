package com.thiago.amigo.amigo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student thiago = new Student(
                    "thiago",
                    "thiago@gmail.com",
                    LocalDate.of(1988, Month.JANUARY,22)
            );

            Student Benedicte = new Student(
                    "bene",
                    "bene@gmail.com",
                    LocalDate.of(1993, Month.JANUARY,22)
            );

            studentRepository.saveAll(
                    List.of(thiago, Benedicte)
            );
        };
    }
}
