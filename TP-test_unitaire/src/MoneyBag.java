import java.util.Vector ;


public class MoneyBag {
	
	private Vector<Money> fMonies = new Vector<Money> () ;
	
	MoneyBag (Money m1, Money m2){
		appendMoney(m1);
		appendMoney(m2);
	}
	
	MoneyBag(Money bag[]){
		for(int i = 0; i< bag.lenght; i++)
			appendMoney(bag[i]);
	}
	
	private void appendMoney(Money M){
		if (fMonies.isEmpty () ){
			fMonies.add(M);
		}else {
			int i = 0;
			while ((i < fMonies.size())
					)
				
		}
	}
			
}
