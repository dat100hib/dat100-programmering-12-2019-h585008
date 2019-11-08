package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private int lengde;
	private Innlegg[] innleggtabell;
	private int nesteLedige;
	
	
	public Blogg() {
		lengde = 20;
	}

	public Blogg(int lengde) {
		this.lengde = lengde;
		innleggtabell =  new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {
		
//		for(int i = 0; i < lengde; i++) {
//			if (innleggtabell[i] != null) {
//				Antall +=1;
//			}
//		}
//		
//		return Antall;
		
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int svar = -1;
		for(int i = 0; i < lengde; i++) {
			if(innlegg.erLik(innleggtabell[i])) {
				svar = i;
			}
		}
			return svar;
	}

	public boolean finnes(Innlegg innlegg) {

		boolean svar = false;
		for(int i = 0; i < lengde; i++) {
			
			if(innlegg.erLik(innleggtabell[i])) {
				svar = true;
			}
			
		}
		return svar;
	}
		
	public boolean ledigPlass() {
		
		boolean svar = false;
		if (nesteLedige < lengde) {
			svar = true;
		}
		return svar;
	}

	
	public boolean leggTil(Innlegg innlegg) {

		boolean svar = false;
		for (int i = 0; i < lengde; i++) {
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteLedige] = innlegg;
			nesteLedige++;
			svar = true;
		}
		}
			return svar;
		}
	
	
	public String toString() {
		
	
		String s = nesteLedige + "\n";
		for (int i = 0; i < lengde; i++) {
			s += innleggtabell[i].toString();
		}
		
		return s;
		
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}