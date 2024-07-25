package chapter11;

import java.util.HashMap;

//다음은 섯다게임에서 카드의 순위를 결정하는 등급목록(족보)이다. HashMap에 
//등급과 점수를 저장하는 registerJokbo()와 게임참가자의 점수를 계산해서 반환하는 
//getPoint()를 완성하시오.
//[참고] 섯다게임은 두 장의 카드의 숫자를 더한 값을 10으로 나눈 나머지가 높은 쪽이 이기는 게임이다. 그 외에
//도 특정 숫자로 구성된 카드로 이루어진 등급(족보)이 있어서 높은 등급의 카드가 이긴다.

	class SutdaDeck {
		final int CARD_NUM = 20;
		SutdaCard[] cards = new SutdaCard[CARD_NUM];
		int pos = 0; // 다음에 가져올 카드의 위치
		HashMap<String, Integer> jokbo = new HashMap(); // 족보를 저장할 HashMap<카드,점수>제너릭에는 무조건클래스

		SutdaDeck() {
			for (int i = 0; i < cards.length; i++) {
				int num = i % 10 + 1;
				boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
				cards[i] = new SutdaCard(num, isKwang);
			}
			registerJokbo();
		}

		void registerJokbo() {

			// (1) 아래의 로직에 맞게 코드를 작성하시오.
			// 1. jokbo(HashMap)에 족보를 저장한다. 두 카드의 값을 문자열로 붙여서key로, 점수를 value로 저장한다.

			jokbo.put("kk",4000);
			jokbo.put("1010",3100);
			jokbo.put("99", 3090);
			jokbo.put("88", 3080);
			jokbo.put("77", 3070);
			jokbo.put("66", 3060);
			jokbo.put("55", 3050);
			jokbo.put("44", 3040);
			jokbo.put("33", 3030);
			jokbo.put("22", 3020);
			jokbo.put("11", 3010);

			jokbo.put("12", 2060);
			jokbo.put("21", 2060);
			jokbo.put("14", 2050);
			jokbo.put("41", 2050);
			jokbo.put("19", 2040);
			jokbo.put("91", 2040);
			jokbo.put("110",2030);
			jokbo.put("101",2030);
			jokbo.put("410",2020);
			jokbo.put("104",2020);
			jokbo.put("46", 2010);
			jokbo.put("64", 2010);
		}

		int getPoint(Player p) {
			if (p == null)
				return 0;
			SutdaCard c1 = p.c1;
			SutdaCard c2 = p.c2;
			Integer result = 0;

			// (2) 아래의 로직에 맞게 코드를 작성하시오.
			// 1. 카드 두 장이 모두 광이면, jokbo에서 키를 "KK"로 해서 점수를 조회한다.
			// 2.두 카드의 숫자(num)로 jokbo에서 등급을 조회한다.
			// 3. 해당하는 등급이 없으면, 아래의 공식으로 점수를 계산한다.
			// (c1.num+ c2.num) % 10 + 1000 4. Player의 점수(point)에 계산한 값을 저장한다.

			if(c1.isKwang && c2.isKwang) {
				result = jokbo.get("kk");
			}else{
				String key = ""+c1.num+c2.num; //카드1과 카드2를 문자열로 더해주기 위해 ""+로 해줌
				if(jokbo.containsKey(key)) {
					result = jokbo.get(key);
				}else {
					result = (c1.num+c2.num)%10 +1000;
				}
			}
			p.point = result.intValue(); // player에 포인트를 넣어줌
			return result.intValue();
		}

		SutdaCard pick() throws Exception {
			SutdaCard c = null;
			if (0 <= pos && pos < CARD_NUM) {
				c = cards[pos];
				cards[pos++] = null;
			} else {
				throw new Exception("남아있는 카드가 없습니다.");
			}
			return c;
		}

		void shuffle() {
			for (int x = 0; x < CARD_NUM * 2; x++) {
				int i = (int) (Math.random() * CARD_NUM);
				int j = (int) (Math.random() * CARD_NUM);
				SutdaCard tmp = cards[i];
				cards[i] = cards[j];
				cards[j] = tmp;
			}
		}
	} // SutdaDeck

	class Player {

		String name;
		SutdaCard c1;
		SutdaCard c2;
		int point; // 카드의 등급에 따른 점수 - 새로 추가

		Player(String name, SutdaCard c1, SutdaCard c2) {
			this.name = name;
			this.c1 = c1;
			this.c2 = c2;
		}

		public String toString() {
			return "[" + name + "]" + c1.toString() + "," + c2.toString();
		}
	} // class Player

	class SutdaCard {
		int num;
		boolean isKwang;

		SutdaCard() {
			this(1, true);
		}

		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}

		public String toString() {
			return num + (isKwang ? "K" : "");
		}
	}
	public class Exam11_12 {
	public static void main(String[] args) throws Exception {

		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Player p1 = new Player("타짜", deck.pick(), deck.pick());
		Player p2 = new Player("고수", deck.pick(), deck.pick());
		System.out.println(p1 + " " + deck.getPoint(p1));
		System.out.println(p2 + " " + deck.getPoint(p2));

	}

}