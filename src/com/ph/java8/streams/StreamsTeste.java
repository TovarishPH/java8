package com.ph.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Collectors;
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
		
		System.out.println("********** Exercícios **********");
		
//		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(System.out::println);
		
//		cursos.stream()
//			  .filter(c -> c.getAlunos() > 50)
//			  .forEach(c -> System.out.println(c.getNome()));
		
//		Stream<String> nomesDosCursos = cursos.stream().map(c -> c.getNome());
//		nomesDosCursos.forEach(System.out::println);
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		Optional<Curso> optional = cursos.stream()
			  .filter(c -> c.getAlunos() >= 100)
			  .findAny();
		
		cursos.stream()
			  .filter(c -> c.getAlunos() > 100)
			  .findAny()
			  .ifPresent(c -> System.out.println(c.getNome()));
		
//		Curso curso = optional.get();
//		Curso curso = optional.orElse(null);
//		System.out.println(curso.getNome());
		
		System.out.println("********** Coleções a partir de Streams **********");
		
		List<Curso> resultados = cursos.stream()
									.filter(c -> c.getAlunos() > 100)
									.collect(Collectors.toList());
		resultados.forEach(System.out::println);
		
		Map<String, Integer> mapa = cursos.stream()
										.filter(c -> c.getAlunos() > 100)
										.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		Optional<Curso> curso = cursos.stream()
			  .filter(c -> c.getAlunos() > 50)
			  .findFirst();
		System.out.println(curso.get().getNome());
		
		OptionalDouble media = cursos.stream().mapToInt(c -> c.getAlunos()).average();
		System.out.println(media);
		
		List<Curso> lista = cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		lista.forEach(System.out::println);
	}
}
