public class SortingHat {
	public static java.util.Scanner console = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		String s = ask("Ciao, inserisci il tuo nome");
		// String t = askNumber("Inserisci un numero");

		// randomizer(HashName(s));
		assegnazione(4);

	}

	// input. Array con nome e cognome di ogni membro del gruppo NOME COGNOME
	public static String ask(String prompt) {
		System.out.print(prompt + ": ");
		String answer = console.nextLine();
		return answer;
	}

	public static int askNumber(String prompt) {
		System.out.print(prompt + ": ");
		String answer = console.nextLine();
		int n = Integer.parseInt(answer);
		return n;
	}

	// 1. Il programma dovrà modificare tutte le entry eliminando lo spazio
	// 2. trasformare le entry in minuscolo
	// 3. per ogni entry che assegnerà un numero ad nome studente, seguendo una data
	// logica
	// 3a. codice 1° carattere + codice 2° carattere * 7^1 + codice 3° carattere *
	// 7^2 ecc
	// sum = c0 * 7^0 + c1 * 7^1 + c2 * 7^2 ecc
	public static int HashName(String name) {
		String noSpace = name.replace(" ", "").toLowerCase();
		int hash = 0;
		for (int i = 0; i < noSpace.length(); i++) {
			hash = hash + noSpace.codePointAt(i) * (int) Math.pow(7, i);
		}
		return hash;
	}

	public static double randomizer(int hash) {
		int numeroRand = (int) (Math.random() * 4);
		if (numeroRand == 3) {
			hash = hash + 3;
		}
		System.out.println(hash);
		System.out.println(numeroRand);
		return hash;

	}

	public static int assegnazione(int studente) {

		int[] Gryffindor = new int[5];
		int[] Slytherin = new int[5];
		int[] Hufflepuff = new int[5];
		int[] Ravenclaw = new int[5];

		int operazione = studente % 4;
		boolean gryffIsFull = false;
		boolean slytIsFull = false;
		boolean huffIsFull = false;
		boolean ravenIsFull = false;
		if (operazione == 0) {
			isFull(Gryffindor);

		} else if (operazione == 1) {
			for (int j = 0; j < Slytherin.length; j++) {
				if (Slytherin[j] == 0) {
				
					
					Slytherin[j] = studente;
					System.out.println("Slytherin");
					break;
				}
				
			}
		} else if (operazione == 2) {
			for (int k = 0; k < Hufflepuff.length; k++) {
				if (Hufflepuff[k] == 0) {
					Hufflepuff[k] = studente;
					System.out.println("HufflePuff");
					break;
				}
			}
		} else if (operazione == 3) {
			for (int l = 0; l < Ravenclaw.length; l++) {
				if (Ravenclaw[l] == 0) {
					Ravenclaw[l] = studente;
					System.out.println("Ravenclaw");
					break;
				}
			}
		}
    
		return 0;
	}

	public static boolean isFull(int[] casa){
		for (int i = 0; i < casa.length; i++) {
			if (casa[i] == 0) {
				casa[i] = studente;
				System.out.println(casa);
				break;
			}
			boolean full = true;
			return full;

	}



	// 4. come si generà un numero random (Math.random)?
	// 5. una volta su 4 (da 0 a 3) va' aggiunto il numero 3 al valore finale di una
	// delle entry

	// 6. assegnare ognuno a una casa dividendo il numero risultante per 4
	// ELENCO CASE: 0 - Gryffindor; 1 - Slytherin; 2 - Hufflepuff; 3 - Ravenclaw;
	// 7. impostare la grandezza massima di una casa e tiene conto di quanta gente
	// le è stata assegnata
	// 7a. se la casa è piena, lo studente viene assegnato alla prima casa vuota
	// "adiacente"
	// 7b. se tutte le case sono piene, gli studenti rimanenti vengono assegnati
	// tirando un random da 1 a 4, le case vengono riaperte, si assegna il primo
	// studente in più
	// la casa che ha ricevuto lo studente extra viene richiusa e si prosegue col
	// successivo studente extra
}
}
