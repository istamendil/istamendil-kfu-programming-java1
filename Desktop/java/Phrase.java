public class Phrase {
	public static void main (String [] args){
		String[] wordListOne = {"круглосуточный","трехзвенный","взаимный",
		"обоюдный выигрыш"};
		String[] wordListTwo = {"уполномоченный","ориенттированный","центральный"};
		String[] wordListThree = {"процесс","пункт загрузки","тип структуры"};
		int oneLenght = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLengt = wordListThree.length;
		int rand1 = (int) (Math.random() * oneLenght); // int округляет до целого 
		int rand2 = (int) (Math.random() * twoLenght);
		int rand3 = (int) (Math.random() * threeLengt);
		String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3]; // rand это номер слова
		System.out.println("все что нам нужно это -"+phrase);
	}
}