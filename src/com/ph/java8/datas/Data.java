package com.ph.java8.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadaNoRio = LocalDate.of(2016, Month.JUNE, 5);
		System.out.println(olimpiadaNoRio);

		int anos = hoje.getYear() - olimpiadaNoRio.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(olimpiadaNoRio, hoje);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(1));
		System.out.println(hoje.minusDays(3));
		
		System.out.println("********* ***********");
		
		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(1));
		System.out.println(hoje.plusDays(3));
		
		System.out.println("********* ***********");
		
		LocalDate proximaOlimpiada = olimpiadaNoRio.plusYears(4);
		System.out.println(proximaOlimpiada);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String valorFormatado = formatador.format(proximaOlimpiada);
		System.out.println(valorFormatado);
		
		System.out.println("********* LocaDateTime ***********");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth anoMes = YearMonth.of(2015, Month.JULY);
		System.out.println(anoMes);
		
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
		
		ZonedDateTime zoneTime = null;
	}
}
