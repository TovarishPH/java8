package com.ph.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsTeste {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
//		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//		
//		cursos.forEach(System.out::println);
		
//		cursos.sort(new Comparator<Curso>() {
//
//			@Override
//			public int compare(Curso c1, Curso c2) {
//				if(c1.getAlunos() > c2.getAlunos()) return -1;
//				if(c1.getAlunos() < c2.getAlunos()) return 1;
//				return 0;
//			}
//		});
		
//		cursos.forEach(new Consumer<Curso>() {
//
//			@Override
//			public void accept(Curso c) {
//				System.out.println(c);
//			}
//		});
		
//		Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
//		streamDeCurso.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			  .filter(c -> c.getAlunos() > 100)
			  .forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("********** **********");
		
//		cursos.stream()
//			  .filter(c -> c.getAlunos() > 100)
//			  .map(c -> c.getAlunos())
//			  .forEach(x -> System.out.println(x));
		
//		cursos.stream()
//		  .filter(c -> c.getAlunos() > 100)
//		  .map(Curso::getAlunos)
//		  .forEach(System.out::println);
		
		System.out.println(
			cursos.stream()
			  .filter(c -> c.getAlunos() > 100)
			  .mapToInt(Curso::getAlunos)
			  .sum()
		  );
		
	}
}
